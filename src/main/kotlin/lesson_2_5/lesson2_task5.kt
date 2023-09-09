package lesson_2_5

import kotlin.math.pow

fun main() {
    var initialDepositAmount: Int = 70000
    val interestRate: Double = 16.7
    val amountOfYears: Int = 20

    val futureDepositAmount: Double = initialDepositAmount * (1 + interestRate / 100).pow(amountOfYears.toDouble())

    println("Total amount of deposit after $amountOfYears years = ${"%.3f".format(futureDepositAmount)}")
}