Algoritmo Ejercicio16
	Definir num1, num2, num3 Como Entero
	Escribir "Ingrese primer número: "
	Leer num1
	Escribir "Ingrese segundo número: "
	Leer num2
	Escribir "Ingrese tercer número: "
	Leer num3
	Si num1 > num2 Entonces
		Si num1 > num3 Entonces
			Escribir "El número mayor es el primer número ingresado: " num1
		SiNo
			Escribir "El número mayor es el tercer número ingresado: " num3
		Fin Si
	SiNo
		Si num2 > num3 Entonces
			Escribir "El número mayor es el segundo número ingresado: " num2
		SiNo
			Escribir "El número mayor es el tercer número ingresado: " num3
		Fin Si
	Fin Si	
FinAlgoritmo
