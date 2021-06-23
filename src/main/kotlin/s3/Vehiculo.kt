package s3

class Vehiculo {

    var modelo = ""
    var marca = ""
    var color = ""
    var gasolina = 0f
    var encendido = false

    init {
        println("Los datos son $marca $modelo")
    }

    constructor(color: String, marca: String, modelo: String) {
        this.color = color
        this.marca = marca
        this.modelo = modelo
    }

    constructor(color: String, marca: String) {
        this.color = color
        this.marca = marca
    }

    fun encender(){
        encendido=true
    }

    fun apagar(){
        encendido=false
    }

    fun recargar(gasolina:Float){
        this.gasolina+=gasolina
    }
}

class VehiculoConst (marca:String, modelo: String, color: String) {

    init{
        println("Clase con constrcutor primario")
        println("""Los datos del coche son:
            marca: $marca
            modelo: $modelo
            color: $color""")
    }

    constructor(marca:String, modelo: String, color: String, placas: String): this(marca,modelo,color){
        this.placas = placas
        println("las placas son: ${this.placas}")
    }


    var placas = ""
    var gasolina = 0f
    var encendido = false

    fun encender(){
        encendido=true
    }

    fun apagar(){
        encendido=false
    }

    fun recargar(litros:Float){
        gasolina+=litros
    }
}