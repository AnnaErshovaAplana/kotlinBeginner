/*
Напишите программу для расчета дохода по вкладу. Пользователь вводит сумму вклада, длительность вклада (количество месяцев) и ежемесячный процент по вкладу.
Программа выводит в консоль информацию по каждому месяцу отдельно.
Информация отображает: на сколько будет увеличиваться вклад в этом месяце и итоговую сумму вклада в данном месяце.
 */
fun main(args: Array<String>){
    println("Введите сумму вклада")
    var depositSum: Double = readLine().toString().toDouble()
    println("Введите длительность вклада в месяцах")
    val depositDuration: Int = readLine().toString().toInt()
    println("Введите ежемесячный процент по вкладу")
    val depositMonthRate: Double = readLine().toString().toDouble() / 100

    for(i in 1 .. depositDuration) {
        val delta: Double = depositSum * depositMonthRate
        println("В $i-м месяце Ваш вклад увеличился на: ${String.format("%.2f",delta)}")
        depositSum += delta
        println("Итоговая сумма вклада в $i-м месяце: ${String.format("%.2f",depositSum)}\n")
    }
}