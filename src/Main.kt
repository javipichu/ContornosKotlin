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

/*
                                        diferencias entre KOTLIN y JAVA
 ****
 kotlin=) Mejora en el uso del findViewById
- Si compara una clase Kotlin y una de Java que hagan lo mismo, la clase de Kotlin por lo general será más concisa, pero existe un área en particular donde Kotlin reduce en gran medida el código extra que se requiere para escribir: findViewByIds.

- La extensión de Kotlin para Android, permite realizar el import a una referencia del View en el Activity, en este punto se puede trabajar con dicha vista al ser parte del Activity. El resultado, que no se necesita escribir el findViewById.
****
 Kotlin no permite nulos
 - En Kotlin, no se puede asignar null a una variable, y esto cumple para todos los tipos. Si usted intenta asignar un valor null a una variable, el código falla en tiempo de compilación
****
Extensión de Funciones

- Kotlin permite a los programadores heredar una clase con nueva funcionalidad, que es ideal si usted piensa que hay una clase a la que le falta un método.

- Esta extensión de funciones no se encuentra disponible en Java, aunque si se encuentra disponible en otros lenguajes de programación que pueden ser utilizados para programar con Android, tal como C#.

*****
Kotlin no tiene excepciones del tipo checked 

- Kotlin no tiene excepciones del tipo checked, entonces no se requiere capturar o declarar ninguna excepción.

- Si esto es algo que te parece adecuado o te hace querer seguir con Java, depende de tu opinión sobre las excepciones del tipo checked. Si no te gusta tener tu código rodeado de try/catch, debes estar contento con esta omisión, sin embargo si encuentras que las excepciones del tipo checked son una ayuda para tener código más robusto, entonces esta es una ventaja de Java sobre Kotlin.

*****
Clases de datos

- En los proyectos se tienen los denominados bean que se utilizan para indicar los objetos base de nuestro proyecto. En Java, se puede realizar mucho código para este tipo de clases a fin de agregarle los métodos get y set apropiados, constructores, además de los métodos hashCode(), equals() y toString().

- En Kotlin, si le incluye la palabra reservada data, el compilador realizara todo ese trabajo por ustedes, incluyendo todos los métodos get y set necesarios.
*****
Cast inteligente

- En Java, constantemente se tiene que revisar el tipo de un objeto y luego realizar un cast del objeto, en los casos que se pueda realizar el mismo.

- Kotlin puede realizar el manejo de estos cast redundantes por usted, entonces no se requiere realizar el cast dentro de una sentencia si se ha realizado la validación con el operador «is»
*****
Kotlin no soporta conversiones implícitas

- Kotlin no soporta las conversiones implícitas para números, entonces los números de menor rango no pueden ser convertidos a los tipos mayores. En Kotlin, si quiere asignar un valor del tipo Byte a uno del tipo Int, se requiere realizar una conversión explícita, sin embargo Java soporta la conversión implícita.
*****
Intercambiable con Java

- Si aún no decide si utilizar Kotlin o Java para el desarrollo con Android, existe una tercer opción: utilizar ambos. Dejando de lado las diferencias, Java y Kotlin son 100% intercambiables. Se puede llamar código Kotlin desde Java, y puede llamar código Java desde Kotlin, así es posible tener clases Kotlin y clases Java trabajando juntas.

Esta flexibilidad es muy útil si quiere empezar a utilizar Kotlin en un proyecto existente y lo quiere para las nuevas funcionalidades.



CONCLUSIONES
 - Como ve, existen buenas razones para preferir Kotlin sobre Java, sin embargo hay algunas cosas donde Java tiene ventaja. Aunque el debate de si utilizar Kotlin o Java continuara, ambos tienen sus propios méritos.
*/
