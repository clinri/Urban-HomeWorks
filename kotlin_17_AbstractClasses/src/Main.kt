fun main() {
    task1()
    println("==========")
    task2()
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