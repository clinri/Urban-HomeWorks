fun main() {
    task1()
    task2()
    task3()
    task4()
    task5()
}

/**
 * 1. Дан список целых чисел от 1 до 20 включительно. Посчитать количество четных чисел списка,
 * начиная с 5 элемента до конца списка. Целесообразно использовать функции drop(), count().
 */
fun task1() {
    val numbers = (1..20).toList()
    val result = numbers.drop(4).count { it % 2 == 0 }
    println(result)
}

/**
 * 2. Дан список целых чисел от 1 до 20 включительно.
 * Посчитать сумму первых 7 чисел списка, Целесообразно использовать функции take(), sum().
 */
fun task2() {
    val numbers = (1..20).toList()
    val result = numbers.take(7).sum()
    println(result)
}

/**
 * 3. Дан список строк: {"one", "two", "three"}.
 * Необходимо получить и вывести в консоль список вида:  [o, n, e, t, w, o, t, h, r, e, e].
 * Целесообразно использовать функции map(), flattaen().
 */
fun task3() {
    val stringList = listOf("one", "two", "three")
    val result = stringList.map { it.toCharArray().toList() }.flatten()
    println(result)
}

/**
 * 4. Дан список строк. Найти строку максимальной длины. Целесообразно использовать агрегатные операции.
 */
fun task4() {
    val stringList = listOf("Кукушка", "Ворона", "Жираф", "Антилопа", "Крокодил")
    val result = stringList.maxBy { it.length }
    println(result)
}

/**
 * 5. Написать класс Product с полями название и количество в конструкторе.
 * Создать список продуктов, состоящий из нескольких объектов класса.
 * Посчитать общее количество продуктов, имеющихся на складе (в списке).
 * Целесообразно использовать функции map(), fold().
 */
fun task5() {
    val products = listOf(
        Product("Картофель", 4),
        Product("Помидор", 8),
        Product("Огурец", 23),
        Product("Капуста", 9),
        Product("Апельсин", 12),
    )
    val result = products.map { it.volume }.fold(0) { acc, i -> acc + i }
    println(result)
}

data class Product(
    val name: String,
    val volume: Int,
)