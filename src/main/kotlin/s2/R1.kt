package s2

import kotlin.math.roundToInt

fun main(){
    val base = 20f
    val altura =4f
    val area = areaRectangulo(base,altura)
    println("el área del rectángulo es $area")




    val ancho = 2f
    val volumen = volumenPrisma(base,altura,ancho)
    println("el volumen del prisma es $volumen")





    imprimir("Reemplazo del primer valor")
    imprimir("Reemplazo del primer valor","Reemplazo del segundo valor")
    imprimir(valor2="Reemplazo del segundo valor")



    val promedio = promedio(tercera = 10f)
    println(promedio)
    println(promedio.roundToInt())

}

fun areaRectangulo(base: Float, altura: Float):Float{
    return base*altura
}

fun volumenPrisma(base: Float, altura:Float, ancho: Float):Float{
    return areaRectangulo(base,altura)*ancho
}

fun imprimir(
    valor: String = "Este es el primer valor por defecto",
    valor2: String = "Este es el segundo valor por defecto"){
    println(valor)
    println(valor2)
}

fun promedio(primera: Float = 8f,
             segunda: Float = 8f,
             tercera: Float): Float{
    return (primera + segunda + tercera)/3f
}

