class Police (
    name: String,
    phone: String,
) : EmergencyResponseService(name, phone), ContainingDescription {
    override fun reactionToEvent(address: String) {
        println("Полицейская машина выехала по адресу: $address")
    }

    override fun getDescription() {
        println("Полицейский участок \"$name\" принимает вызовы на номер $phone")
    }

}