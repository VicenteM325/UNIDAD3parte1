Algoritmo Ejercicio19
	numero <- azar(1000)
	Escribir "El valor del n�mero alazar es = " numero
	Si (numero < 25) & (numero mod 5 == 0)  Entonces
		Escribir "Correcto"
	SiNo
		Escribir "El n�mero " numero " no es menor a 25 y/o no es divisible entre 5"
	Fin Si
FinAlgoritmo
