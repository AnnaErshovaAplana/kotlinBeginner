/*
Создадим наследника класса Aircraft с названием Boeing747 и добавим ему свойство, обозначающее вместимость пассажиров
 */

class Boeing747(aircraftNumber: Int, _maxFlightDistance: Double, _tankCapacity: Double) : Aircraft(aircraftNumber, _maxFlightDistance,
    _tankCapacity), Passenger {
    override val aircraftCapacity: Int
        init {
            aircraftCapacity = 200
        }
    override fun printInfo() {
        super.printInfo()
        println("вместимость пассажиров: ${this.aircraftCapacity}\n")
    }
}