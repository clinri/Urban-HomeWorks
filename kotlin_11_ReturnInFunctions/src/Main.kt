fun main() {
    println(task1(5, 2, 7, 4, 5, 8, 6, 9))
    println(task2(intArrayOf(5, -2, 7, 4, -5, 8, 6, 9)).contentToString())
    val matrix = arrayOf(
        intArrayOf(3, 8, 4),
        intArrayOf(2, 9, 5),
        intArrayOf(6, 4, 7),
        intArrayOf(8, 1, 9),
    )
    println(task3(matrix, 4).contentToString())
}

/**
 * 1. Написать функцию, на вход которой поступает массив из произвольного количества элементов.
 * Данная функция проверяет, если в массиве локальные минимумы и возвращает число локальных минимумов.
 * (локальный минимум – это когда два соседних элемента больше того, что между ними, например, 5,2,7).
 */
fun task1(vararg numbers: Int): Int {
    var count = 0
    for (i in 1..numbers.size - 2) {
        if (numbers[i - 1] > numbers[i] && numbers[i + 1] > numbers[i]) {
            count++
        }
    }
    return count
}

/**
 * 2. Напишите функцию, в которой проверяется созданный Вами массив целых чисел.
 * Если в нем имеются отрицательные элементы, то необходимо увеличить этот элемент на единицу и вернуть массив.
 */
fun task2(array: IntArray): IntArray {
    val newArray = IntArray(array.size)
    for ((index, item) in array.withIndex()) {
        newArray[index] = if (item < 0) {
            item + 1
        } else {
            item
        }
    }
    return newArray
}

/**
 * 3. Дана матрица размера M×N и целое число K (1≤K≤M). Вывести элементы K-й строки данной матрицы.
 */
fun task3(matrix: Array<IntArray>, k: Int): IntArray {
    if (k in 1..matrix.size) {
        return matrix[k - 1]
    } else {
        throw Exception("k nit in 1..M")
    }
}