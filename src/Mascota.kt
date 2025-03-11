open class Mascota (
    var nombre:String,
    var especie:String,
    var edad:Int,
    var peso:Double

)
{
    fun actualizarPeso(nuevoPeso : Double){
        peso=nuevoPeso
    }
    open fun describirMascota(): String {
        return "La mascota se llama $nombre, es un $especie, tiene $edad años y pesa $peso "
    }
    fun incrementarEdad() {
        edad += 1
    }

}