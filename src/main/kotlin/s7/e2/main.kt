package s7.e2

import s7.r1.Person

fun main() {
//    throw Exception("Excepción genérica")

//    val v = "bedu.org"
//    v.toInt()

//    try {
//        val v = "bedu.org"
//        v.toInt()
//    } catch(e: NumberFormatException) {
//        e.printStackTrace()
//        println("No se pudo convertir, hubo un error: $e")
//    } finally {
//        println("Proceso terminado")
//    }

//    try {
////        val v = "bedu.org"
////        v.toInt()
//        val divider = 0
//        val a = 3 / divider //comentar para reproducir el primer error
//    } catch (e: NumberFormatException) {
//        println("No se puede convertir este tipo a numerico:")
//        e.printStackTrace()
//    } catch (e: Exception) {
//        println("No se pudo convertir, hubo un error: $e")
//    } finally {
//        println("Proceso terminado")
//    }

    val stock = listOf(Shirt(), Shirt(), Shirt(), Shirt(), Shirt())

    val cliente = 7
    val restarDeInventario = cliente -1

    // Con exception
//    for(i in 0..restarDeInventario){
//        stock[i].reserve()
//    }

//    try {
//        for(i in 0..restarDeInventario ){
//            stock[i].reserve()
//        }
//    } catch(e:ArrayIndexOutOfBoundsException) {
//        println("No hay suficientes camisas en stock, por favor disminuye la cantidad")
//        stock.forEach {
//            it.unreserve()
//        }
//    } finally {
//        println("Gracias por su preferencia")
//    }

    val person = Person()
    val s = person.name ?: person.fail("Nombre requerido!")
    println(s)

}

class Shirt() {
    var available = true

    fun reserve() {
        if (available) {
            available = false
            println("Reservación efectuada")
        }
    }

    fun unreserve() {
        available = true
        println("Reservación cancelada")
    }
}
