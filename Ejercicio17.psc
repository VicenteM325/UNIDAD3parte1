Algoritmo Ejercicio17
	Definir a, b, c Como Entero
	Escribir "Ingrese el primer valor del lado del tri�ngulo: "
	Leer a
	Escribir "Ingrese el segundo valor del lado del tri�ngulo: "
	Leer b
	Escribir "Ingrese el tercer valor del lado del tri�ngulo: "
	Leer c
	Si a = b & b = c Entonces
		Escribir "Seg�n los valores ingresados el tri�ngulo es equilatero."
	SiNo
		Si a = b & b <> c || a = c & c <> b || b = c & b <> a Entonces
			Escribir "Seg�n los valores ingresados el tri�ngulo es isosceles."
		SiNo
			Escribir "Seg�n los valores ingresados el tri�ngulo es escaleno."
		Fin Si
	Fin Si
FinAlgoritmo
