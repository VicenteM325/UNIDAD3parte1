import java.util.Scanner;
    public class Ejercicio20{
        public static void main(String[] args){
            int numero, num1, num2, num3, num4, num5;
            Scanner entrada = new Scanner(System.in);
            System.out.print("Ingrese un número mayor a 10000 y menor a 99999: ");
            numero = entrada.nextInt();
            if(numero >= 10000 && numero <= 99999){
                num1 = (numero/10000) % 10;
                num2 = (numero/1000) % 10;
                num3 = (numero/100) % 10;
                num4 = (numero/10) % 10;
                num5 = (numero % 10) % 10;
                System.out.println("El primer número es = " + num1);
                System.out.println("El segundo número es = " + num2);
                System.out.println("El tercer número es = " + num3);
                System.out.println("El cuarto número es = " + num4);
                System.out.println("El quinto número es = " + num5);
                if(num1 == num5 && num2 == num4){
                    System.out.println("El número ingresado: " + numero + " es capicúa.");
                } else {
                    System.out.println("El número ingresado: " + numero + " no es capicúa.");
                }
            } else {
                System.out.println("Ingreso no aceptado.");
            }
        }
    }