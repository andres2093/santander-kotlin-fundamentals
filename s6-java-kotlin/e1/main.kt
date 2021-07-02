import e1.User
import java.text.SimpleDateFormat
import java.util.*

fun main() {
    val now = Date()
    val formatDate = SimpleDateFormat("yyyy.MM.dd hh:mm:ss")
    println("Hora actual: ${formatDate.format(now)}")

    val user = User(
        "Andres",
        "Ramirez",
        28,
        "1",
        true
    )

    user.name = "Carlos"
    println(user.name)
//    user.lastName = "Cortes"
//    user.status
}