import java.util.Scanner;
    public class Ejercicio12{
        public static void main(String[] args){
            double celsius, fahrenheit;
            Scanner entrada = new Scanner(System.in);
            System.out.print("Ingrese el valor de grados celsius: ");
            celsius = entrada.nextDouble();
            fahrenheit = (celsius*(9/5)+32);
            System.out.println("El valor de " + celsius + " grados celsius a fahrenheit es = " + fahrenheit);
        }
    }