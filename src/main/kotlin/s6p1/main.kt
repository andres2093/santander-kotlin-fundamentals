package s6p1

fun main() {
    // data class
    val movie1 = Movie("Toy story", "Animación", 16.0)
    println(movie1)
    println(movie1.name)
    movie1.createdAt = "1998"
    println(movie1)
    println(movie1.createdAt)

    val name1 = movie1.name

    println(name1)

    val(_, gender, duration ) = movie1
    println("$gender, $duration")

    // companion object
    val vehicle = Vehicle.create()
}

data class Movie (
    val name: String,
    val gender: String,
    val duration: Double
){
    var createdAt = ""
}

class Vehicle {
    init {
        println("Creado!!!")
    }

    companion object Factory {
        fun create(): Vehicle = Vehicle()
    }
}