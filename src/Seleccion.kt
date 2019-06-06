open class Seleccion(var id: Int, val nombre: String, val apellido: String, var edad: Int) {


    fun concentrarse() {
        println(" concentrase a selección ")

    }

    open fun viajar() {
        println("viaxa a selección")
    }

    override fun toString(): String {
        return "Id: $id\nNombre: $nombre\nApellido: $apellido\nEdad: $edad"

    }
}