fun main(args: Array<String>) {
    val entrenador = Entrenador("IDF0011", 1, "Nombre", "Apellido", 30)
    val jugador = Jugador(1, "Portero", 2, "Nombre2", "Apellido2", 19)
    val masajista = Masajista("Titulo", 10, 3, "Nombre Masajista", "Apellido Masajista", 45)
    val jugador2 = Jugador(1, "Portero", 2, "Nombre2", "Apellido2", 19)
    entrenador.concentrarse()
    jugador.concentrarse()
    masajista.concentrarse()
    jugador2.concentrarse()

    entrenador.viajar()
    jugador.viajar()
    masajista.viajar()
    jugador2.viajar()
}

