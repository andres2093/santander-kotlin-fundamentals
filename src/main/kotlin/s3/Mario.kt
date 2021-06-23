package s3

class Mario(var vidas: Int =3){ //vamos a dejar setear el número de vidas al iniciar el objeto Mario

    init {
        println("It's a me! Mario!") //vamos a hacer que Mario se presente al construirlo!
    }

    private var state = "small" //mario es pequeño al iniciar el juego
    private var lives = 3 //uno empieza el juego con tres vidas
        set(value){
            when (field) {
                1 -> {
                    field = 0
                    gameOver()
                }
                0 -> {
                    println("Reinicia el juego!!!")
                }
                else -> {
                    field = value
                }
            }
        }

    //resta una vida al jugador
    private fun die(){
        lives--
        println("Has perdido una vida!")
    }

    fun getLives(): String{
        return "$lives vidas"
    }

    private fun gameOver(){
        println("Juego finalizado")
    }

    //el modificador public es redundante
    //en función del objeto colisionante, se ejecuta un evento
    public fun collision(collisionObj: String){
        when(collisionObj){
            "Goomba" -> lives--//die()
            "Super Mushroom" -> state = "Super mario"
            "Fire flower" -> {
                state = "Fire mario"
                println("El estado de mario es $state")
            }
            else -> println("Objeto desconocido ¡no pasa nada!")
        }
    }
}
