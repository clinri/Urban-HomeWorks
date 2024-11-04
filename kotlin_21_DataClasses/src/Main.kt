fun main() {
    task1()
}

/**
 * Написать программу по продаже билетов в кино.
 * Пользователь покупает билет, в который заносятся данные названия фильма, места и времени начала сеанса.
 * Проданные билеты заносятся в массив архива. По желанию можно вывести все проданные билеты на фильм.
 */
fun task1() {
    val filmList = mutableListOf(
        Film("Кукутики", "19-00"),
        Film("Золушка", "20-00"),
    )
    val archiveTicket = mutableListOf<Ticket>()
    println("Хотите купить билет на фильм?")
    while (true) {
        when (readln().lowercase()) {
            "да" -> {
                println("предлагаем следующие фильмы:")
                for ((index, item) in filmList.withIndex()) {
                    println("${index + 1}. ${item.name} в ${item.time}, свободные места ${item.listPlaces}")
                }
                val variant = readln().toInt() - 1
                val selectedFilm = filmList[variant]
                val newTicket = Ticket(
                    selectedFilm.name,
                    selectedFilm.time,
                    selectedFilm.listPlaces.last()
                )
                println("куплен билет $newTicket")
                archiveTicket.add(newTicket)
                filmList[variant] =
                    selectedFilm.copy(
                        listPlaces = selectedFilm.listPlaces.dropLast(1)
                    )
                println("продолжить покупку билетов?")
            }

            else -> break
        }
    }
    println("купленные билеты:")
    archiveTicket.forEach {
        println(it)
    }
}