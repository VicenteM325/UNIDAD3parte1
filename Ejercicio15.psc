Algoritmo Ejercicio15
	Definir valor Como Real
	Escribir "Ingrese un n�mero: "
	Leer valor
	Si valor = 0 Entonces
		Escribir "El n�mero ingresado es nulo"
	SiNo
		Si valor < 0 Entonces
			Escribir "El n�mero ingresado es negativo"
		SiNo
			Si valor > 0 Entonces
				Escribir "El n�mero ingresado es positivo"
			SiNo
				Escribir "Usted ingres� un caracter no v�lido"
			Fin Si
		Fin Si
	Fin Si
FinAlgoritmo
