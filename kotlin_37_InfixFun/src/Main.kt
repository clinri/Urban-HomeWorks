fun main() {
    task1()
    task2()
    task3()
}

/**
 * 1. Написать четыре инфиксных функции: сложения, вычитания, умножения и деления.
 * В функции main применить их для разных операндов, результат вывести в консоль.
 */
fun task1() {
    println(3 plus 2)
    println(16 minus 6)
    println(6 multiply 4)
    println(8 divide 2)
}

infix fun Int.plus(operand: Int): Int {
    return this + operand
}

infix fun Int.minus(operand: Int): Int {
    return this - operand
}

infix fun Int.multiply(operand: Int): Int {
    return this * operand
}

infix fun Int.divide(operand: Int): Int {
    return this / operand
}

/**
 * 2. Написать класс Person. В конструктор он принимает свойство имени.
 * Внутри класса есть инфиксная функция say, которая будет передавать сообщение объекта этого класса,
 * переданное в параметр. Сообщение внутри функции выводится с помощью println.
 */
fun task2() {
    val person = Person("Саша")
    person say "Всем привет"
    person.say("Давайте играть")
}

class Person(private val name: String) {
    infix fun say(speech: String) {
        println("$name сказал \"$speech\"")
    }
}

/**
 * 3. Создать data класс Point(точка), характеризующее место объекта.
 * Написать две инфиксные функции, расширяющие этот класс.
 * Они характеризуют расположение одной точки относительно другой – isAbove() – описывает ситуацию,
 * когда одна точка выше другой, isRightOf – описывает ситуацию, когда одна точка правее другой.
 * В функции main создать два объекта Point и сравнить их расположение, применив вышеуказанные функции.
 */
fun task3() {
    val pointOne = Point(3, 4)
    val pointTwo = Point(5, 1)
    println(pointOne isAbove pointTwo)
    println(pointTwo isRightOf pointOne)
}

data class Point(val x: Int, val y: Int)

infix fun Point.isAbove(point: Point): Boolean {
    return (this.y > point.y)
}

infix fun Point.isRightOf(point: Point): Boolean {
    return (this.x > point.y)
}