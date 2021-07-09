package e3

import kotlinx.coroutines.*

suspend fun getInventary(productId: Int): Int {
    println("Buscando producto en el inventario...")
    delay(2000)
    val stock = (0..99).random()
    println("producto identificado, en stock: $stock")
    return stock
}

// Primera parte
//fun main() {
//    GlobalScope.launch { getInventary(1) }
//
//    Thread.sleep(2500)
//}

// Segunda parte
//fun main(): Unit = runBlocking {
//    getInventary(1)
//}

// Tercera parte
//fun main() = runBlocking {
//    val job = GlobalScope.launch {
//        delay(1000)
//        println("Mundo")
//    }
//    val job1 = GlobalScope.launch {
//        delay(1000)
//        println("Mundo 2")
//    }
//    job.join()
//    job1.join()
//    println("Hola")
//}

// Cuarta parte
fun main() = runBlocking {
//    launch {
//        delay(100)
//        println("Mundo")
//    }
//    println("Hola")

    val buyJob = launch {
        var percentage = 0

        while (percentage<100){
            println("procesando pago: $percentage%")
            delay(500)
            percentage+=10
        }
        println("Pago exitoso!")
    }

    delay(2000)
    buyJob.cancel()

}