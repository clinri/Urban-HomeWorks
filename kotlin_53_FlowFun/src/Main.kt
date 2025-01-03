import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlin.system.measureTimeMillis

/**
 * Программа создания паролей и присвоения их пользователям по идентификационному номеру.
 * · Необходимо написать функцию автогенерации пароля createPassword(): String,
 * состоящего из 6 символов с таким расчетом, что состоит из чисел и буквенных символов.
 * Каждый нечетный символ, если выпадает буква – должна быть в верхнем регистре.
 * · Написать функцию, которая будет формировать список таких паролей
 * getListOfPassword(input: String, length: Int): List<String>.
 * Входные параметры input – первый символ, с которого будет начинаться пароль.
 * Т.е. генерироваться будут разные, но помещать в список нужно только начинающиеся на эту букву.
 * length – количество паролей в списке.
 * · Написать функцию формирования списка по идентификатору getListId(length: Int),
 * где length – это количество пользователей, для которых будут создаваться пароли выше.
 * Список должен заполняться в следующей форме: [000001, 000002, 000003, …, N0000].
 * Планируется создание до 100000 паролей для такого же количества пользователей.
 * · Создать функции отправления данных вышеуказанных функций в поток
 * getIdFlow(length: Int),
 * getPasswordFlow(input: String, length: Int).
 * · В main при запуске программа спрашивает вводимые данные,
 * а именно для скольких пользователей нужно создать пароли и с какого символа они должны начинаться.
 * Эти данные вводятся с клавиатуры.
 * · Принимает данные из потоков по списку идентификаторов и списку паролей в зависимости от данных, которые мы введем.
 * · В итоге необходимо списки id и паролей объединить в ассоциативный список, где ключом будет id, значением – пароль.
 * · Вывести данные map и затраченное время на создание 100000 паролей к такому же количеству id.
 */


suspend fun main() {
    println("Введите количество")
    val length = readln().toInt()
    println("Введите первый символ ддя паролей")
    val firstSymbol = readln()
    val mapIdPass = generate(length, firstSymbol)
    println(mapIdPass)
    println("Создание 100 000 id и паролей")
    val time = measureTimeMillis {
        val mapIdPassFor100000 = generate(100_000, firstSymbol)
        println(mapIdPassFor100000)
    }
    println("Затрачено времени $time мс")
}

@OptIn(ExperimentalCoroutinesApi::class, DelicateCoroutinesApi::class)
private suspend fun generate(length: Int, firstSymbol: String): Map<String, String> {
    val idList = mutableListOf<String>()
    val passwordList = mutableListOf<String>()
    withContext(newSingleThreadContext("My_thread_context")) {
        launch {
            getIdFlow(length).collect {
                idList.add(it)
            }
        }
        launch {
            getPasswordFlow(firstSymbol, length).collect {
                passwordList.add(it)
            }
        }
    }.join()
    val mapIdPass = idList.zip(passwordList).toMap()
    return mapIdPass
}

fun createPassword(): String = List(6) { index: Int ->
    val allowedChars = ('a'..'z') + ('0'..'9')
    val item = allowedChars.random()
    if (item.isLetter() && (index + 1) % 2 != 0) item.uppercase()
    else item
}.joinToString("")

suspend fun getListOfPassword(input: String, length: Int): List<String> = flow {
    while (true) {
        val pass = createPassword()
        if (pass.first().toString() == input) emit(pass)
    }
}.take(length).toList()

fun getListId(length: Int) = List(length) { index: Int ->
    val zeroCount = 6 - (index + 1).toString().length
    var id = ""
    repeat(zeroCount) { id += "0" }
    id += index + 1
    id
}

fun getIdFlow(length: Int) = getListId(length).asFlow()

suspend fun getPasswordFlow(input: String, length: Int) = getListOfPassword(input, length).asFlow()