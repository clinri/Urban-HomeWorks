fun main() {
    task1()
    task2()
}

/**
 * 1. Создать обобщенный класс States, который содержит функцию getAverage(),
 * возвращающую среднее значение массива чисел.
 * Класс имеет ограничение, работать может только с числовыми значениями, T:Number.
 */
fun task1() {
    val states = States(
        array = arrayOf(3, 2, 6, 3)
    )
    println("среднее значение = ${states.getAverage()}")
}

class States<T>(
    private val array: Array<T>,
) where T : Number {
    fun getAverage(): Double {
        return array.sumOf { it.toDouble() } / array.size
    }
}

/**
 * 2. Создать класс по имени GenericMethod и обобщенную функцию внутри класса по имени isItIncluded().
 * Функция isItIncluded() определяет, является ли объект членом массива.
 * Он может быть использован с любым типом объектов и массивов до тех пор, пока массив содержит объекты,
 * совместимые с типом искомого объекта.
 */
fun task2() {
    val genericMethod = GenericMethod(
        arrayOf("a", "абв", "собака")
    )
    val item = "б"
    println("Массив содержит элемент $item: ${genericMethod.isItIncluded(item)}")
}

class GenericMethod<A>(
    private val array: Array<A>,
) {
    fun <T> isItIncluded(item: T): Boolean where T : A {
        return array.any { it == item }
    }
}