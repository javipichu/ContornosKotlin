class Jugador(var dorsal: Int, var demarcacion: String, id: Int, nombre: String, apellido: String, edad: Int) : Seleccion(id, nombre, apellido, edad) {

    class Seleccion(var id: Int, val nombre: String, val apellido: String, var edad: Int)

    fun jugarPartido() {

    }

    fun entrenar() {

    }

    override fun toString(): String {
        return "Id: " + id + "\nNombre: " + nombre + "\nApellido: " + apellido + "\nEdad: " + edad + "\n Dorsal: " + dorsal + "\nDemarcacion: " + demarcacion
    }

    override fun viajar() {
        println("viajan los jugadores") //Para cambiar el cuerpo de los métodos generados
    }

}