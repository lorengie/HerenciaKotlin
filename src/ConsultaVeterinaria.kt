class ConsultaVeterinaria (
    nombre: String,
    especie: String,
    edad: Int,
    peso: Double,
    var diagnostico:String,
    var costoBase:Double,
    var incluyeMedicacion: Boolean= false
) : Mascota(nombre,especie,edad,peso){
    fun calcularCosto():Double{
        return if(incluyeMedicacion){
            costoBase*1.15
        } else{
            costoBase
        }
    }

    override fun toString(): String {
        return "ConsultaVeterinaria(diagnostico='$diagnostico', costoBase=$costoBase, incluyeMedicacion=$incluyeMedicacion)"
    }

}