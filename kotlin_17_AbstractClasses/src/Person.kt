abstract class Person(
    val name: String,
    val surname: String,
    val age: Int,
) {
    abstract fun driveCar()
    abstract fun studySubject(nameSubject: String)
    abstract fun doTaskOnWork(taskName: String)

    fun relax() {
        println("$name $surname отдыхает, закрыв глаза.")
    }

    fun aboutPerson() {
        println("Имя: $name\nФамилия: $surname\nВозраст: $age")
    }
}

class Student(name: String, surname: String, age: Int) : Person(name, surname, age) {
    override fun driveCar() {
        println("$name $surname водит папину машину с осторожностью.")
    }

    override fun studySubject(nameSubject: String) {
        println("$name $surname изучает предмет \"$nameSubject\" в институте.")
    }

    override fun doTaskOnWork(taskName: String) {
        println("$name $surname выполняет задачу \"$taskName\" после института.")
    }
}

class Employee(name: String, surname: String, age: Int) : Person(name, surname, age) {
    override fun driveCar() {
        println("$name $surname водит рабочий автомобиль на заводе.")
    }

    override fun studySubject(nameSubject: String) {
        println("$name $surname изучает \"$nameSubject\" после работы.")
    }

    override fun doTaskOnWork(taskName: String) {
        println("$name $surname выполняет задачу \"$taskName\" в рабочее время.")
    }
}