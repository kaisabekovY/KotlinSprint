package lesson_3_1

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main() {
    val formatter: DateTimeFormatter = DateTimeFormatter.ofPattern("H")
    val hoursNow: Int = LocalDateTime.now().format(formatter).toInt()

    val name: String = "Eldar"
    val space: Char = ' '

    val greeting: String = when {
        hoursNow in 11..18 -> "Good Afternoon!"
        hoursNow in 19..24 -> "Good Evening!"
        else -> "Good Morning"
    }

    println("$greeting$space$name!")
}