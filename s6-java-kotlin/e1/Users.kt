package e1

class Users(var name: String, val lastName: String, var age: Int, private var status: String, var isMale: Boolean) {

    fun setStatus(status: String) {
        this.status = status
    }
}