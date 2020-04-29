/*
Напишите программу, которая запрашивает у пользователя два числа в переменные “a” и “b”.
Проверьте больше ли "a" чем "b" и получите результат в виде переменой типа boolean.
 */
fun main(args: Array<String>) {
    println("Введите число для cравнения \"а\":")
    var aString: String = readLine().toString()
    var a: Double = aString.toDouble()

    println("Введите число для cравнения \"b\":")
    var bString: String =  readLine().toString()
    var b: Double = bString.toDouble()
    //Проверяем больше ли "a" чем "b" и получаем результат в виде переменной типа boolean.
    var result: Boolean = a > b
    if(result){
        println("a больше b")
    }
    else {
        println("b больше a")
    }
}