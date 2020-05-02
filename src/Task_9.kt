/*
Создайте многомерный массив, где в первом массиве хранится названия каких-либо стран,
в следующем столицы данных стран и в последнем массиве используемая денежная единица.
Сохраните информацию минимум по 3 странам и выведите в консоль в виде:
Страна          Столица        Валюта
 */

fun main(args: Array<String>) {
    var countryCapitalCurrencyList = emptyArray<Array<String>>()
    countryCapitalCurrencyList += arrayOf("Россия","Англия","Китай","Франция")
    countryCapitalCurrencyList += arrayOf("Москва","Лондон","Пекин","Париж")
    countryCapitalCurrencyList += arrayOf("рубль","фунт","юань","евро")

    println("Страна\tСтолица\tВалюта")

    for (i in countryCapitalCurrencyList[0].indices) {
        println("${countryCapitalCurrencyList[0][i]}\t${countryCapitalCurrencyList[1][i]}\t${countryCapitalCurrencyList[2][i]}")
    }
}