package s5

fun main() {
    val calificaciones = listOf(10,8, 9 ,5,3,2,5,1,7,6,9,4,10,3,6,2,6,5)

//    val aprobados = mutableListOf<Int>()
//    for (calificacion in calificaciones){
//        if(calificacion>5){
//            aprobados.add(calificacion)
//        }
//    }
//    println(aprobados)

//    val aprobados = calificaciones.filter { it > 5 }
//    println(aprobados)

//    val (aprobados, reprobados) = calificaciones.partition { it > 5 }
//    println(aprobados)
//    println(reprobados)

//    val notasAlumnos =  mapOf("Lorenza" to 6, "Juan" to 4, "Martina" to 8, "David" to 7)
//    val porNombre = notasAlumnos.filter { (key, value) ->  value == 6}
//    println(porNombre)

//    val preciosLibres = setOf(1024.0, 2408.5, 8224.33)
//    val preciosFinales = preciosLibres.map { it * 1.16 }
//    println(preciosFinales)

//    val aprobados = calificaciones.filter { it > 15 }
//    println(aprobados.size == 0)
//    println(aprobados.isEmpty())

    //    Reto 2
    val calificacionesR2 = listOf(10,8, 9 ,5,3,2,5,1,7,6,9,4,10,3,6,2,6,5)

    //Sacar el promedio de la clase
    val promedio = calificacionesR2.sum().toDouble()/calificacionesR2.size
    val promedioAvg = calificacionesR2.average()
    println("promedio: $promedio | promedioAvg: $promedioAvg")

    println(calificacionesR2)

    //Verificar que ningún alumno halla sacado menos de 4
    println("Los alumnos sacaron menos de 4: ${!calificacionesR2.none{it < 4}}")

    //Subir puntos extra pero no permitir que alguien tenga 11 en adelante
    val califExtra = calificacionesR2.map { if (it>=10) it else it + 1 }
    println("Las calificaciones con punto extra son: $califExtra")

}