/*
Напишите функцию, которая выводит в консоль информацию сотрудника (ФИО, Возраст, Должность и Семейное положение).
 С помощью перезагрузки функции, сделайте варианты, когда известны только:
- ФИО и Должность
- ФИО, Возраст и Должность
- ФИО, Семейное положение и Должность
- ФИО, Возраст, Семейное положение и Должность
 */

fun main(args: Array<String>) {
    getEmployeeInfo("Иванов Иван Иванович", "тракторист")
    println()
    getEmployeeInfo("Сидоров Игорь Петрович", 25,"маляр")
    println()
    getEmployeeInfo("Петрова Валерия Ивановна", true,"токарь")
    println()
    getEmployeeInfo("Дмитриев Сергей Арсеньевич",55, false,"банкир")
}

fun getEmployeeInfo(name: String, position: String) {  //- ФИО и Должность
    println("ФИО: $name")
    println("Должность: $position")
}

fun getEmployeeInfo(name: String, age: Int, position: String) {   //- ФИО, Возраст и Должность
    println("ФИО: $name")
    println("Возраст: $age")
    println("Должность: $position")
}

fun getEmployeeInfo(name: String, married: Boolean, position: String) {   //- ФИО, Семейное положение и Должность
    println("ФИО: $name")
    println("Замужем/женат: $married")
    println("Должность: $position")
}

fun getEmployeeInfo(name: String, age: Int, married: Boolean, position: String) {   //-ФИО, Возраст, Семейное положение и Должность
    println("ФИО: $name")
    println("Возраст: $age")
    println("Замужем/женат: $married")
    println("Должность: $position")
}

