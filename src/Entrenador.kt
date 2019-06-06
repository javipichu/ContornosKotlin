class Entrenador(var idFederacion: String?, id: Int, nombre: String, apellido: String, edad: Int) : Seleccion(id, nombre, apellido, edad) {

    class Seleccion(var id: Int, val nombre: String, val apellido: String, var edad: Int)

    fun dirigirPartido() {

    }

    fun dirigirEntrenamiento() {

    }

    override fun viajar() {
        println("viajan los entrenadores") //Para cambiar el cuerpo de los métodos generados
    }

}
