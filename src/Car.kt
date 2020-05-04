/*
Создайте data класс для автомобилей. Он должен содержать марку автомобиля, цвет и номер.
Выведите информацию об автомобилях в консоль.
 */

data class Car(var _brand: String, var _color: String, val _number: Int) {
    var brand: String = _brand
    var color: String = _color

    override fun toString(): String {
        return "brand = $brand\tcolor = $color\tnumber = $_number"
    }
}