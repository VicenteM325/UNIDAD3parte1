import java.util.Scanner;
    public class Ejercicio5{
        public static void main(String[] args){
            int valor1, valor2;
            Scanner entrada = new Scanner(System.in);
            System.out.print("Ingrese un número: ");
            valor1 = entrada.nextInt();
            valor2 = valor1+1;
            System.out.println("El número siguiente a " + valor1 + " es = " + valor2 );
        }
    }