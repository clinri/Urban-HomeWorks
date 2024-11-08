fun main() {
    task1(5)
    task2()
    task3()
    task4()
}

/**
 * 1. Напишите функцию, которая запускает лямбду print() столько раз сколько будет указано в параметре count.
 * Например, чтобы передаваемое сообщение в print() выводилось count раз.
 */
fun task1(count: Int) {
    val print = { text: String -> println(text) }
    repeat(times = count) {
        print.invoke("Лямбда-выражения - это очень мощный инструмент")
    }
}

/**
 * 2. Напишите программу, реализующую лямбда-выражение для вычисления среднего арифметического списка чисел.
 */
fun task2() {
    val average = { numbers: Array<Int> ->
        numbers.sum() / numbers.size.toDouble()
    }
    val numberArray = arrayOf(3, 6, 3, 3, 8, 4, 7, 3, 7, 4, 8, 4, 1, 2)
    val result = average(numberArray)
    println("У массива ${numberArray.contentToString()} среднее арифметическое = $result")
}

/**
 * 3. Дан массив произвольного набора чисел. Отфильтруйте его, чтобы в нем остались только положительные числа.
 */
fun task3() {
    val numberArray = arrayOf(-5, 4, -9, 458, -34, 85, 855, 0, -58)
    val result = numberArray.filter { it > 0 }
    println(result)
}

/**
 * 4. Напишите программу, которая реализует лямбда-выражение для работы с массивом целых чисел таким образом,
 * что его четные элементы делятся на 2, нечетные – умножаются на 3.
 */
fun task4() {
    val transform = { num: Int ->
        if (num % 2 == 0) num / 2
        else num * 3
    }
    val numArray = arrayOf(3, 5, 7, 9, 4, 5, 4, 67856, 345, 8, 44, 47, 68, 32, 78, 5676)
    val result = numArray.map(transform)
    println(result)
}