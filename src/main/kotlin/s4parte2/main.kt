package s4parte2

fun main() {

    val viajeMonterrey = National("Monterrey")
    viajeMonterrey.quotePrice(2)
    viajeMonterrey.reserve(4)

    println("--------------")

    val viajeBajaMonterrey = NationalLowSeason("Monterrey")
    viajeBajaMonterrey.reserve(4)

}