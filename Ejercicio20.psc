Algoritmo Ejercicio20
	Escribir "Ingrese un n�mero mayor a 10000 y menor a 99999: "
	Leer numero
	Si numero >= 10000 & numero <= 99999 Entonces
		num1 = trunc (numero/10000) mod 10
		num2 = trunc (numero/1000) mod 10
		num3 = trunc (numero/100) mod 10
		num4 = trunc (numero/10) mod 10
		num5 = trunc (numero mod 10) mod 10
		Escribir "El primer n�mero es = " num1
		Escribir "El segundo n�mero es = " num2
		Escribir "El tercer n�mero es = " num3
		Escribir "El cuarto n�mero es = " num4
		Escribir "El quinto n�mero es = " num5
		Si (num1 = num5) & (num2 = num4) Entonces
			Escribir "El n�mero ingresado: " numero " es capic�a."
		SiNo
			Escribir "El n�mero ingresado: " numero " no es capic�a."
		Fin Si
	SiNo
		Escribir "Ingreso no aceptado."
	Fin Si	
FinAlgoritmo
