package s4

fun main() {

    val enemy = Goomba()

    enemy.collision("Enemy")
    enemy.collision("Weapon")

    val enemy2 = Koopa()

    enemy2.collision("Enemy")
    enemy2.collision("Weapon")
}