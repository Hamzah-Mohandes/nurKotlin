import kotlin.random.Random.Default.nextInt

class Todo(
    val id: Int = nextInt(),
    var title: String = "",
    var description: String = "",
    var isDone: Boolean = false
)

class Todoapp {
    private val list = mutableListOf<Todo>()

    fun addTodo(title: String, description: String) {
        val todo = Todo(title = title, description = description)
        list.add(todo)
    }

    fun getTodos(): List<Todo> {
        return list
    }
}

fun main() {
    val todoApp = Todoapp()
    while (true) {
        println("1. Neue Aufgabe hinzuf gen")
        println("2. Aufgabenliste ansehen")
        println("3. Aufgabe erledigen")
        println("q. Beenden")
        print("Was m chtest du tun? ")
        when (readLine()!!) {
            "1" -> {
                print("Titel: ")
                val title = readLine()!!
                print("Beschreibung: ")
                val description = readLine()!!
                todoApp.addTodo(title, description)
            }
            "2" -> {
                val todos = todoApp.getTodos()
                if (todos.isEmpty()) {
                    println("Keine Aufgaben gefunden.")
                } else {
                    todos.forEachIndexed { index, todo ->
                        println("${index + 1}. ${todo.title} - ${todo.description}")
                    }
                }
            }

            "q" -> {
                println("Auf Wiedersehen!")
                return
            }
        }
    }
}