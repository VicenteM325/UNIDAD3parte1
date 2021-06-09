import java.util.Scanner;
    public class Ejercicio4{
        public static void main(String[] args){
            int cuadrado, cubo, valor;
            Scanner entrada = new Scanner(System.in);
            System.out.print("Ingrese un número: ");
            valor = entrada.nextInt();
            cuadrado = valor*valor;
            cubo = valor*valor*valor;
            System.out.println("El cuadrado de " + valor + " es = " + cuadrado);
            System.out.println("El cubo de " + valor + " es = " + cubo);
        }
    }