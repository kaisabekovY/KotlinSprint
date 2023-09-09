package lesson_2_2

fun main() {
    var employeesNumber : Int = 50
    var employeeSalary : Int = 30000
    var internsNumber : Int = 20
    var internsSalary : Int = 20000

    val salaryTotalOfEmployees : Int = employeeSalary * employeesNumber
    val salaryTotalOfInterns : Int = internsSalary * internsNumber
    val totalExpenseOfCompany : Int = salaryTotalOfEmployees + salaryTotalOfInterns

    //Sum new employees
    employeesNumber += internsNumber

    val averageSalaryPerEmployee : Int = totalExpenseOfCompany / employeesNumber

    println("Overall expenses before new employees: $salaryTotalOfEmployees")
    println("Overall expenses after new employees : $totalExpenseOfCompany")
    println("Average salary per employee: $averageSalaryPerEmployee")
}