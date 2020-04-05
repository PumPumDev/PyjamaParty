// Pistas

val pistas = Map(
	"1" -> "Recuerda que la suma de ángulos de un triángulo es 180º",
	"2" -> "Recuerda que la suma de los ángulos de un polígono de n lados es: 180º * (n-2)",
	"3" -> "Recuerda el Teorema de Pitágoras: cateto1^2+cateto2^2 = hipotenusa^2",
	"4" -> "Recuerda:\nLa longitud de la circunferencia es: 2*Pi*r\nEl área de la circunferencia es: Pi*r^2",
	"5" -> "Recuerda la fórmula del cálculo del área de un sector circular: (Pi*radio^2*grados)/360"
)

def pista(ejercicio: String): Unit =
	println(pistas(ejercicio))