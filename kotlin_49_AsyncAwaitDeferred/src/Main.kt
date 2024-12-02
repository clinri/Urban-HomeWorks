import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main() {
    task1()
}

/**
 * 1. Написать функции getRandomList() создания списков рандомных чисел и символов.
 * Данные функции могут быть перегруженными.
 * Написать функцию распаковки списков unpack(), которые получаем из функций, описанных выше.
 * Она обобщенная, т.е. может принимать список разных типов.
 * Функция выводит в консоль элементы, но все через секундную задержку и в процессе ведет подсчет количества элементов
 * (для имитации длительной работы). Возвращает количество элементов списка.
 *
 * Также есть функция, объединяющая списки в один concatenate(). Учитывайте, что списки могут быть разных типов.
 * Она возвращает объект Pair<Int, MutableList<T>>,
 * где Int – количество элементов объединенного списка, MutableList<T> - сам список.
 *
 * В функции main:
 * 1. Получить списки целых чисел и символов с помощью функций getRandomList(), состоящие из 10 элементов.
 * 2. Оба списка необходимо асинхронно распаковать.
 * 3. Вывести в консоль общий размер полученного списка.
 * 4. Объединить их функцией concatenate() и вывести в консоль полученный список.
 * 5. Посчитать общее время затраченных операций.
 */
fun task1() {
    val allTime = measureTimeMillis {
        val intList = getRandomList(10, 0..20)
        val charList = getRandomList(10, 'a'..'z')
        runBlocking {
            val intListUnpack = async { unpack(intList) }
            val charListUnpack = async { unpack(charList) }
            println(intListUnpack.await() + charListUnpack.await())
        }
        val concatList = concatenate(intList, charList)
        println(concatList)
    }
    println("Затрачено $allTime миллисекунд")
}

fun getRandomList(size: Int, rangeInt: IntRange) = List(size) { rangeInt.random() }

fun getRandomList(size: Int, rangeChar: CharRange) = List(size) { rangeChar.random() }

suspend fun <T> unpack(list: List<T>): Int {
    list.forEach {
        delay(1000L)
        println(it)
    }
    return list.size
}

fun <T> concatenate(list1: List<T>, list2: List<T>): Pair<Int, MutableList<T>> {
    val newList = list1.plus(list2).toMutableList()
    return Pair(newList.size, newList)
}