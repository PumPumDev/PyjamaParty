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
    1 -> List(-19, -67, 72, -56, 54, -8, 38, -75, -19, -115) )

def esCorrecto(ejercicio: Int, solucion: Int): Unit =
    if (soluciones(ejercicio) == hash(solucion))
        println("Enhorabuena, moñas, es correcto.")
    else 
        println("Me temo que has hecho algo mal, melón.")
