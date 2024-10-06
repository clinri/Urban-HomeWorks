fun main() {
    task1()
    task2()
    task3()
    task4()
}

/**
 * 1. Создать массив из 10 чисел с плавающей точкой. Найти произведение его элементов.
 */
fun task1() {
    val numbersArray = arrayOf(3.5, 4.2, 7.7, 4.6, 8.2, 6.5, 3.7, 9.2, 1.4, 5.6)
    var composition = 1.0
    for (n in numbersArray) {
        composition *= n
    }
    println(composition)
}

/**
 * 2. Создать массив из 8 целых чисел. Найти среднее арифметическое его элементов.
 */
fun task2() {
    val numberArray = arrayOf(2, 8, 4, 8, 5, 3, 8, 5)
    val averageNumbers = numberArray.average()
    println(averageNumbers)
}

/**
 * 3. Дан массив размерностью size. Вывести в том же порядке все четные числа из данного набора и количество K таких чисел.
 */
fun task3() {
    val numberArray = arrayOf(2, 8, 4, 8, 5, 3, 8, 5)
    var evenNumbersArray = emptyArray<Int>()
    for (n in numberArray) {
        if (n % 2 == 0) evenNumbersArray = evenNumbersArray.plus(n)
    }
    println("массив из ${evenNumbersArray.size} четных чисел ${evenNumbersArray.contentToString()}")
}

/**
 * 4. Дано целое число N(>0). Сформировать и вывести целочисленный массив размера N,
 * содержащий степени двойки от первой до N-й: 2,4,8,16,….
 */
fun task4() {
    val number = 10
    val array = LongArray(number)
    var element = 2L
    for (i in 0..< number) {
        array[i] = element
        element *= 2
    }
    println(array.contentToString())
}