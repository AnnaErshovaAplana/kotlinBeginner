
abstract class Aircraft(var aircraftNumber: Int, _maxFlightDistance: Double, _tankCapacity: Double) {
    protected var maxFlightDistance: Double
    init {
        maxFlightDistance = _maxFlightDistance
    }
    protected var tankCapacity: Double
    init {
        tankCapacity = _tankCapacity
    }
    protected val fuelPer100Km: Double
        get() = (tankCapacity / maxFlightDistance) * 100

    open fun printInfo() {
        println("номер воздушного судна: ${this.aircraftNumber}\nмаксимальная дальность полета: ${this.maxFlightDistance}\nвместимость бака: ${this.tankCapacity}\nрасход топлива на 100 км: ${this.fuelPer100Km}")
    }
}