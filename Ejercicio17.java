import java.util.Scanner;
    public class Ejercicio17{
        public static void main(String[] args){
            int a, b, c;
            Scanner entrada = new Scanner(System.in);
            System.out.print("Ingrese el primer valor del lado del triangulo: ");
            a = entrada.nextInt();
            System.out.print("Ingrese el segundo valor del lado del triangulo: ");
            b = entrada.nextInt();
            System.out.print("Ingrese el tercer valor del lado del triangulo: ");
            c = entrada.nextInt();
            if(a == b && b == c){
                System.out.println("Según los valores ingresados el triángulo es equilatero");
            } else if( a == b && b != c || a == c && c != b || b == c && b != a){
                System.out.println("Según los valores ingresados el triángulo es isoceles.");
            } else {
                System.out.println("Según los valores ingresados el triángulo es escaleno.");
            }
        }
    }