import java.util.Scanner;
    public class Ejercicio11{
        public static void main(String[] args){
            double centimetros, yardas, metros, pies, pulgadas;
            Scanner entrada = new Scanner(System.in);
            System.out.print("Ingrese un número en centímetros: ");
            centimetros = entrada.nextDouble();
            yardas = centimetros/91.44;
            metros = centimetros/100;
            pies = centimetros/30.48;
            pulgadas = centimetros/2.54;
            System.out.println("El valor de " + centimetros + " a yardas es = " + yardas);
            System.out.println("El valor de " + centimetros + " a metros es = " + metros);
            System.out.println("El valor de " + centimetros + " a pies es = " + pies);
            System.out.println("El valor de " + centimetros + " a pulgadas es = " + pulgadas);
        }
    }