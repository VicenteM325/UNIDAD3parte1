Algoritmo Ejercicio17
	Definir a, b, c Como Entero
	Escribir "Ingrese el primer valor del lado del triángulo: "
	Leer a
	Escribir "Ingrese el segundo valor del lado del triángulo: "
	Leer b
	Escribir "Ingrese el tercer valor del lado del triángulo: "
	Leer c
	Si a = b & b = c Entonces
		Escribir "Según los valores ingresados el triángulo es equilatero."
	SiNo
		Si a = b & b <> c || a = c & c <> b || b = c & b <> a Entonces
			Escribir "Según los valores ingresados el triángulo es isosceles."
		SiNo
			Escribir "Según los valores ingresados el triángulo es escaleno."
		Fin Si
	Fin Si
FinAlgoritmo
