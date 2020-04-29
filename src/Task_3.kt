/* Преобразуйте  var five: Char = '5' в String, Byte, Short, Int, Double, FLoat и Long*/

fun main(args: Array<String>) {
    var five: Char = '5'
    var fiveString: String = five.toString()
    var fiveByte: Byte = five.toByte()
    var fiveShort: Short = five.toShort()
    var fiveInt: Int = five.toInt()
    var fiveDouble: Double = five.toDouble()
    var fiveFloat = five.toFloat()
    var fiveLong = five.toLong()
}