package s7.r2

fun main() {
    // .1
    fun divide(num1:Int,num2:Int): Int{
        return try { num1/num2} catch (e : Exception){0}
    }

    println(divide(10,0))
    println(divide(10,2))

    // .2
    val me = Person(name = "Andres", visitedCities = listOf("Mexico", null, "Brasil"))

//    me.visitedCities?.forEach {
//        println("Cities -> ${it ?: throw IllegalArgumentException("Ciudad vacía")}")
//    }

    fun fail(message: String): Nothing {
        throw IllegalArgumentException(message)
    }

    val you = Person()
    val name = you.name ?: fail("No existe nombre")
    println(name)

}

data class Person(
    val name: String? = null,
    val visitedCities: List<String?>? =null
)
