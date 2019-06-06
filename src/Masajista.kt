class Masajista(var titulacion: String?, var anhosExperiencia: Int, id: Int, nombre: String, apellido: String, edad: Int) : Seleccion(id, nombre, apellido, edad) {

    class Seleccion(var id: Int, val nombre: String, val apellido: String, var edad: Int)

    fun darMasaje() {

    }

    override fun toString(): String {
        return "Id: " + id + "\nNombre: " + nombre + "\nApellido: " + apellido + "\nEdad: " + edad + "Titulacion: " + titulacion + "\nanhosExperiencia: " + anhosExperiencia
    }

    override fun viajar() {
        println("viajan los masajistas") //Para cambiar el cuerpo de los métodos generados
    }

}