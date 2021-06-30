package s4extra

class Estudiante(private val name: String){
    var asistencia = false
        set(value) {
            println("$name $value")
            field = value
        }
}

interface MyInterface {
    val estudiantes: Collection<Estudiante>

    fun darClase(materia: String)

    fun pasarAsistencia() {
        estudiantes.map { estudiate -> estudiate.asistencia = true }
    }
}

abstract class Persona(name: String) {
    init {
        println("Mi nombre es $name")
    }

    fun mostrarId(id: Int){
        println("Mi id es $id")
    }

    abstract fun mostrarEmpleo(empleo: String)
}

class Maestro(name: String, override val estudiantes: Collection<Estudiante>) : Persona(name), MyInterface {

    override fun mostrarEmpleo(empleo: String) {
        println(empleo)
    }

    override fun darClase(materia: String) {
        println("Dando clase de $materia")
    }

}

fun main() {
    val estudiantes = listOf(Estudiante("Carlos"), Estudiante("Lorena"))

    val andres = Maestro("Andres", estudiantes)
    andres.mostrarEmpleo("Programador")
    andres.mostrarId(123)

    andres.darClase("POO")
    andres.pasarAsistencia()
}