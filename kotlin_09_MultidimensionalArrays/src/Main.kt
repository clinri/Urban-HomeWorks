import java.sql.Array

fun main() {
    task1()
    task2()
    task3()
    task4()
}

/**
 * 1. Найти минимальный элемент в целочисленном массиве размера 3 х 3.
 */
fun task1() {
    val multiArray = arrayOf(
        arrayOf(3, 8, 4),
        arrayOf(2, 9, 5),
        arrayOf(6, 4, 7),
    )
    val min = multiArray.map { it.min() }.min()
    println(min)
}

/**
 * 2. Создать матрицу размером 3 х 5. Найти элемент в этом массиве, который является средним(медиана).
 */
fun task2() {
    val multiArray = arrayOf(
        arrayOf(3, 8, 4),
        arrayOf(2, 9, 5),
        arrayOf(6, 4, 7),
        arrayOf(4, 7, 1),
        arrayOf(6, 3, 5),
    )
    val arrays = IntArray(3 * 5)
    var pos = 0
    for (array in multiArray) {
        for (element in array) {
            arrays[pos++] = element
        }
    }
    arrays.sort()
    val averageElement = arrays[arrays.size / 2]
    println(averageElement)
}

/**
 * 3. Дана матрица размером 5 х 5. Заполнить ее единицами в таком порядке:
 * 0 0 0 0 0
 * 0 0 0 0 0
 * 0 0 1 0 0
 * 0 1 1 1 0
 * 1 1 1 1 1
 */
fun task3() {
    var matrix = arrayOf(
        IntArray(5),
        IntArray(5),
        IntArray(5),
        IntArray(5),
        IntArray(5),
    )
    var offset = 0
    for (arrayIndex in matrix.size - 1 downTo 0) {
        for (index in offset..matrix[arrayIndex].size - 1 - offset) {
            matrix[arrayIndex][index] = 1
        }
        offset++
    }
    for (array in matrix) {
        for (element in array) {
            print("$element\t")
        }
        println()
    }
}

/**
 * 4. Дан набор целых чисел. Найти второе максимальное число.
 */
fun task4() {
    val array = arrayOf(3, 5, 6, 7, 9, 3, 5, 0, 8, 7, 5)
    array.sortDescending()
    val result = array[1]
    println(result)
}