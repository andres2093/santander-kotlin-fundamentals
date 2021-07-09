package e1

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    println("Inicia")

//    GlobalScope.launch {
//        delay(2000)
//        println("Un segundo")
//    }
//    GlobalScope.launch {
//        delay(2000)
//        println("Un segundos")
//    }
//
//    Thread.sleep(3000)
//    println("Termina")

    runBlocking {     // bloquear el hilo donde se corre
        delay(2000L)  //proceso de suspensión de 2 segundos
    }
    println("bloqueo por corrutina de 2 segundos finalizado")


}