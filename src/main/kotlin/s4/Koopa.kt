package s4

class Koopa :
    Enemy("Koopa", 2){

    init {
        println("iniciando subclase de $name")
    }

    private var state = "Walking"

    override fun collision(collider: String){
        when(collider){
            "Weapon" -> {
                state = "Shell"
                println("El estado es $state")
            }
            "Enemy" -> changeDirection()
        }
    }
}