import java.util.Scanner;
    public class Ejercicio18{
        public static void main(String[] args){
            int numero, num1, num2, num3, num4, resultado;
            Scanner entrada = new Scanner(System.in);
            System.out.print("Ingrese un número de cuatro dígitos: ");
            numero = entrada.nextInt();
            if(numero >= 1000 && numero < 10000){
                num1 = (numero/1000) % 10;
                num2 = (numero/100) % 10;
                num3 = (numero/10) % 10;
                num4 = (numero % 10) % 10;
                System.out.println("d1 = " + num1);
                System.out.println("d2 = " + num2);
                System.out.println("d3 = " + num3);
                System.out.println("d4 = " + num4);
                resultado = (num1+num2+num3+num4);
                System.out.println("La suma de los números es = " + resultado);
            }
            if(numero >= 100 && numero < 1000){
                num2 = (numero/100) % 10;
                num3 = (numero/10) % 10;
                num4 = (numero % 10) % 10;
                num1 = 0;
                System.out.println("d1 = " + num1);
                System.out.println("d2 = " + num2);
                System.out.println("d3 = " + num3);
                System.out.println("d4 = " + num4);
                resultado = (num1+num2+num3+num4);
                System.out.println("La suma de los números es = " + resultado);
            }
            if(numero >=0 && numero < 100){
                
                num3 = (numero/10) % 10;
                num4 = (numero % 10) % 10;
                num1 = 0;
                num2 = 0;
                System.out.println("d1 = " + num1);
                System.out.println("d2 = " + num2);
                System.out.println("d3 = " + num3);
                System.out.println("d4 = " + num4);
                resultado = (num1+num2+num3+num4);
                System.out.println("La suma de los números es = " + resultado);
            }
        }
    }   