// !API_VERSION: 1.2
// COMMON_COROUTINES_TEST
// WITH_RUNTIME
// WITH_COROUTINES
import helpers.*
import COROUTINES_PACKAGE.*
import kotlin.test.assertEquals

suspend fun suspendHereOld() =
    if (COROUTINES_PACKAGE.intrinsics.coroutineContext != EmptyCoroutineContext)
        "${COROUTINES_PACKAGE.intrinsics.coroutineContext} != $EmptyCoroutineContext"
    else
        "OK"

suspend fun suspendHereNew() =
    if (coroutineContext != EmptyCoroutineContext)
        "${coroutineContext} != $EmptyCoroutineContext"
    else
        "OK"

suspend fun multipleArgsOld(a: Any, b: Any, c: Any) =
    if (COROUTINES_PACKAGE.intrinsics.coroutineContext != EmptyCoroutineContext)
        "${COROUTINES_PACKAGE.intrinsics.coroutineContext} != $EmptyCoroutineContext"
    else
        "OK"

suspend fun multipleArgsNew(a: Any, b: Any, c: Any) =
    if (coroutineContext != EmptyCoroutineContext)
        "${coroutineContext} != $EmptyCoroutineContext"
    else
        "OK"

fun builder(c: suspend () -> String): String {
    var fromSuspension: String? = null

    val continuation = object : Continuation<String> {
        override val context: CoroutineContext
            get() = EmptyCoroutineContext

        override fun resumeWithException(exception: Throwable) {
            fromSuspension = "Exception: ${exception}"
        }

        override fun resume(value: String) {
            fromSuspension = value
        }
    }

    c.startCoroutine(continuation)

    return fromSuspension as String
}

fun box(): String {
    var res = builder { suspendHereOld() }
    if (res != "OK") {
        return "fail 1 $res"
    }
    res = builder { multipleArgsOld(1, 1, 1) }
    if (res != "OK") {
        return "fail 2 $res"
    }
    res = builder {
        if (COROUTINES_PACKAGE.intrinsics.coroutineContext != EmptyCoroutineContext)
            "${COROUTINES_PACKAGE.intrinsics.coroutineContext} != $EmptyCoroutineContext"
        else
            "OK"
    }
    if (res != "OK") {
        return "fail 3 $res"
    }
    res = builder { suspendHereNew() }
    if (res != "OK") {
        return "fail 4 $res"
    }
    res = builder { multipleArgsNew(1, 1, 1) }
    if (res != "OK") {
        return "fail 5 $res"
    }
    res = builder {
        if (coroutineContext != EmptyCoroutineContext)
            "${coroutineContext} != $EmptyCoroutineContext"
        else
            "OK"
    }
    if (res != "OK") {
        return "fail 6 $res"
    }

    return "OK"
}
