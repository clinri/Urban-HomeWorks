fun main() {
    task1()
    task2()
    task3()
}

/**
 * 1. Дан список слов в произвольном порядке по алфавиту. Необходимо сгруппировать элементы по первому символу.
 */
fun task1() {
    val wordList = listOf("ананас", "апельсин", "банан", "баклажан", "груша", "грейпфрут", "вишня", "виноград")
    println(wordList.groupBy { it.first() })
}

/**
 * 2. Дан список строк. Необходимо сгруппировать его по длине строки.
 */
fun task2() {
    val wordList = listOf("ананас", "апельсин", "банан", "баклажан", "груша", "грейпфрут", "вишня", "виноград")
    println(wordList.groupBy { it.length })
}

/**
 * 3. Дан список телефонов по году выпуска phoneToYear. Не забывайте он может выглядеть как map(ключ - значение),
 * но на самом деле внутри себя будет содержать объект Pair.
 * Необходимо с группировать объекты по годам выпуска телефонов. Исходный список, например, такой.
 * val phoneToYear = listOf(
 * "Nexus One" to 2010,
 * "Pixel 2" to 2017,
 * "Pixel 4a" to 2020,
 * "iPhone 4" to 2010,
 * "iPhone X" to 2017,
 * "Galaxy Note 8" to 2017,
 * "Galaxy S11" to 2020
 * )
 */
fun task3() {
    val phoneToYear = listOf(
        "Nexus One" to 2010,
        "Pixel 2" to 2017,
        "Pixel 4a" to 2020,
        "iPhone 4" to 2010,
        "iPhone X" to 2017,
        "Galaxy Note 8" to 2017,
        "Galaxy S11" to 2020
    )
    println(phoneToYear.groupBy { it.second }.map { Pair(it.key, it.value.map { item -> item.first }) }.toMap())
}