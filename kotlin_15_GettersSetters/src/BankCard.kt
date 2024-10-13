/**
 * 1. Написать класс «Банковская карта». В нем создать свойства номера карты и код карты.
 * В главной функции мы можем получить доступ к номеру карты, но не можем к коду.
 * Есть функция, которая описывает, что данные карты будут доступны после ввода пароля.
 */
class BankCard {
    var numberCard = ""
    private val _password = "qwerty"
    private var _codeCard: Int = 0
    var codeCard: Int
        set(value) {
            _codeCard = value
        }
        get() {
            println("Для получения кода карты введите пароль.")
            val pass = readln()
            return if (pass == _password) {
                _codeCard
            } else {
                println("Введен не верный пароль")
                0
            }
        }
}