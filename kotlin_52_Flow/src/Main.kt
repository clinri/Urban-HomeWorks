import kotlinx.coroutines.*
import kotlinx.coroutines.flow.asFlow

/**
 * Программа предоставления служебных номеров телефона сотрудникам компании.
 * · Создать класс Person с полями имени и должности в конструкторе. Переопределить функцию toString(),
 * возвращающую строку "Пользователь: $name, $role".
 * · Создать список persons из четырех объектов Person.
 * · Написать функцию getPersonsFlow(), отправляющую поток данных списка persons.
 * · Написать функцию getPhoneFlow(length: Int), которая создает номер телефона из начальной части «+7917»
 * и оставшаяся часть номера генерируется случайными числами. Весь номер конкатенируется в общую строку
 * и передается потоком данных. Параметр length: Int для количества номеров, которые нужно сгенерировать.
 * Он зависит от размера persons.
 * · В main создать два списка persons, phones, них будут добавляться данные из потока.
 * Написать две корутины для приема и добавления данных в вышеуказанные списки.
 * · Создать список personInfo, в нем объединить два списка.
 * · Вывести в консоль полученный список.
 * Результат должен быть примерно таким:
 * [Пользователь: Иван, developer, +79178524006, Пользователь: Петр, engineer, +79172604884, Пользователь: Дмитрий, doctor, +79177507354, Пользователь: София, military, +79177673026]
 */

@OptIn(ExperimentalCoroutinesApi::class, DelicateCoroutinesApi::class)
suspend fun main() {
    val persons = mutableListOf<Person>()
    val phones = mutableListOf<String>()
    withContext(newSingleThreadContext("My_thread_context")) {
        launch {
            getPersonsFlow().collect {
                persons.add(it)
            }
        }
        launch {
            getPhoneFlow().collect {
                phones.add(it)
            }
        }
    }.join()
    val personInfo = persons.zip(phones) { first, second -> "$first, $second, " }
    personInfo.onEach(::print)
}

val persons = listOf(
    Person("Василий", "Директор"),
    Person("Людмила", "Бухгалтер"),
    Person("Олег", "Инженер"),
    Person("Иван", "Охранник"),
)

fun getPersonsFlow() = persons.asFlow()

fun getPhoneFlow(length: Int = persons.size) = List(length) {
    var phone = "+7917"
    repeat(7) { phone += (0..9).random() }
    phone
}.asFlow()