/*
Создайте data класс для автомобилей. Он должен содержать марку автомобиля, цвет и номер.
Выведите информацию об автомобилях в консоль.
 */

fun main(args: Array<String>) {
    val audi: Car = Car("audi","green", 56)
    val bmw: Car = Car("bmw","red", 4)
    val volvo: Car = Car("volvo","yellow", 33)
    val volkswagen: Car = Car("volkswagen","white", 97)
    println(audi.toString())
    println(bmw.toString())
    println(volvo.toString())
    println(volkswagen.toString())
}
