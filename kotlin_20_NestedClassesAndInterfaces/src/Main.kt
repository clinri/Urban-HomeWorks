import java.util.*

fun main() {
    task1()
    println(task2("пр"))
    task3()
}

/**
 * 1. Создать класс Human(человек).
 * В нем создать несколько внутренних классов, например,
 * head(голова),
 * legs(ноги),
 * в каждом из классов напишите функции этой части тела.
 * В главной функции опишите модель человека, вызвав всю функциональность написанных классов.
 */
fun task1() {
    val human = Human("Вася")
    human.Head().think()
    human.Head().rotate()
    human.Legs().straighten()
    human.Legs().go()
}

/**
 * 2. Дан строковый массив "Иванов", "Петров", "Сидоров", "Процветов", "Протасов".
 * Написать программу поиска и вывода на экран элементов массива по вводимым символам.
 */
fun task2(findText: String): List<String> {
    val stringList = listOf("Иванов", "Петров", "Сидоров", "Процветов", "Протасов")
    return stringList.filter { it.lowercase(Locale.getDefault()).contains(findText) }
}

/**
 * 3. Создать массив целых чисел, в котором есть два нулевых элемента, не идущих подряд.
 * Посчитать количество элементов, которые находятся между нолями.
 */
fun task3() {
    val numberList = listOf(9, 5, 3, 0, 2, 5, 65, 50, 0, 4, 2, 66, 5, 34)
    val index1 = numberList.indexOf(0)
    val index2 = numberList.subList(index1 + 1, numberList.size).indexOf(0)
    println(index2)
}