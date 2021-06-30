package s5

fun main() {
//    var saludo = { println("Andres") }
//
//    saludo

//    val suma = {a: Int, b: Int -> a + b }
//
//    println(suma(5, 5))
//
//    val presentarse: (String, Int) -> String = {name, age -> "Mi nombre es $name y tengo $age"}
//
//    println(presentarse("Andres", 28))

//    var square: (Int) -> Int = { it * it }
//    println(square(5))

//    FUNCION LAMBDA
    val saverGrade: (Double,Double) -> String = { expected: Double, saved: Double ->
        val percentage = saved / expected

        when {
            percentage > 1  -> "Ahorrador pro"
            percentage == 1.0   -> "Buen ahorrador"
            percentage < 1.0 && percentage >= 0.8 -> "Almost"
            else     -> "aprendiz saver"
        }
    }

//    println(saverGrade(100.0,120.0))

//    FUNCION ANONIMA
    val saverGrade2 = fun(expected: Double, saved: Double): String {
        val percentage = saved / expected

        return when {
            percentage > 1  -> "Ahorrador pro"
            percentage == 1.0   -> "Buen ahorrador"
            percentage < 1.0 && percentage >= 0.8 -> "Almost"
            else     -> "aprendiz saver"
        }
    }

//    println(saverGrade2(100.0,120.0))

//    Funciones de orden superior
    fun calculadora(a: Int, b: Int, operacion: (Int, Int) -> Int): Int {
        return operacion(a, b)
    }

//    val suma = calculadora(10, 5, fun(a: Int, b: Int) = a + b)

    fun suma(a: Int, b: Int) = a + b
    val suma = calculadora(10, 5, ::suma)

//    println(suma)

//    Reto 1
    getPromo(1000.0, "RORO")
    getPromo(1000.0, "PROMO2020")
    getPromo(1000.0, "NOIVA")
    getPromo(1000.0, "MINUS100")
    getPromo(1000.0, "HALFIVA")
}

fun getPromo(price: Double, coupon: String) {

    val getPrice: (Double, (Double) -> Double) -> Unit = { price, operation ->
        println("El precio actual de tu producto es ${operation(price)}")
    }

    val totalPrice = { price: Double -> price * 1.16 }
    val halfIva = { price: Double -> price * 1.08 }
    val noIva = { price: Double -> price }
    val ranges = { price: Double ->
        when (price) {
            in 0.0..1000.0 -> price * 1.12
            in 1000.0..2000.0 -> price * 1.04
            in 2000.0..4000.0 -> (price * 1.16) / 2
            else -> price / 3
        }
    }
    val minus100 = { price: Double -> price * 1.16 - 100 }


    when (coupon) {
        "PROMO2020" -> getPrice(price, ranges)
        "NOIVA" -> getPrice(price, noIva)
        "MINUS100" -> getPrice(price, minus100)
        "HALFIVA" -> getPrice(price, halfIva)
        else -> getPrice(price, totalPrice)
    }
}