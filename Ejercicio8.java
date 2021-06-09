import java.util.Scanner;
    public class Ejercicio8{
        public static void main(String[] args){
            int numUno, numDos, numTres;
            double promedio;
            Scanner entrada = new Scanner(System.in);
            System.out.print("Ingrese primer número: ");
            numUno = entrada.nextInt();
            System.out.print("Ingrese segundo número: ");
            numDos = entrada.nextInt();
            System.out.print("Ingrese tercer número: ");
            numTres = entrada.nextInt();
            promedio = ((numUno+numDos+numTres)/3);
            System.out.println("El promedio de los números es = " + promedio);
        }
    }