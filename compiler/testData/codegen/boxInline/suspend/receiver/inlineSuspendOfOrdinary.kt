// FILE: test.kt
// COMMON_COROUTINES_TEST
// WITH_RUNTIME
// NO_CHECK_LAMBDA_INLINING

import COROUTINES_PACKAGE.*

// Block is allowed to be called inside the body of owner inline function
// suspend calls possible inside lambda matching to the parameter

class Controller {
    var res = "FAIL 1"

    suspend inline fun test(c: Controller.() -> Unit) {
        c()
    }

    inline fun transform(crossinline c: suspend Controller.() -> Unit) {
        builder(this) { c() }
    }
}

fun builder(controller: Controller, c: suspend Controller.() -> Unit) {
    c.startCoroutine(controller, object: Continuation<Unit> {
        override val context: CoroutineContext
            get() = EmptyCoroutineContext

        override fun resume(value: Unit) {
        }

        override fun resumeWithException(exception: Throwable) {
            throw exception
        }
    })
}

// FILE: box.kt

import COROUTINES_PACKAGE.*

suspend fun calculate() = "OK"

fun box() : String {
    val controller = Controller()
    builder(controller) {
        test {
            res = calculate()
        }
    }
    if (controller.res != "OK") return controller.res
    builder(controller) {
        test {
            transform {
                test {
                    res = calculate()
                }
            }
        }
    }
    return controller.res
}
