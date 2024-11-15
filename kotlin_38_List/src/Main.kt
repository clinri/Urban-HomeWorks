fun main() {
    task1()
    task2()
    task3()
    task4()
    task5()
    task6()
}

/**
 * 1. Дан список целых чисел. Вывести в консоль первый элемент списка двумя способами: обратившись по индексу,
 * через стандартную функцию first().
 */
fun task1() {
    val numberList = listOf(3, 5, 78, 45, 57, 8, 34, 53, 676, 856, 75, 35)
    println(numberList[0])
    println(numberList.first())
}

/**
 * 2. Дан список целых чисел. Вывести в консоль среднее арифметическое элементов списка двумя способами:
 * в ручную – через цикл, с применением стандартной функции average().
 */
fun task2() {
    val numberList = listOf(3, 5, 78, 45, 57, 8, 34, 53, 676, 856, 75, 35)
    var sum = 0
    numberList.forEach { sum += it }
    println(sum / numberList.size.toDouble())
    println(numberList.average())
}

/**
 * 3. Дан список целых чисел. Вывести в консоль сумму элементов списка двумя способами:
 * в ручную – через цикл, с применением стандартной функции sum().
 */
fun task3() {
    val numberList = listOf(3, 5, 78, 45, 57, 8, 34, 53, 676, 856, 75, 35)
    var sum = 0
    numberList.forEach { sum += it }
    println(sum)
    println(numberList.sum())
}

/**
 * 4. Дан список целых чисел. Вывести в консоль количество элементов списка двумя способами:
 * в ручную – через цикл, с применением стандартной функции count().
 */
fun task4() {
    val numberList = listOf(3, 5, 78, 45, 57, 8, 34, 53, 676, 856, 75, 35)
    var count = 0
    numberList.forEach { count++ }
    println(count)
    println(numberList.count())
}

/**
 * 5. Дан список целых чисел. Вывести в консоль сумму двух последних элементов списка двумя способами:
 * в ручную – через цикл, с применением стандартной функции takeLast().
 */
fun task5() {
    val numberList = listOf(3, 5, 78, 45, 57, 8, 34, 53, 676, 856, 75, 35)
    var sum = 0
    for (index in numberList.lastIndex - 1..numberList.lastIndex) {
        sum += numberList[index]
    }
    println(sum)
    println(numberList.takeLast(2).sum())
}

/**
 * 6. Дан список целых чисел. Вывести в консоль сумму индексов элементов списка двумя способами:
 * в ручную – через цикл, с применением стандартной функции indices().
 */
fun task6() {
    val numberList = listOf(3, 5, 78, 45, 57, 8, 34, 53, 676, 856, 75, 35)
    var sum = 0
    for (index in numberList.indices) {
        sum += index
    }
    println(sum)
    println(numberList.indices.sum())
}