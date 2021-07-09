package r2

import e2.measureTimeMillis
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() {
    //obteniendo un solo precio
    runBlocking{
        val price = getScooterPrice()
        println("El precio del scooter es: $price")
    }

    println("----------------------------")

    //obteniendo el precio del scooter y la play 4 secuencialmente
    val secuentialTime = measureTimeMillis {
        runBlocking {
            val scooterPrice = getScooterPrice()
            val ps4Price = getPs4Price()

            val totalPrice = scooterPrice + ps4Price
            println("El precio total es: $totalPrice")
        }
    }
    println("tiempo transcurrido en secuencial: $secuentialTime segundos")

    println("----------------------------")

    //obteniendo el precio del scooter y la play 4 de forma asíncrona
    val asyncTime = measureTimeMillis {
        runBlocking {
            val scooterResult = async { getScooterPrice() }
            val ps4Result = async { getPs4Price() }

            val totalPrice = scooterResult.await() + ps4Result.await()
            println("El precio total es: $totalPrice")
        }
    }
    println("tiempo transcurrido en asíncrono: $asyncTime segundos")
}

suspend fun getScooterPrice():Long{
    println("Obteniendo precio...")
    delay(2_000)
    return 2400L
}

suspend fun getPs4Price():Long{
    println("Obteniendo precio...")
    delay(3_000)
    return 5299L
}