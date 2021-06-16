var number2 = 30

fun main() {
    //println("Hola")
    //println("Bedu")

    val number1 = 21
    //number1 = 3

    println(number1)



    println(number2)

    val oneMillion = 1_000_000
    println(oneMillion)

    val c = 'A'
    println(c.javaClass.kotlin)
    println(c)

    val cc = "A"
    println(cc.javaClass.kotlin)
    println(cc)

    val trueVal = true
    val falseVal = false
    println(trueVal.javaClass.kotlin)
    println(trueVal)
    println(falseVal.javaClass.kotlin)
    println(falseVal)

    val dialogue = "It's a secret to everybody"
    println(dialogue)

    val logoZelda = """
                                       /@
                       __        __   /\/
                      /==\      /  \_/\/   
                    /======\    \/\__ \__
                  /==/\  /\==\    /\_|__ \
               /==/    ||    \=\ / / / /_/
             /=/    /\ || /\   \=\/ /     
          /===/   /   \||/   \   \===\
        /===/   /_________________ \===\
     /====/   / |                /  \====\
   /====/   /   |  _________    /  \   \===\    THE LEGEND OF 
   /==/   /     | /   /  \ / / /  __________\_____      ______       ___
  |===| /       |/   /____/ / /   \   _____ |\   /      \   _ \      \  \
   \==\             /\   / / /     | |  /= \| | |        | | \ \     / _ \
   \===\__    \    /  \ / / /   /  | | /===/  | |        | |  \ \   / / \ \
     \==\ \    \\ /____/   /_\ //  | |_____/| | |        | |   | | / /___\ \
     \===\ \   \\\\\\\/   /////// /|  _____ | | |        | |   | | |  ___  |
       \==\/     \\\\/ / //////   \| |/==/ \| | |        | |   | | | /   \ |
       \==\     _ \\/ / /////    _ | |==/     | |        | |  / /  | |   | |
         \==\  / \ / / ///      /|\| |_____/| | |_____/| | |_/ /   | |   | |
         \==\ /   / / /________/ |/_________|/_________|/_____/   /___\ /___\
           \==\  /               | /==/
           \=\  /________________|/=/    
             \==\     _____     /==/ 
            / \===\   \   /   /===/
           / / /\===\  \_/  /===/
          / / /   \====\ /====/
         / / /      \===|===/
         |/_/         \===/
                        =  
"""
    println(logoZelda)

    val edad: Int = 27
    println("Mi edad es $edad")

    println("En dos años tendré ${edad+2} años")

    val a = 10
    val b = 5

    println(a+b)
    println(a-b)
    println(a*b)
    println(a/b)
    println(a%b)
    println(a downTo b)

    println(a.plus(b))
    println(a.minus(b))
    println(a.times(b))
    println(a.div(b))
    println(a.rem(b))
    println(a downTo b)

    println(a.compareTo(b) > 0)

    print("Ingresa la edad:")
    val input = readLine()

    println(input)

}