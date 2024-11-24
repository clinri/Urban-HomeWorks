fun main() {
    task1()
    task2()
    task3()
    task4()
}

/**
 * 1. Дан список целых чисел. Необходимо найти сумму его элементов начиная с 3 заканчивая 9.
 */
fun task1() {
    val numbers = listOf(2, 4, 6, 9, 3, 6, 9, 4, 8, 4, 7, 4, 5, 7, 435, 8, 4, 67, 68)
    val sumFromThreeToNine = numbers.foldIndexed(0) { index, acc, i ->
        if (index in 3..9) acc + i else acc
    }
    println(sumFromThreeToNine)
}

/**
 * 2. Дан список целых чисел. С помощью функции fold вывести элементы этой коллекции в строку.
 * Т.е. входной список: val numbers = listOf(1, 2, 3, 4). Выходные данные: 1234
 */
fun task2() {
    val numbers = listOf(1, 2, 3, 4)
    val result = numbers.fold("") { acc, i -> acc + i }
    println(result)
}

/**
 * 3. Создать data класс Player, который характеризует игрока с именем, количеством заработанных очков и выигранных денег.
 * Создать список таких игроков с произвольными данными в конструкторе.
 * Посчитать и вывести в консоль общее количество очков и выигранных денег.
 */
fun task3() {
    val playerList = listOf(
        Player("Коля", 40, 300),
        Player("Петя", 50, 4500),
        Player("Вася", 34, 1200),
        Player("Маша", 90, 200),
        Player("Наташа", 76, 600),
    )
    val sumScoreAllPlayers = playerList.sumOf { it.score }
    val sumMoneyAllPlayers = playerList.sumOf { it.money }
    println("Общее количество очков $sumScoreAllPlayers, общее количество денег $sumMoneyAllPlayers")
}

data class Player(
    val name: String,
    val score: Int,
    val money: Int,
)

/**
 * 4. Дан список фруктов. Необходимо сгруппировать элементы этого списка по первому символу с таким расчетом,
 * чтобы в группу входили только фрукты с четной длиной строки каждого элемента.
 * Т.е. входной список такой: val fruits = listOf("Яблоко", "Абрикос", "Банан", "Виноград", "Вишня", "Кокос", "яблоко").
 * Выходной результат: {я=[Яблоко, яблоко], а=[], б=[], в=[Виноград], к=[]}
 */
fun task4() {
    val fruits = listOf("Яблоко", "Абрикос", "Банан", "Виноград", "Вишня", "Кокос", "яблоко")
    val result = fruits
        .groupBy { it.first().lowercase() }
        .map { map -> Pair(map.key, map.value.filter { it.length % 2 == 0 }) }
        .toMap()
    println(result)
}