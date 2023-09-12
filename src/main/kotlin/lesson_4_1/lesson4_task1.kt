package lesson_4_1

fun main() {
    val tables: Int = 13
    var reservedToday: Int = 13
    var reservedTomorrow: Int = 9

    val isAvailableToday: Boolean = tables != reservedToday
    val isAvailableTomorrow: Boolean = tables != reservedTomorrow

    print("[Доступность столиков на сегодня: $isAvailableToday],\n[Доступность столиков на завтра: $isAvailableTomorrow]")
}