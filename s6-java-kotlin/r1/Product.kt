package r1

abstract class Product(var price: Float, var name: String, var sku: String) {
    abstract fun getTotalPrice(quantity: Int): Float
}
