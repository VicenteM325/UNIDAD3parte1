Algoritmo Ejercicio20
	Escribir "Ingrese un número mayor a 10000 y menor a 99999: "
	Leer numero
	Si numero >= 10000 & numero <= 99999 Entonces
		num1 = trunc (numero/10000) mod 10
		num2 = trunc (numero/1000) mod 10
		num3 = trunc (numero/100) mod 10
		num4 = trunc (numero/10) mod 10
		num5 = trunc (numero mod 10) mod 10
		Escribir "El primer número es = " num1
		Escribir "El segundo número es = " num2
		Escribir "El tercer número es = " num3
		Escribir "El cuarto número es = " num4
		Escribir "El quinto número es = " num5
		Si (num1 = num5) & (num2 = num4) Entonces
			Escribir "El número ingresado: " numero " es capicúa."
		SiNo
			Escribir "El número ingresado: " numero " no es capicúa."
		Fin Si
	SiNo
		Escribir "Ingreso no aceptado."
	Fin Si	
FinAlgoritmo
