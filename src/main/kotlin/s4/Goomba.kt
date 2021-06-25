package s4

class Goomba :
    Enemy("Goomba", 1){

    init {
        println("iniciando subclase de $name")
    }

    override fun collision(collider: String){
        super.collision(collider)
        println("Override")
    }
}
