/*
Напишите функцию для переменных типа Double, возвращающую корень числа
 */

fun main(args: Array<String>){
var a = 5.5
    print(a.sqrt())
}
fun Double.sqrt():Double {
    return kotlin.math.sqrt(this)
}