fun main() {
    task1()
    println(task2(2585, 7975))
    task3()
}

/**
 * 1. Написать абстрактный класс «Службы экстренного реагирования».
 * У него есть свой конструктор, содержащий свойства name и phone.
 * Он содержит функцию, характеризующий его деятельность.
 * Напишите интерфейс, который содержит функцию getDescription, дающую описание той или иной службы или организации.
 */
fun task1() {
    val fireDepartment = FireDepartment("Служба 01", "101")
    val police = Police("Служба 02", "102")
    val listContainingDescription = listOf<ContainingDescription>(fireDepartment, police)
    for (service in listContainingDescription) {
        service.getDescription()
        when (service) {
            is FireDepartment -> service.reactionToEvent("ул. Космическая, д. 3")
            is Police -> service.reactionToEvent("ул. Ромашковая, д. 36")
        }
    }
}

/**
 * 2. Даны целые положительные числа A и B.
 * Найти их наибольший общий делитель (НОД), используя алгоритм Евклида:
 * НОД(A,B) = НОД(B, A mod B), если B≠0; НОД(A, 0) = A.
 */
fun task2(a: Int, b: Int): Int {
    return when {
        (a == 0 && b > 0) -> b
        (b == 0 && a > 0) -> a
        (a == b) -> a
        (a > 0 && b > 0) -> {
            var nod: Int
            var divider: Int
            var remainderOfDivision: Int
            if (a > b) {
                nod = b
                divider = a
            } else {
                nod = a
                divider = b
            }
            do {
                remainderOfDivision = divider % nod
                if (remainderOfDivision > 0) {
                    divider = nod
                    nod = remainderOfDivision
                }
            } while (remainderOfDivision > 0)
            nod
        }

        else -> 0
    }
}

/**
 * 3. Дан набор целых чисел. Найти второе максимальное число.
 */
fun task3() {
    val listNumbers = listOf(4, 8, 3, 2, 65, 50, 40)
    println(listNumbers.sortedDescending()[1])
}