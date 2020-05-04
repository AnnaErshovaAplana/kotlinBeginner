class An124(aircraftNumber: Int, _maxFlightDistance: Double, _tankCapacity: Double) : Aircraft(aircraftNumber, _maxFlightDistance,
    _tankCapacity
), Cargo {
    override val cargoCapacity: Int
        get() = 6000

    override fun printInfo() {
        super.printInfo()
        println("грузоподъемность: ${this.cargoCapacity}\n")
    }
}