abstract class EmergencyResponseService(
    val name: String,
    val phone: String,
) {
    abstract fun reactionToEvent(address: String)
}