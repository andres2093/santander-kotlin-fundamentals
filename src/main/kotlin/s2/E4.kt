package s2

fun main() {
    val numeros = listOf("one", "two", "three", "four", "five")

    println(numeros)

    println("Numero de elementos: ${numeros.size}")
    println("Segundo elemento: ${numeros.get(1)}")
    println("Cuarto elemento: ${numeros[3]}")
    println("Ultimo elemento: ${numeros.get(numeros.size - 1)}")
    println("Ultimo elemento: ${numeros.get(4)}")
    println("Index del elemento \"four\": ${numeros.indexOf("four")}")

    // Error por ser inmutable
    // numeros.add("Six")

    val list = mutableListOf(1, 2, 3, 4)
    //Agregar elementos
    list.add(5)
    //Remover elementos
    list.removeAt(1)
    //Modificar elementos
    list[0] = 0

    println(list)


    val numSet: Set<Int> = setOf(0, 1, 2, 3, 4, 5)
    val reverseNumSet: Set<Int> = setOf(5, 4, 3, 2, 1, 0)

    println(numSet == reverseNumSet)

    val namesToAges: Map<String, Int> = mapOf("user_one" to 20, "user_two" to 23)

    for((key, value) in namesToAges){
        println("$key tiene $value años")
    }


}