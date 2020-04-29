/* Напишите программу, запрашивающую имя пользователя и выводящую приветствие пользователя в консоль, после ввода имени.
*/
fun main(args: Array<String>) {
    println("Пожалуйста, введите свое имя:")
    var inputName: String? = readLine()
    //создаем переменную с типам String и передаем ей значение inputName
    var name: String = inputName.toString()
    //выводим приветствие
    println("Приветствуем тебя, $name!")
}