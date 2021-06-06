Algoritmo Ejercicio13
	Definir radio, altura Como Real
	Escribir "Ingrese el valor del radio: "
	Leer radio
	Escribir "Ingrese el valor de la altura: "
	Leer altura
	Si radio > 0 & altura > 0 Entonces
		volumen = pi*(radio*radio)*altura
		Escribir "El volumen del cilindro es = " volumen
	SiNo
		Escribir "No se puede calcular el volumen con números negativos."
	Fin Si
FinAlgoritmo
