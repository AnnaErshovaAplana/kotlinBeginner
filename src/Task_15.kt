/*
Создайте переменную, которая содержит лямбда выражение для вывода в консоль данных массива типа String.
 */
fun main(args: Array<String>){
    var lambdaExpression = {array: ArrayList<String> -> println(array.toString())}
    var arrayFamily: ArrayList<String> = arrayListOf("мама", "папа", "брат", "сестра")
    lambdaExpression(arrayFamily)
}