class Transformer(aircraftNumber: Int, _maxFlightDistance: Double, _tankCapacity: Double) : Aircraft(aircraftNumber, _maxFlightDistance,
    _tankCapacity
), Cargo, Passenger {
    override val aircraftCapacity: Int
        get() = 100

    override fun printInfo() {
        super.printInfo()
        println("вместимость пассажиров: ${this.aircraftCapacity}\nгрузоподъемность: ${this.cargoCapacity}\n")
    }
}