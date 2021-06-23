package s3

fun main() {

    val myPhone = Phone()

    myPhone.isOn = true

    myPhone.getTurn()
    myPhone.turnOn()
    myPhone.getTurn()

    val myPhone1 = Phone()

    myPhone1.getTurn()
    myPhone1.turnOn()
    myPhone1.getTurn()
}