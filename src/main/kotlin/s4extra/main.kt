package s4extra

abstract class Person(name: String) {
    init {
        println("Mi nombre es $name")
    }

    fun mostrarId(id: Int){
        println("Mi id es $id")
    }

    abstract fun mostrarEmpleo(empleo: String)
}

class Teacher(name: String) : Person(name) {

    override fun mostrarEmpleo(empleo: String) {
        println(empleo)
    }

}

fun main() {
    val andres = Teacher("Andres")
    andres.mostrarEmpleo("Programador")
    andres.mostrarId(123)
}