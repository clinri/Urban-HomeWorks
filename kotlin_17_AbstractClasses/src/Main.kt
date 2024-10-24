fun main() {
    task1()
    println("==========")
    task2()
    println("==========")
    println(task3(1, 8.9))
    println(task3(2, 8.9))
    println(task3(3, 8.9))
    println(task3(4, 8.9))
    println(task3(5, 8.9))
}

/**
 * 1. Написать абстрактный класс Shop(магазин).
 * Написать несколько свойств класса, две абстрактные функции и одну обычную, характеризующих работу магазина.
 * Создать два класса наследника магазин Magnit и Pyaterochka. Написать реализацию функций.
 */
fun task1() {
    val magnit = Magnit("Магнит", 10)
    magnit.saleProduct("Помидоры")
    magnit.paySalary()
    println("-------")
    val pyaterochka = Pyaterochka("Пятерочка", 30)
    pyaterochka.saleProduct("Абрикосы")
    pyaterochka.paySalary()
}

/**
 * 2. Написать абстрактный класс Person. В конструкторе передать несколько свойств, например, имени, фамилии, возраста.
 * Написать абстрактные функции, характеризующие деятельность объекта класса и одну или несколько обычных.
 * Создать два класса наследника Student и Employee. Написать реализацию функций.
 */
fun task2() {
    val student = Student("Иван", "Петров", 18)
    student.aboutPerson()
    student.driveCar()
    student.studySubject("Философия")
    student.doTaskOnWork("Доставка продуктов")
    student.relax()
    println("-------")
    val employee = Employee("Константин", "Федоров", 42)
    employee.aboutPerson()
    employee.driveCar()
    employee.doTaskOnWork("Подготовка годовой финансовой отчетности")
    employee.studySubject("Веб разработка")
    employee.relax()
}

/**
 * 3. Единицы длины пронумерованы следующим образом:
 * 1 — дециметр, 2 — километр, 3 — метр, 4 — миллиметр, 5 — сантиметр.
 * Дан номер единицы длины (целое число в диапазоне 1–5) и длина отрезка в метрах (дробное число).
 * Найти длину отрезка в тех величинах, под номером которых они находятся.
 */
fun task3(numberUnitLength: Int, lengthInMeter: Double): Double {
    if (numberUnitLength !in 1..5) throw Exception("Недопустимый номер единицы длины")
    return when (numberUnitLength) {
        1 -> lengthInMeter * 10
        2 -> lengthInMeter / 1000
        3 -> lengthInMeter
        4 -> lengthInMeter * 1000
        5 -> lengthInMeter * 100
        else -> throw Exception("Недопустимый номер единицы длины")
    }
}