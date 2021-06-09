import java.util.Scanner;
    public class Ejercicio16{
        public static void main(String[] args){
            int numUno, numDos, numTres;
            Scanner entrada = new Scanner(System.in);
            System.out.print("Ingrese primer número: ");
            numUno = entrada.nextInt();
            System.out.print("Ingrese segundo número: ");
            numDos = entrada.nextInt();
            System.out.print("Ingrese tercer número: ");
            numTres = entrada.nextInt();
            if(numUno > numDos && numUno > numTres){
                System.out.println("El número mayor es:: " + numUno);
            }
            if(numDos > numUno && numDos > numTres){
                System.out.println("El número mayor es: " + numDos);
            }
            if(numTres > numUno && numTres > numDos){
                System.out.println("El número mayor es: " + numTres);
            }
        }
    }