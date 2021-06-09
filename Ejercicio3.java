import java.util.Scanner;
    public class Ejercicio3{
        public static void main(String[] args){
            int valor, doble, triple;
            Scanner entrada = new Scanner(System.in);
            System.out.print("Ingrese un número: ");
            valor = entrada.nextInt();
            doble = valor * 2;
            triple = valor * 3;
            System.out.println("El valor doble de " + valor + " es = " + doble);
            System.out.println("El valor triple de " + valor + " es = " + triple);
        }

    }