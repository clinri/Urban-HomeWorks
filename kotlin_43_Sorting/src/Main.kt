fun main() {
    task1()
    task2()
    task3()
}

/**
 * 1. Создать класс Employee, в конструкторе передать свойства имени, возраста и зарплаты. Создать список сотрудников,
 * состоящий из 5 человек. Написать функции сортировки по именам, возрасту и зарплате.
 */
fun task1() {
    val employees = listOf(
        Employee("Петр", 30, 25_000),
        Employee("Александр", 20, 35_000),
        Employee("Федор", 25, 28_000),
        Employee("Филипп", 35, 34_000),
        Employee("Артемий", 39, 44_000),
    )
    val sortedByName = employees.sortedBy { it.name }
    println(sortedByName)
    val sortedByAge = employees.sortedBy { it.age }
    println(sortedByAge)
    val sortedBySalary = employees.sortedBy { it.salary }
    println(sortedBySalary)
}

data class Employee(
    val name: String,
    val age: Int,
    val salary: Int,
)

/**
 * 2. Дана матрица целых чисел размерностью 3х4. Отсортировать ее строки по возрастанию.
 */
fun task2() {
    val matrix = listOf(
        listOf(4, 6, 3, 2),
        listOf(0, 6, 8, 3),
        listOf(5, 3, 8, 2),
    )
    val sortedMatrix = matrix.sortedBy { it.sum() }
    println(sortedMatrix)
}

/**
 * 3. Дана матрица целых чисел размерностью 3х4. Проверить, являются ли внутренние массивы матрицы пилообразными,
 * т.е. рядом с элементом массива находятся соседи большие или меньшие его.
 * Необходимо вывести количество пилообразных массивов и сами массивы.
 */
fun task3() {
    val matrix = listOf(
        listOf(4, 6, 3, 2),
        listOf(0, 6, 4, 5),
        listOf(5, 3, 8, 2),
    )
    val asSawLists = matrix.filter { it.asSaw() }
    println("количество пилообразных массивов: ${asSawLists.size}")
    asSawLists.forEach(::println)

}

fun List<Int>.asSaw(): Boolean {
    var previousCompare: Boolean = this[0] > this[1]
    for (index in 1 until this.lastIndex) {
        if (previousCompare == this[index] > this[index + 1]) return false
        else previousCompare = !previousCompare
    }
    return true
}