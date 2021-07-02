package e3

class RandomGenerator {
    companion object {
        fun generate(): Int {
            return (0..10).random()
        }

        val initialText = "Numeros aleatorios"
    }
}