/*
Создайте переменную, содержащую последовательность английского алфавита наоборот
 – начиная с последней буквы алфавита и заканчивая первой буквой.
 */
fun main(args: Array<String>) {
    var alphabetBackwards = 'z' downTo 'a'
    // проверяем, что в переменной нужная последовательность
    for (Char in alphabetBackwards) {
        println(Char)
    }
}