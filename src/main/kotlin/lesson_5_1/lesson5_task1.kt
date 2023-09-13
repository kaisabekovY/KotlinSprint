package lesson_5_1

import kotlin.random.Random

fun main() {
    val firstNum: Int = Random.nextInt(10)
    val secondNum: Int = Random.nextInt(10)

    val result: Int = firstNum + secondNum

    println("What is the result of sum $firstNum and $secondNum?")

    val input: Int? = readlnOrNull()?.toInt()

    if(result == input) {
        println("Welcome!")
    } else {
        println("The sum of $firstNum and $secondNum is not equal to $input")
    }
}