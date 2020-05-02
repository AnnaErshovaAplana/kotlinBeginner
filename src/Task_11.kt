/*
Напишите программу, в которой будет храниться информация по рабочим местам (при запуске программа создает несколько записей).
Используйте коллекцию map для хранения информации. Номера рабочих мест это ключи коллекции,
а значение — это ФИО сотрудника, занимающего данное место.
Добавьте несколько сотрудников в коллекцию и добавьте возможность для пользователя узнать кто занимает рабочее место по его номеру
 */

fun main(args: Array<String>) {
    val workers: MutableMap<Int, String> = mutableMapOf(1 to "Иванов Иван Иванович", 2 to "Сидоров Петр Васильевич", 3 to "Петрова Мария Ивановна")
    do {
        println(
            """Выберите действие:
        1 - Добавить сотрудника в коллекцию
        2 - Узнать кто занимает рабочее место по его номеру
        3 - Выйти из программы""")
        val action = readLine().toString().toInt()
        when (action) {     // Добавить сотрудников в коллекцию
            1 -> {
                println("Введите номер рабочего места")
                val newWorkplace: Int = readLine().toString().toInt()
                  if (workers.containsKey(newWorkplace)) {
                      println("Данное место уже занято сотрудником: ${workers.getValue(newWorkplace)}\n Хотите заменить сотрудника по данному месту?\n - да - нет")
                      val replaceWorker: String = readLine().toString()
                      if (replaceWorker == "да") {
                          println("Введите ФИО работника")
                          val newWorker: String = readLine().toString()
                          workers[newWorkplace] = newWorker
                          println("Работник $newWorker добавлен на место $newWorkplace")
                      }
                  }
                  else {
                        println("Введите ФИО работника")
                        val newWorker: String = readLine().toString()
                        workers.put(newWorkplace, newWorker)
                        println("Работник $newWorker добавлен на место $newWorkplace")
                    }
                }
            2 -> {      // Узнать кто занимает рабочее месте по его номеру
                println("Введите рабочее место работника")
                val workplace: Int = readLine().toString().toInt()
                if (workers.containsKey(workplace)) {
                   println("На месте $workplace работает сотрудник: ${workers.getValue(workplace)}")
                }
                else {
                    println("За местом $workplace нет закрепленных сотрудников. Хотите добавить сотрудника на место $workplace?\n- да - нет")
                    val replaceWorker: String = readLine().toString()
                    if (replaceWorker == "да") {
                        println("Введите ФИО работника")
                        val newWorker: String = readLine().toString()
                        workers[workplace] = newWorker
                        println("Работник $newWorker добавлен на место $workplace")
                    }
                }
            }
        }
    } while (action != 3)
        println("Вы завершили программу")
}