fun main() {
    val registration = Registration()
    registration.setEmail("vasya@user.ru")
    println("email = ${registration.getEmail()}")
    registration.setPassword("1234567")

    val matrix = arrayOf(
        intArrayOf(3, 8, 4),
        intArrayOf(2, 9, 5),
        intArrayOf(6, 4, 7),
    )
    println(searchEvenNumbers(matrix).contentToString())
    fillMatrix().forEach { println(it.contentToString()) }
    showPositiveNumbers(intArrayOf(1, -4, 5, 8, -6, 9))
}

/**
 * 2. Написать функцию поиска четных чисел двумерного массива размерностью 4 х 4.
 */
fun searchEvenNumbers(matrix: Array<IntArray>): IntArray {
    val list = mutableListOf<Int>()
    for (array in matrix) {
        array.forEach {
            if (it % 2 == 0) list.add(it)
        }
    }
    return list.toIntArray()
}

/**
 * 3. Написать функцию заполнения двумерного массива 4 х 4 числами от 1 до 16 включительно.
 */
fun fillMatrix(): Array<IntArray> {
    val matrix = arrayOf(
        IntArray(4),
        IntArray(4),
        IntArray(4),
        IntArray(4),
    )
    var number = 1
    for (array in matrix) {
        for (i in array.indices) {
            array[i] = number++
        }
    }
    return matrix
}

/**
 * 4. Написать функцию вывода в консоль положительных элементов массива.
 * Проверка на положительность числа выполняется локальной функцией внутри вышеуказанной.
 */
fun showPositiveNumbers(array: IntArray) {
    fun isPositive(number: Int) = number > 0
    array.forEach {
        if (isPositive(it)) println(it)
    }
}