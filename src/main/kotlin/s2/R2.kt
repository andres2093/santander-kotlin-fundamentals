package s2

fun main() {
    tipoDeTriangulo(5,5, 5)

    tipoDeDato(5)
}

fun tipoDeTriangulo(lado1: Int, lado2: Int, lado3: Int){

    if(lado1==lado2 && lado2==lado3){
        println("Es un triángulo equilátero")
    } else if(
        (lado1==lado2 && lado3!=lado1 ) ||
        (lado2==lado3 && lado1!=lado2 ) ||
        (lado3==lado1 && lado2!=lado3) ){
        println("Es un triángulo isóceles")
    } else{
        println("Es un triángulo escaleno")
    }
}

fun tipoDeDato(dato: Any){
    when(dato){
        is String -> println("Es una String")
        is Int -> println("Es un Entero")
        is Double -> println("Es un Doble")
        else -> println("Tipo de dato no soportado")
    }
}

