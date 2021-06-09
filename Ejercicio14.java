import java.util.Scanner;
    public class Ejercicio14{
        public static void main(String[] args){
            int numUno, numDos;
            Scanner entrada = new Scanner(System.in);
            System.out.print("Ingrese el primer número: ");
            numUno = entrada.nextInt();
            System.out.print("Ingrese el segundo número: ");
            numDos = entrada.nextInt();
            if(numDos%numUno == 0){
                System.out.println("Es divisible");
            } else {
                System.out.println("El número " + numDos + " no es divisible entre el número " + numUno);
            }
        }
    }