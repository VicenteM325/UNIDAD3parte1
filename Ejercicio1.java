import java.util.Scanner;
    public class Ejercicio1{
        public static void main(String[] args){
            int numUno, numDos, resultado;
            Scanner scanner = new Scanner (System.in);
            System.out.print("Ingrese un número: ");
            numUno = scanner.nextInt();
            System.out.println("");
            System.out.print("Ingrese un número: ");
            numDos = scanner.nextInt();
            resultado = numUno + numDos;
            System.out.println("El resultado de la suma es = " + resultado);  
        }

    }