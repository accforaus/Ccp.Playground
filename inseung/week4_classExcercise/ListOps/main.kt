fun main() {
    var list1 = CustomList (emptyList<Int>())
    var list2 = CustomList (emptyList<Int>())

    println(list1.append(list2) == CustomList(emptyList<Int>())) // Test1

    list1 = CustomList(arrayListOf(1, 2, 3, 4))
    println(list1.append(list2).equals(list1)) // Test2

    list1 = CustomList(arrayListOf(1, 2))
    list2 = CustomList(arrayListOf(2, 3, 4, 5))
    println(list1.append(list2).value == arrayListOf(1, 2, 2, 3, 4, 5)) // Test3

    list1 = CustomList(arrayListOf(1, 2, 3, 5))
    println(list1.filter { it % 2 == 1 }.value == arrayListOf(1, 3, 5)) // Test3

    list1 = CustomList(arrayListOf(1, 3, 5, 7))
    println(list1.map {o1 -> o1 + 1 }.value == arrayListOf(2, 4, 6, 8)) // Test4

    list1 = CustomList(arrayListOf(1, 2, 3, 4))
    println(list1.foldL(1, list1.value, {acc, now -> acc * now})) // Test5


    list1 = CustomList(arrayListOf(1, 3, 5, 7))
    println(list1.reverse().value == arrayListOf(7, 5, 3, 1)) // Test6

    println(list1.length()) // Test7
}

/*
null type List 에 대해서만 append 결과가 false 가 나옵니다(Test1, Test2). 왜그럴까요
 */