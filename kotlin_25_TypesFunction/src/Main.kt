fun main() {
    println(factorial(6))
    println(powerTen(9))
    task3()
}

/**
 * 1. Написать программу, которая будет вычислять факториал числа с применением рекурсии.
 */
fun factorial(n: Int): Int {
    return if (n == 0) 1
    else n * factorial(n - 1)
}

/**
 * 2. Написать функцию, которая находит N-ю степень числа 10 с применением рекурсии.
 */
fun powerTen(pow: Int): Int {
    return if (pow == 0) 1
    else 10 * powerTen(pow - 1)
}

/**
 * 3. Дан массив val array = arrayOf(1, 2, 3, 4, 5, 6, 7).
 * Написать функцию, которая будет увеличивать элемент массива на единицу, находящийся через одну позицию.
 * Т.е. массив на выходе будет такой [2, 2, 4, 4, 6, 6, 8].
 */
fun task3() {
    val array = arrayOf(1, 2, 3, 4, 5, 6, 7)
    for (i in array.indices step 2) {
        array[i] += 1
    }
    println(array.contentToString())
}