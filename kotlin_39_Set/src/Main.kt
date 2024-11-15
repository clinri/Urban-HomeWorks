fun main() {
    task1()
    task2()
    task3()
    task4()
}

/**
 * 1. Разбить созданный набор на две коллекции, чтобы в одной содержались четные элементы, в другой – нечетные.
 */
fun task1() {
    val numberSet = setOf(4, 87, 5, 42, 78, 45, 754, 67, 63, 34, 51)
    val evenCollection = numberSet.filter { it % 2 == 0 }.toSet()
    val oddCollection = numberSet subtract evenCollection
    println(numberSet)
    println(evenCollection)
    println(oddCollection)
}

/**
 * 2. Дан набор целых чисел.
 * Необходимо создать новое множество в который будут помещены элементы прежнего умноженные на два,
 * но с условием, что попадают в набор только элемент кратные пяти после умножения.
 */
fun task2() {
    val numberSet = setOf(4, 87, 5, 42, 78, 45, 754, 67, 63, 34, 51)
    val newSet = numberSet.map { it * 2 }.filter { it % 5 == 0 }.toSet()
    println(numberSet)
    println(newSet)
}

/**
 * 3. Создать функцию removeDuplicates (collection: Collection<T>?),
 * которая будет возвращать набор неповторяющихся элементов.
 * Обратите внимание, что в параметры функции передан элемент Collection параметризованного типа.
 */
fun task3() {
    val numberList = listOf(4, 5, 7, 5, 5, 7, 45, 8, 9, 456, 8)
    val newSet = removeDuplicates(numberList)
    println(numberList)
    println(newSet)
}

fun <T> removeDuplicates(collection: Collection<T>?): Set<T>? {
    return collection?.toSet()
}

/**
 * 4. Дан массив целых чисел. Нужно переместить все нули в конец массива, сохранив порядок остальных элементов.
 * Т.е. исходный массив 0, 6, 0, 0, 2, 0, 0, 0, 1, 0, 5, 0 Результат: 6, 2, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0
 */
fun task4() {
    val numberArray = arrayListOf(0, 6, 0, 0, 2, 0, 0, 0, 1, 0, 5, 0)
    println(numberArray)
    val countZero = numberArray.count { it == 0 }
    numberArray.removeIf { it == 0 }
    val newArray = numberArray.apply {
        repeat(countZero) { add(0) }
    }
    println(newArray)
}