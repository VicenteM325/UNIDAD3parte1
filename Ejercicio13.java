import java.util.Scanner;
    public class Ejercicio13{
        public static void main(String[] args){
            double radio, altura, volumen;
            Scanner entrada = new Scanner(System.in);
            System.out.print("Ingrese el valor del radio: ");
            radio = entrada.nextDouble();
            System.out.print("Ingrese el valor de la altura: ");
            altura = entrada.nextDouble();
            if(radio > 0 && altura > 0){
                volumen = Math.PI*(radio*radio)*altura;
                System.out.println("El volumen del cilindro es = " + volumen);
            } else {
                System.out.println("No se puede calcular el volumen con números negativos.");
            }
        }
    }