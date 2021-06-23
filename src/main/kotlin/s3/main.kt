package s3

fun main() {

    val myPhone = Phone()

    myPhone.isOn = true

    myPhone.getTurn()
    myPhone.turnOn()
    myPhone.getTurn()

    println("----------------------")

    val miVehiculo = Vehiculo(
        color = "azul",
        marca = "Volkswagen",
        modelo = "Pointer"
    )

    println("El coche está prendido? ${miVehiculo.encendido}")
    miVehiculo.encender()
    println("El coche está prendido? ${miVehiculo.encendido}")

    println("El tanque tiene ${miVehiculo.gasolina}")
    miVehiculo.recargar(20.07f)
    println("El tanque tiene ${miVehiculo.gasolina}")

    println("----------------------")

    val miVehiculoConst = VehiculoConst(
        "Volkswagen",
        "Pointer",
        "azul"
    )

    println("El coche está prendido? ${miVehiculoConst.encendido}")
    miVehiculoConst.encender()
    println("El coche está prendido? ${miVehiculoConst.encendido}")

    println("El tanque tiene ${miVehiculoConst.gasolina}")
    miVehiculoConst.recargar(20.07f)
    println("El tanque tiene ${miVehiculoConst.gasolina}")
}