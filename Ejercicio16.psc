Algoritmo Ejercicio16
	Definir num1, num2, num3 Como Entero
	Escribir "Ingrese primer n�mero: "
	Leer num1
	Escribir "Ingrese segundo n�mero: "
	Leer num2
	Escribir "Ingrese tercer n�mero: "
	Leer num3
	Si num1 > num2 Entonces
		Si num1 > num3 Entonces
			Escribir "El n�mero mayor es el primer n�mero ingresado: " num1
		SiNo
			Escribir "El n�mero mayor es el tercer n�mero ingresado: " num3
		Fin Si
	SiNo
		Si num2 > num3 Entonces
			Escribir "El n�mero mayor es el segundo n�mero ingresado: " num2
		SiNo
			Escribir "El n�mero mayor es el tercer n�mero ingresado: " num3
		Fin Si
	Fin Si	
FinAlgoritmo
