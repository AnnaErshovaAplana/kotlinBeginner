/*
Напишите функцию, принимающую на вход имена сотрудников и возвращающую их количество.
Используйте для этого vararg, из предыдущей темы.
 */

fun main(args: Array<String>) {
    println("Введите имена сотрудников через пробел для добавления в список:\n")
    val namesInString:List<String> = readLine().toString().split(" ")
    var names = emptyArray<String>() // Заполняем массив полученными именами
    for (name in namesInString) {
        names += name
    }
    println(countEmployees(*names))
}

fun countEmployees(vararg employees: String): String {
    val counter = employees.size
    return "Количество сотрудников в списке: $counter"
}
