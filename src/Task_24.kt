/*
В классе main используйте какую либо коллекцию для хранения информации об имеющихся самолетах у авиакомпании.
Добавьте в эту коллекцию несколько самолетов используя имеющиеся классы моделей самолетов.

Напишите интерфейс для пользователя, где пользователь может в консоли запрашивать информацию о самолетах авиакомпании.
Интерфейс должен отображать список команд, а пользователь в свою очередь выбирает номер команды.
 */
fun main(args: Array<String>) {
    var cargoPlane: An124 = An124(7,10000.00, 3000.00)
    var transformer: Transformer = Transformer(5,13000.00, 7500.00)
    var largePassenger: Boeing747 = Boeing747(9,6000.00, 500.00)
    var aeroflotPark = emptyArray<Aircraft>()
    aeroflotPark += cargoPlane
    aeroflotPark += transformer
    aeroflotPark += largePassenger

    do {
        println("--- Добро пожаловать в базу авиапарка компании \"Аэрофлот\" ---")
        println("Выберите действие:\n1 - показать грузовые самолеты\n2 - показать пассажирские самолеты\n3 - показать все самолеты\n0 - выйти из программы")
        var action: Int = readLine().toString().toInt()
        when (action) {
            1 -> {      // показать грузовые самолеты
                var counter: Int = 0
                println("--- грузовые самолеты: ---")
                for (item in aeroflotPark) {
                    if ((item is An124) or (item is Transformer)) {
                        item.printInfo()
                        counter += 1
                    }
                }
                if(counter == 0){
                    println("У авиакомпании нет грузовых самолетов")
                }
        }
            2 -> {      // показать пассажирские самолеты
                var counter: Int = 0
                println("--- пассажирские самолеты: ---")
                for (item in aeroflotPark) {
                    if (item is Boeing747) {
                        item.printInfo()
                        counter += 1
                    }
                }
                if(counter == 0){
                    println("У авиакомпании нет пассажирских самолетов")
                }
            }
            3 -> {      // показать все самолеты
                println("--- все самолеты: ---")
                for (item in aeroflotPark) {
                    item.printInfo()
                }
            }
        }
    }
        while (action != 0)
    println("Вы завершаете программу")
}

