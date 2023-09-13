package lesson_4_4

fun main() {
    val trainingDay: Int = 5

    var arms: Boolean = false
    var legs: Boolean = false
    var back: Boolean = false
    var abs: Boolean = false

    val turnToExercise: Boolean = trainingDay % 2 == 0

    println("""
      Упражнения для рук:   ${!turnToExercise}
      Упражнения для ног:   ${turnToExercise}
      Упражнения для спины: ${turnToExercise}
      Упражнения для пресса:${!turnToExercise}
    """.trimIndent())
}