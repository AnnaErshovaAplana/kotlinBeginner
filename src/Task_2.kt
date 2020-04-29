/*
Создайте две переменные типа String, содержащие "hello" и "aplana"
И выведите их в консоль так что бы получилось: hello aplana
 */
fun main(args: Array<String>) {
    var helloString = "hello"
    var aplanaString = " aplana"

    print("hello aplana")  // в консоли отобразится - hello aplana
    println()
    println(helloString + " aplana")    // в консоли отобразится - hello aplana
    println("$helloString aplana")    // в консоли отобразится - hello aplana
    println("${helloString + aplanaString}")    // в консоли отобразится - hello aplana
}
