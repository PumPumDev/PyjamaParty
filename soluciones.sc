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
    "1a" -> List(-19, -67, 72, -56, 54, -8, 38, -75, -19, -115),
    "2a" -> List(-49, 27, -120, 28, -114, -57, 53, 81, 103, 41),
    "2b" -> List(-64, 3, 59, 95, 90, 72, 21, -95, 114, -104),
    "3a" -> List(-28, 47, 83, -29, 64, -66, -84, 15, -75, -94),
    "3b" -> List(6, -33, 5, 55, 25, -127, -94, 55, -48, -19),
    "4a" -> List(-117, -107, 43, 5, 102, 117, 32, -110, -61, -27),
    "4b" -> List(77, -29, 22, 22, 78, -65, -55, 34, -93, -107),
    "5a" -> List(-69, 108, 58, 50, 2, -20, 116, 85, 125, -41),
    "5b" -> List(-93, 33, -40, -76, 5, -29, -17, 38, 4, -107))

def esCorrecta(solucion: Int, ejercicio: String): Unit =
    soluciones.get(ejercicio).fold(
      println("¿De qué vas? Ese ejercicio no existe.")
    )( sol => if (sol == hash(solucion))
        println("Enhorabuena, moñas, es correcto.")
    else
        println("Me temo que te has equivocado, melón."))
