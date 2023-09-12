package lesson_5_3

import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    //Рандомные числа от 0 до включительно 100
    var firstWinningNumber: Int = Random.nextInt(1..100)
    var secondWinningNumber: Int = Random.nextInt(1..100)

    //Хранит числа для поиска их в массиве после ввода пользователем
    var list: MutableList<Int> = mutableListOf(firstWinningNumber, secondWinningNumber)

    //Считает количество угаданных чисел
    var countWins: Int = 0

    println("Введите 1-ое число:")
    val firstInput: Int? = readlnOrNull()?.toInt()

    println("Введите 2-ое число:")
    val secondInput: Int? = readlnOrNull()?.toInt()

    //Если число было угадано, то это число удаляется из массива, для того чтобы угаданное число нельзя было ввести дважды
    if (firstInput in list) {
        list.removeAt(if (list[0] == firstInput) 0 else 1)
        countWins++
    }

    if (secondInput in list) {
        countWins++
    }

    when (countWins) {
        0 -> println("Неудача! Крутите барабан!")
        1 -> println("Вы выиграли утешительный приз!")
        2 -> println("Поздравляем! Вы выиграли главный приз!")
    }

    println("Выигрышные числа: $firstWinningNumber и $secondWinningNumber")
}