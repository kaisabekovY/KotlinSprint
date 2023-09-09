package lesson_2_1

fun main() {
    val firstStudentMark : Int = 3
    val secondStudentMark : Int = 4
    val thirdStudentMark : Int = 3
    val fourthStudentMark : Int = 5

    val marksList : List<Int> = listOf(firstStudentMark,secondStudentMark,thirdStudentMark,fourthStudentMark)

    println(String.format("%.2f",marksList.average()))
}