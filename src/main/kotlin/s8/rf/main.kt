package rf

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlinx.coroutines.withTimeout
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException

fun main() = runBlocking {
    try {
        println("Iniciando recuperación de usuario")
        val user = fetchUserCoroutine("Andres", "123456")
//        updateUser(user)
        println(user)
    } catch (exception: Exception) {
        println("Error: $exception")
    }
}

private suspend fun fetchUserCoroutine(username: String, password: String): User =
    suspendCancellableCoroutine { cancellableContinuation ->
        fetchUser(object : Callback {
            override fun onSuccess(user: User) {
                cancellableContinuation.resume(user)
            }

            override fun onFailure(exception: Exception) {
                cancellableContinuation.resumeWithException(exception)
            }
        })
    }

private fun fetchUser(callback: Callback) {
    Thread {
        Thread.sleep(3_000)

        // onSuccess
        callback.onSuccess(
            User(
                "Andres",
                "fhgfhg646546465897hhjh",
                28,
                "Male",
                0
            )
        )
       // onFailure
//        callback.onFailure(Exception("Excepción genérica"))
    }.start()
}

data class User(
    val Username: String,
    val token: String,
    val age: Int,
    val gender: String,
    val credit: Long
)

interface Callback {
    fun onSuccess(user: User)
    fun onFailure(exception: Exception)
}


// POSTWORK
//fun main() = runBlocking {
//    withTimeout(10_000L) {
//        repeat(30) { i ->
//            println("Descargando $i% ...")
//            delay(300L)
//        }
//    }
//}