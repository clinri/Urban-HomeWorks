import kotlinx.coroutines.*

suspend fun main() {
    task1()
}

/**
 * 1. Написать класс Person с полями в конструкторе name и age.
 * Создать список persons, в который включить несколько объектов этого класса.
 * Написать класс Weather с полями city, description, temp, создать список из нескольких объектов этого класса.
 * Создать список случайных чисел в диапазоне от 1 до 100 из 10 элементов.
 * Представим, что эти три списка мы планируем загрузить с сервера.
 * Необходимо написать обобщенную suspend – функцию, принимающую на вход список параметра T
 * и в результат возвращающую скачанный этот же список. Она будет имитировать скачивание данных.
 * Внутри функции с задержкой в 1000L выводить скачанные данные.
 * В главной функции нужно вызвать функции загрузки трех имеющихся списков: personList, weatherList, randoms.
 * Мы будем наблюдать, как идет процесс загрузки (элементы в функции выводятся).
 * Главный поток при их загрузке останавливается.
 * Когда загрузка заканчивается в консоль выходит фраза «Данные загружены» и выводятся все три списка.
 * В завершении выходит фраза «Программа завершена».
 */
suspend fun task1() = coroutineScope {
    val personList = listOf(
        Person("Александр", 32),
        Person("Петр", 23),
        Person("Филипп", 25),
        Person("Кирилл", 50),
    )
    val weatherList = listOf(
        Weather("Moscow", temp = 23),
        Weather("Lipetsk", temp = 25),
        Weather("Omsk", temp = 4),
        Weather("Kazan", temp = 15),
        Weather("Arhangelsk", temp = -2),
    )
    val randoms = List(10) {
        (1..100).random()
    }
    val jobs = listOf(
        launch { download(personList) },
        launch { download(weatherList) },
        launch { download(randoms) },
    )
    jobs.joinAll()
    println("Данные загружены")
    println(personList)
    println(weatherList)
    println(randoms)
    println("Программа завершена")
}

data class Person(
    val name: String,
    val age: Int,
)

data class Weather(
    val city: String,
    val description: String = "",
    val temp: Int,
)

suspend fun <T> download(list: List<T>): List<T> {
    for (item in list) {
        delay(1000L)
        println(item)
    }
    return list
}