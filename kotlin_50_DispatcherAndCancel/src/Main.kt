import kotlinx.coroutines.*

fun main() {
    task1()
}

/**
 * 1. Написать класс Person с полями имени и зарплаты.
 * Создать список personList типа Person для их хранения.
 * Написать класс PersonManager, в котором будут функция добавления Person в список addPerson(person: Person).
 * Создать Map<Person, Int> resultList.
 * Написать функцию addPassword(), которая будет добавлять в созданный словарь Person и добавлять шестизначный пароль,
 * сгенерированный в этой функции в качестве значения.
 * Эта функция должна добавлять данные элементы с задержкой в 500L для имитации создания надежного пароля.
 * Написать функцию readDataPersonList(), выводящую данные созданного map в виде
 * "Сотрудник: ${i.key}; пароль: ${i.value}" с временной задержкой в 1000L.
 * В главной функции программа запускается с приветствия: "Программа работы с базой данных сотрудников"
 * и через секундную задержку предлагает выполнить порядок действий: "Добавить сотрудника:\n1. Да\n2. Нет".
 * В цикле можно добавлять бесконечное количество сотрудников,
 * вводя данные имени и зарплаты с консоли и используя функцию addPerson(person: Person).
 * После добавления каждого сотрудника, предлагать продолжение работы или выход с чтением базы данных:
 * "Добавить сотрудника:\n1. Да\n2. Прочитать базу данных"
 * В случае прекращения работы в функции main запускается корутина,
 * которая внутри выполняет функции добавления пароля сотруднику и вывода в консоль получившегося в результате map.
 * Эти функции описаны были выше.
 * Написать еще одну корутину, которая будет выполняться параллельно с той.
 * В ней указано условие отмены работы предыдущей корутины, это ввод с консоли значения равного «0».
 * Т.е. при вводе «0» добавление пароля и вывод данных прекращаются и выходит сообщение "Завершение полной работы".
 */
fun task1() {
    val personManager = PersonManager()
    runBlocking {
        launch {
            try {
                println("Программа работы с базой данных сотрудников")
                delay(1000L)
                println("Добавить сотрудника:\n1. Да\n2. Нет")
                when (readln()) {
                    "1" -> addPersons(personManager)
                    "2" -> return@launch
                }
                readDataBase(personManager)
            } finally {
                withContext(NonCancellable) {
                    println("Завершение полной работы")
                }
            }
        }
    }
}

fun addPersons(personManager: PersonManager) {
    while (true) {
        println("Введите имя")
        val name = readln()
        println("Введите зарплату")
        val salary = readln()
        personManager.addPerson(Person(name, salary.toInt()))
        println("Добавить сотрудника:\n1. Да\n2. Прочитать базу данных")
        when (readln()) {
            "1" -> addPersons(personManager)
            "2" -> break
            else -> {}
        }
    }
}

suspend fun readDataBase(personManager: PersonManager) = coroutineScope {
    val jobAddPasswordsAndReadData = launch {
        personManager.addPassword()
        personManager.readDataPersonList()
        cancel()
    }
    launch {
        println("Для отмены добавления паролей и вывода данных введите \"0\"")
        val command = withContext(Dispatchers.IO) { readln() }
        when (command) {
            "0" -> jobAddPasswordsAndReadData.cancelAndJoin()
            else -> {}
        }
    }
}

data class Person(
    val name: String,
    val salary: Int,
)

class PersonManager {
    private var personList = emptyList<Person>()
    private var resultList = emptyMap<Person, Int>()

    fun addPerson(person: Person) {
        personList = personList.plus(person)
    }

    suspend fun addPassword() {
        println("Генерация и добавления паролей каждому сотруднику.")
        personList.forEach {
            val generatedPassword = List(6) { (0..9).random() }.joinToString("").toInt()
            delay(500L)
            resultList = resultList.plus(Pair(it, generatedPassword))
        }
    }

    suspend fun readDataPersonList() {
        println("Вывод списка сотрудников:")
        resultList.forEach {
            println("Сотрудник: ${it.key}; пароль: ${it.value}")
            delay(1000L)
        }
        println("Вывод завершен, для завершение работы нажмите \"Enter\"")
    }
}