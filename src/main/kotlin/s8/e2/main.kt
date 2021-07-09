package e2

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.util.concurrent.atomic.AtomicLong
import kotlin.concurrent.thread

inline fun measureTimeMillis(block: () -> Unit){
    val start = System.currentTimeMillis()
    block()
    val end = System.currentTimeMillis() - start
    println("Tiempo transcurrido: ${end/1_000L} segundos")
}

fun main() {
//    Corroutines
//    val almacenarNumeros = AtomicLong()
//
//    measureTimeMillis {
//        for(i in 1..1_000_000L){
//            GlobalScope.launch {
//                almacenarNumeros.addAndGet(i)
//            }
//        }
//    }
//
//    println("Valor de ${almacenarNumeros.get()}")

    val almacenarNumerosThread = AtomicLong()

    measureTimeMillis {
        for(i in 1..1_000_000L){
            thread(start = true){
                almacenarNumerosThread.addAndGet(i)
            }
        }
    }

    println("Valor de ${almacenarNumerosThread.get()}")
}