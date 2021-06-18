package s2

import kotlin.math.pow

const val PI = 3.1416f
const val PHI = 1.618f

fun main() {
    val radius = 4f
    val area = circleArea(radius)
    println(area)

    printName("Andrés")

    printAge(28)

    getPi()

    val session = login("Andres", "1234")
    println("Usuario loggeado? $session")

    //correr area rectangulo con los valores por defecto
    println("Area con valores por defecto: ${rectangleArea()}")

    //Area de rectangulo con base seteada y altura por defecto
    println("Area con altura por defecto: ${rectangleArea(10.0)}")

    //Area de rectangulo con por defecto y altura seteada con named arguments
    println("Area con base por defecto: ${rectangleArea(height = 10.0)}")

    //setear base y altura con named arguments
    println("Area con datos determinados con named arguments: ${rectangleArea(height = 2.0,base=3.5)}")

    println("Area con datos determinados con named arguments: ${rectangleArea(2.0,3.5)}")


}

fun circleArea(radius: Float): Float{
    return PI*radius.pow(2)
}

fun printName(name: String){
    println("Mi nombre es $name")
}

fun printAge(age: Int){
    println("Tengo $age años")
}

fun getPi(): Float{
    return PI
}

// val session = login("Andres", "1234")
// println("Usuario loggeado? $session")

fun login(user: String, password: String): Boolean {
    fun validate(input: String): Boolean {
        if(input.isEmpty()){
            return false
        }
        return true
    }
    val userValidated = validate(user)
    val passValidate = validate(password)

    return userValidated && passValidate
}

fun rectangleArea(base: Double = 20.0, height: Double = 30.0): Double{
    return base*height
}