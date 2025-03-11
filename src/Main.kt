//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val gestionVeterinaria = GestionVeterinaria()
    var opcion: Int

    do {
        println("Bienvenido al menu de opciones de la veterianria (:. Selecciona: ")
        println("1. Mostrar mascotas registradas")
        println("2. Modificar peso de una mascota")
        println("3. Registrar consulta médica")
        println("4. Registrar nueva mascota")
        println("5. Salir")
        print("Seleccione una opción: ")
        opcion = readln().toInt()

        when (opcion) {
            1 -> {

                gestionVeterinaria.mostrarMascotas()
            }
            2 -> {

                print("Ingrese el nombre de la mascota: ")
                val nombre = readln()
                print("Ingrese el nuevo peso: ")
                val peso = readln().toDouble()
                gestionVeterinaria.modificarPeso(nombre, peso)
            }
            3 -> {

                print("Ingrese el nombre de la mascota: ")
                val nombre = readln()
                print("Ingrese el diagnóstico: ")
                val diagnostico = readln()
                print("Ingrese el costo base de la consulta: ")
                val costoBase = readln().toDouble()
                print("¿Incluye medicación? (true/false): ")
                val incluyeMedicacion = readln().toBoolean()
                gestionVeterinaria.hacerConsulta(nombre, diagnostico, costoBase, incluyeMedicacion)
            }
            4 -> {

                print("Ingrese el nombre de la mascota: ")
                val nombre = readln()
                print("Ingrese la especie de la mascota: ")
                val especie = readln()
                print("Ingrese la edad de la mascota: ")
                val edad = readln().toInt()
                print("Ingrese el peso de la mascota: ")
                val peso = readln().toDouble()
                val nuevaMascota = Mascota(nombre, especie, edad, peso)
                gestionVeterinaria.agregarMascota(nuevaMascota)
                println("Mascota registrada exitosamente")
            }
            5 -> {

                println("Gracias por usar nuestros servicios de veterinaria")
            }
            else -> {
                println("Opcion invalida ):")
            }
        }
    } while (opcion != 5)
}