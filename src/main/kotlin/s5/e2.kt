package s5

// RECOMENDADO PERO SIN EL noninline
inline fun nonInlinedFun(inlined: () -> Unit, noinline notInlined: () -> Unit) {
    println("Antes de correr la función recibida")
    inlined()
    println("después de correr la función recibida")
    notInlined()
}

fun main() {
//    NO RECOMENDADO
    fun nonInlined(runLambda: () -> Unit) {
        println("Antes de correr la función recibida")
        runLambda()
        println("después de correr la función recibida")
    }

    nonInlined {
        println("Llamando a la función noninlined")
    }

    nonInlinedFun (
        { println("Llamando a la función inline") },
        { println("Llamando a la función noninlined") }
    )
}