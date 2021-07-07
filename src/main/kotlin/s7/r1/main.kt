package s7.r1

fun main() {
    val names: List<String?> = listOf("Name One", null, "Name Three")

    // .1
    // Por Condiciones
    names.forEach {
        if (it != null) {
            println(it)
        }
    }
    // Por safe call
    names.forEach { it?.let { println(it) } }
    println("--------------------")
    // .2
    //imprimir las casillas nulas
    names.forEach {
        val printString = it ?: "No se encontró nombre en esta casilla"
        println(printString)
    }
    println("--------------------")
    // .3
    val person = Person("Andres")
    println(person.getLastName())
    println(person.getFullName())
}
class Person(
    val name:String? = null,
    private val lastName:String? = null){

    fun getFullName(): String {
        val lName =  lastName ?: throw IllegalArgumentException("Necesitas apellidos")
        return "$name $lName"
    }
    fun fail(message: String): Nothing {
        throw IllegalArgumentException(message)
    }
    fun getLastName() : String {
        val lName = lastName ?: return "No se encontró apellido"
        return lName
    }
}