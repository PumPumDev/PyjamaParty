// Password hash

import java.security._
import java.nio.charset.StandardCharsets

val md = MessageDigest.getInstance("SHA-512")

def hash(pwd: Any): List[Int] =
    md.digest(pwd.toString.getBytes(StandardCharsets.UTF_8))
        .take(10)
        .map(_.toInt)
        .toList

// Solutions

val soluciones = Map(
	"1a" -> List(-51, -59, 75, 88, 44, 88, -120, 42, 83, -74),
	"1b" -> List(64, -91, -71, 12, -53, 48, 43, 80, -1, 38),
	"1c" -> List(-36, 45, -26, 126, -78, 72, -36, -36, 80, -58),
	"2a" -> List(-86, 68, -47, 86, -34, 114, 58, -8, 102, -34),
	"2b" -> List(-127, -2, -112, 11, -49, -121, -49, -43, -55, -29),
	"2c" -> List(104, 29, 82, -95, -12, -86, -39, -15, -116, 73),
    	"3a" -> List(-71, 36, 34, 78, -119, -124, 108, 24, 79, 60),
	"3b" -> List(-8, -24, -98, -75, -56, 72, -27, -16, 30, -88),
  	"4a" -> List(-73, 96, 94, -11, 77, 94, -123, -11, 34, -70),
	"4b" -> List(-12, -116, 112, 74, 64, -81, 35, 108, 19, -57),
	"4c" -> List(9, 81, -86, 119, -29, 15, -13, 103, 40, 43),
	"4d" -> List(-84, -93, 37, -128, 111, -57, 110, -38, 47, -23),
	"5a" -> List(66, 43, 123, 93, -71, 4, 114, 86, 89, -42),
	"5b" -> List(-95, 84, -48, 52, -3, -124, 69, 22, -60, -123)
)

def esCorrecta(solucion: Int, ejercicio: String): Unit =
    soluciones.get(ejercicio).fold(
      println("¿De qué vas? Ese ejercicio no existe.")
    )( sol => if (sol == hash(solucion))
        println("Correcta, nenica, sigue así.")
    else
        println("La has liado, si no se te ocurre usa la pista ;)"))

def esCorrecta(solucion: Double, ejercicio: String): Unit =
    soluciones.get(ejercicio).fold(
      println("¿De qué vas? Ese ejercicio no existe.")
    )( sol => if (sol == hash(solucion))
        println("Correcta, nenica, sigue así.")
    else
        println("La has liado, si no se te ocurre usa la pista ;)"))