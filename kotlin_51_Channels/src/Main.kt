import kotlinx.coroutines.*
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.channels.produce
import kotlin.system.measureTimeMillis

suspend fun main() {
    task1()
    task2()
}

/**
 * 1. Создайте класс Storage – это хранилище, в котором находится текстовая переменная text,
 * в ней хранится басня Крылова «Мартышка и очки». В классе с функцией main необходимо написать функцию,
 * которая преобразует строку в список строк. Написать функцию getList(text: String),
 * которая отправляет данные этого списка в канал с задержкой 10L.
 *
 * В функции main необходимо получить эти данные и вернуть их в виде исходного текста,
 * сохранить результат в переменную stringResult. Посчитать время, затраченное на получение данных в main.
 * Вывести в консоль полученный результат в stringResult.
 */
suspend fun task1() {
    val storage = Storage()
    val stringList = storage.text.split("\n")
    coroutineScope {
        val channel = getList(stringList)
        val stringResult: String
        val time = measureTimeMillis {
            stringResult = getStringFromChannel(channel)
        }
        println("Затраченное время $time мс")
        println(stringResult)
    }
}

private suspend fun getStringFromChannel(channel: ReceiveChannel<String>): String {
    return buildList {
        channel.consumeEach { add(it) }
    }.joinToString("\n")
}

@OptIn(ExperimentalCoroutinesApi::class)
fun CoroutineScope.getList(stringList: List<String>): ReceiveChannel<String> = produce {
    stringList.forEach {
        delay(10L)
        send(it)
    }
    close()
}

/**
 * 2. Использовать тестовую переменную первой задачи. Кроме функции getList(text: String) и getStringList(text: String),
 * необходимо написать функцию modifiedList, объединяющую каналы и отправляет данные в новый канал,
 * которые представляют следующий вид, у каждого элемента списка берется первый элемент и переводится в верхний регистр.
 * В итоге результат объединения каналов со всеми преобразованиями в функции main возвращается в строку stringResult.
 *
 * Кроме того, необходимо полученную строку разбить и поместить в список <String>.
 * Вывести в консоль полученный список, состоящий из первых символов каждого слова,
 * затраченное время на вышеуказанные операции.
 */
suspend fun task2() {
    val storage = Storage()
    val stringList = storage.text.split("\n")
    coroutineScope {
        val time = measureTimeMillis {
            val channel = getList(stringList)
            val stringResult = getStringFromChannel(modifiedList(channel))
            println(stringResult)
            val firstLetters = stringResult.split("\n").joinToString("") {
                it.split(" ").map { word -> word[0] }.joinToString("")
            }
            println(firstLetters)
        }
        println("Затраченное время $time мс")
    }
}

@OptIn(ExperimentalCoroutinesApi::class)
fun CoroutineScope.modifiedList(channel: ReceiveChannel<String>): ReceiveChannel<String> = produce {
    channel.consumeEach {
        val itemsList = it.split(" ").mapIndexed { index, s -> if (index == 0) s.uppercase() else s }
        send(itemsList.joinToString(" "))
    }
}