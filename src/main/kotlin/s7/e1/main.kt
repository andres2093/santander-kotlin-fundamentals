package s7.e1

fun main() {
    var text: String? = "Hola"
    text = null

//    if (text != null && text.length > 0) {
//        println("nullableText tiene ${text.length} caracteres.")
//    } else {
//        println("nullableText esta vacio")
//    }

    println(text?.length)

//    If normal vs if ternario -> otros lenguajes de programación
//    var res
//    if(5 > 6){
//        res = "Si"
//    } else {
//        res = "no"
//    }
//
//    val res = 5 > 6 ? "Si" : "No";

    val nullableText3: String? = null

    val resultadoSinElvis = if (nullableText3 != null) nullableText3 else "Texto vacío"
    println("resultadoSinElvis: $resultadoSinElvis")

    val resultadoConElvis = nullableText3 ?: "Texto vacío"
    println("resultadoConElvis: $resultadoConElvis")

}