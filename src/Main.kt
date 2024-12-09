// Variables
val nombre: String = "Fabio"    // Inmutable
var edad: Int = 25             // Mutable

// Funciones
fun saludar(nombre: String): String {
    return "¡Hola $nombre!"
}

// Función de una línea
fun sumar(a: Int, b: Int) = a + b

// Llamar funciones
fun main() {
    println(saludar("Fabio"))
    println(sumar(5, 3))

    // Clases y Objetos
    val persona1 = Persona("Fer", 3)
    persona1.mostrarInfo()

    // Herencia
    val miPerro = Perro("Max")
    miPerro.hacerSonido()

    // Interfaces
    val user1 = Usuario()
    user1.programar()

    // Null Safety
    var nombrePersona: String? = null
    println(nombrePersona?.length ?: "El nombre es nulo")

    // if/else, when, for, while
    val x = 19

    // if/else
    if (x >= 18) {
        println("Es mayor de edad")
    } else {
        println("Es menor de edad")
    }

    // when
    when (x) {
        1 -> println("Uno")
        2 -> println("Dos")
        3 -> println("Tres")
        else -> println("Otro valor")
    }

    // bucle for
    for (i in 1..5) {
        println(i)
    }

    // bucle while
    var contador = 0
    while (contador < 3) {
        println(contador)
        contador++
    }

    // List, Set, Map
    val lista = listOf(1, 2, 3, 4)
    println(lista[2])    // Acceso a elemento en una lista

    val conjunto = setOf(1, 2, 3, 3)
    println(conjunto)    // El set elimina duplicados

    val mapa = mapOf("clave1" to "valor1", "clave2" to "valor2")
    println(mapa["clave1"])  // Acceso a elementos en un mapa


    // Lambdas
    val suma: (Int, Int) -> Int = { a, b -> a + b }
    println(suma(3, 4))

    // Data Classes
    val personaData = PersonaData("Pedro", 40)
    println(personaData)

    // Manejo de excepciones
    try {
        val resultado = 10 / 0
    } catch (e: Exception) {
        println("Error: No se puede dividir por cero")
    }

    // Rangos
    val rango = 1..5   // Rango de números del 1 al 5
    for (i in rango) {
        println(i)
    }

    // Contains e indexOf
    val listaDeNombres = listOf("Ana", "Luis", "Carlos")
    println(listaDeNombres.contains("Ana"))
    println(listaDeNombres.indexOf("Luis"))
}

// Clases y Objetos
class Persona(val nombre: String, var edad: Int) {
    fun mostrarInfo() {
        println("Nombre: $nombre, Edad: $edad")
    }
}

// Herencia
open class Animal(val nombre: String) {
    open fun hacerSonido() {
        println("El animal hace un sonido")
    }
}

class Perro(nombre: String): Animal(nombre) {
    override fun hacerSonido() {
        println("$nombre hace: ¡Guau!")
    }
}

// Interfaces
interface Programador {
    fun programar()
}

class Usuario : Programador {
    override fun programar() {
        println("El usuario está programando.")
    }
}

// Data Classes
data class PersonaData(val nombre: String, val edad: Int)