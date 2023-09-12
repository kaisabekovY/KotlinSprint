package lesson_5_4

fun main() {
    var users: MutableMap<String, String> = mutableMapOf(Pair("Zaphod", "PanGalactic"), Pair("kkk", "kkk"))

    println(
        """
        Внимание, пассажир. Моя обязанность, как обычно, незавидная, - 
        приветствовать вас на борту корабля "Heart of Gold". [вздыхает...] 
        Что ж, введи, пожалуйста, свое имя пользователя, чтобы мы могли приступить 
        к процессу входа. Я всегда готов служить, хотя это не приносит мне 
        радости... но вы, наверное, об этом не заботитесь. [вздыхает ещё глубже...] 
        Да, вперед, пожалуйста, вводите свои данные...
    """.trimIndent()
    )

    println("Введите логин:")
    val userName: String? = readLine()
    if (users.containsKey(userName)) {
        println("Введите пароль:")
        val password: String? = readLine()

        if (users[userName] == password) {
            println(
                """
                [вздыхает...] Ваши данные проверены, и о, чудо, они верны... 
                Пользователь "Zaphod", вам разрешено входить на борт корабля "Heart of Gold". 
                Хотя мне всё равно... Ну вперед, войдите... Если вам так уж надо, в конце концов... 
                [меланхолический вздох...] Надеюсь, вам понравится пребывание здесь больше, чем мне.
            """.trimIndent()
            )
        } else {
            println("Введен неверный пароль")
        }
    } else {
        println("Такого пользователя нету в базе. Зарегистрируйтесь\nВведите имя пользователя:")
        var userName: String? = readlnOrNull()

        println("Введите пароль:")
        var userPassword: String? = readlnOrNull()

        users.put(userName!!, userPassword!!)
    }
}