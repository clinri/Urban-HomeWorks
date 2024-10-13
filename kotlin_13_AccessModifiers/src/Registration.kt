class Registration {
    private var email = ""
    private var password = ""

    fun getEmail(): String = email.uppercase()

    fun setEmail(newEmail: String) {
        email = newEmail
    }

    fun setPassword(newPassword: String) {
        if (newPassword.length > 6) {
            password = newPassword
        } else {
            println("Длина пароля должна быть больше 6")
        }
    }
}
