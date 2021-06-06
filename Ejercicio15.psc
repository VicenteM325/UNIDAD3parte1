Algoritmo Ejercicio15
	Definir valor Como Real
	Escribir "Ingrese un número: "
	Leer valor
	Si valor = 0 Entonces
		Escribir "El número ingresado es nulo"
	SiNo
		Si valor < 0 Entonces
			Escribir "El número ingresado es negativo"
		SiNo
			Si valor > 0 Entonces
				Escribir "El número ingresado es positivo"
			SiNo
				Escribir "Usted ingresó un caracter no válido"
			Fin Si
		Fin Si
	Fin Si
FinAlgoritmo
