fun main() {
    task1()
    task2()
    task3()
}

/**
 * 1. Создайте scope – функцию let, которая будет вызываться у строки.
 * В лямбда – выражении этой функции выводится в консоль сам объект и длина этой строки.
 */
fun task1() {
    "Привет мир".let {
        println(it)
        println(it.length)
    }
}

/**
 * 2. Создать класс City, в конструкторе передается название города и population(население).
 * В главной функции создать его экземпляр, в конструктор передать название,
 * через функцию apply объекту назначить население в любом количестве.
 * Всю информацию об объекте, созданного City вывести в консоль.
 */
fun task2() {
    val city = City("Липецк")
    city.apply { population = 500_000 }
    println(city)
}

data class City(
    val name: String,
    var population: Int = 0,
)

/**
 * 3. Дан массив целых чисел. С помощью scope – функции with вывести в консоль данный массив,
 * количество элементов массива, сумму элементов массива.
 */
fun task3() {
    val intArray = intArrayOf(1, 6, 44, 878, 45, 78, 5, 89, 3)
    with(intArray) {
        contentToString().let(::println)
        size.let(::println)
        sum().let(::println)
    }
}