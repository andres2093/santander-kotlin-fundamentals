package r2

fun main() {
    val iPhone = SmartPhone(
        21230.53F,
        "iPhone",
        "11 Pro",
        "A13 Bionic"
    )

    println(iPhone.price)

    SmartPhone.restock(10)
    SmartPhone.minusStock()
    SmartPhone.minusStock()
    println("Stock actual: ${SmartPhone.getStock()}")
    SmartPhone.restock(5)
    println("Stock actual: ${SmartPhone.getStock()}")

    // En dos clases
    println("---------------------")
    println("Stock actual: ${Stock.getStock()}")
    Stock.restock(6)
    SmartPhone.minusStock()
    println("Stock actual: ${Stock.getStock()}")

}