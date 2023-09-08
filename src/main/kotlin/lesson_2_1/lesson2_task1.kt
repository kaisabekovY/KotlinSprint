package lesson_2_1

fun main() {
    val firstStudentMark: Int = 3
    val secondStudentMark: Int = 4
    val thirdStudentMark: Int = 3
    val fourthStudentMark: Int = 5

    val averageMarkOfStudents: Double = (firstStudentMark+secondStudentMark+thirdStudentMark+fourthStudentMark).toDouble()/4

    println(String.format("%.2f",averageMarkOfStudents))
}