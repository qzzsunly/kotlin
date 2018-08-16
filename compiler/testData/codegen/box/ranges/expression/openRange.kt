// TODO: muted automatically, investigate should it be ran for JS_IR or not
// IGNORE_BACKEND: JS_IR

// Auto-generated by org.jetbrains.kotlin.generators.tests.GenerateRangesCodegenTestData. DO NOT EDIT!
// WITH_RUNTIME



fun box(): String {
    val list1 = ArrayList<Int>()
    val range1 = 1 until 5
    for (i in range1) {
        list1.add(i)
        if (list1.size > 23) break
    }
    if (list1 != listOf<Int>(1, 2, 3, 4)) {
        return "Wrong elements for 1 until 5: $list1"
    }

    val list2 = ArrayList<Int>()
    val range2 = 1.toByte() until 5.toByte()
    for (i in range2) {
        list2.add(i)
        if (list2.size > 23) break
    }
    if (list2 != listOf<Int>(1, 2, 3, 4)) {
        return "Wrong elements for 1.toByte() until 5.toByte(): $list2"
    }

    val list3 = ArrayList<Int>()
    val range3 = 1.toShort() until 5.toShort()
    for (i in range3) {
        list3.add(i)
        if (list3.size > 23) break
    }
    if (list3 != listOf<Int>(1, 2, 3, 4)) {
        return "Wrong elements for 1.toShort() until 5.toShort(): $list3"
    }

    val list4 = ArrayList<Long>()
    val range4 = 1L until 5L
    for (i in range4) {
        list4.add(i)
        if (list4.size > 23) break
    }
    if (list4 != listOf<Long>(1, 2, 3, 4)) {
        return "Wrong elements for 1L until 5L: $list4"
    }

    val list5 = ArrayList<Char>()
    val range5 = 'a' until 'd'
    for (i in range5) {
        list5.add(i)
        if (list5.size > 23) break
    }
    if (list5 != listOf<Char>('a', 'b', 'c')) {
        return "Wrong elements for 'a' until 'd': $list5"
    }

    val list6 = ArrayList<UInt>()
    val range6 = 1u until 5u
    for (i in range6) {
        list6.add(i)
        if (list6.size > 23) break
    }
    if (list6 != listOf<UInt>(1u, 2u, 3u, 4u)) {
        return "Wrong elements for 1u until 5u: $list6"
    }

    val list7 = ArrayList<UInt>()
    val range7 = 1u.toUByte() until 5u.toUByte()
    for (i in range7) {
        list7.add(i)
        if (list7.size > 23) break
    }
    if (list7 != listOf<UInt>(1u, 2u, 3u, 4u)) {
        return "Wrong elements for 1u.toUByte() until 5u.toUByte(): $list7"
    }

    val list8 = ArrayList<UInt>()
    val range8 = 1u.toUShort() until 5u.toUShort()
    for (i in range8) {
        list8.add(i)
        if (list8.size > 23) break
    }
    if (list8 != listOf<UInt>(1u, 2u, 3u, 4u)) {
        return "Wrong elements for 1u.toUShort() until 5u.toUShort(): $list8"
    }

    val list9 = ArrayList<ULong>()
    val range9 = 1uL until 5uL
    for (i in range9) {
        list9.add(i)
        if (list9.size > 23) break
    }
    if (list9 != listOf<ULong>(1u, 2u, 3u, 4u)) {
        return "Wrong elements for 1uL until 5uL: $list9"
    }

    return "OK"
}
