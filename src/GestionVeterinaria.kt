class GestionVeterinaria {

    private  val mascotas = mutableListOf<Mascota>()
    private val consultas= mutableListOf<ConsultaVeterinaria>()

    fun agregarMascota(mascota: Mascota){
        mascotas.add(mascota)
    }
    fun registrarConsulta (consulta: ConsultaVeterinaria){
        consultas.add(consulta)

    }

    fun mostrarHistorial(nombreMascota:String){
        val consultaVeterinaria= consultas.filter { it.nombre ==nombreMascota }
        if (consultaVeterinaria.isNotEmpty()){
            println("El historial de $nombreMascota")
            consultaVeterinaria.forEach({ println(it.describirMascota())})
        }else {
            println("No han habido consultas para $nombreMascota")
        }

    }
    fun calcularCostoTotal(nombreMascota: String):Double{
        return  consultas.filter { it.nombre ==nombreMascota }.sumOf { it.calcularCosto() }
    }

    fun modificarPeso(nombreMascota: String,nuevoPeso:Double){
        val mascota= mascotas.find { it.nombre==nombreMascota }
        mascota?.actualizarPeso(nuevoPeso)
    }
    fun incrementoEdad(nombreMascota: String){
        val mascota=mascotas.find { it.nombre==nombreMascota }
        mascota?.incrementarEdad()
    }
    fun mostrarMascotas() {
        if (mascotas.isNotEmpty()) {
            println("Mascotas registradas:")
            mascotas.forEach { println(it.describirMascota()) }
        } else {
            println("No hay mascotas registradas.")
        }
    }
    fun hacerConsulta(nombreMascota: String, diagnostico: String, costoBase: Double, incluyeMedicacion: Boolean) {
        val mascota = mascotas.find { it.nombre == nombreMascota }
        if (mascota != null) {
            val consulta = ConsultaVeterinaria(mascota.nombre, mascota.especie, mascota.edad, mascota.peso, diagnostico, costoBase, incluyeMedicacion)
            consultas.add(consulta)
            println("Consulta registrada para $nombreMascota.")
        } else {
            println("Mascota no encontrada.")
        }
    }
}



