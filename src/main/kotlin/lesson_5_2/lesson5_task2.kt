package lesson_5_2

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

const val MIN_AGE = 18

fun main() {
    val formatter: DateTimeFormatter = DateTimeFormatter.ofPattern("Y")
    val currentYear: Int = LocalDateTime.now().format(formatter).toInt()

    println("Enter your year of birth")
    var yearOfBirth: Int? = readlnOrNull()?.toInt()
    if(yearOfBirth == null) yearOfBirth = 0

    if(currentYear - yearOfBirth >= MIN_AGE) {
        println("Показать экран со скрытым контентом")
    } else {
        println("Вам не исполнилось 18")
    }
}