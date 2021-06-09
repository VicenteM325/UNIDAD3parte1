import java.util.Scanner;
    public class Ejercicio15{
        public static void main(String[] args){
            double valor;
            Scanner entrada = new Scanner(System.in);
            System.out.print("Ingrese un número: ");
            valor = entrada.nextDouble();
            if(valor == 0){
                System.out.println("El número ingresado es nulo");
            } else if(valor < 0){
                System.out.println("El número ingresado es negativo");

            } else if(valor > 0){
                System.out.println("El número ingresado es positivo");
            }
             else{
                System.out.println("Usted ingresó un caracter no válido");
            }
        }
    }