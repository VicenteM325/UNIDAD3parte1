import java.util.Scanner;
    public class Ejercicio10{
        public static void main(String[] args){
            int base, altura, perimetro, area;
            Scanner entrada = new Scanner(System.in);
            System.out.print("Ingrese el valor de la base: ");
            base = entrada.nextInt();
            System.out.print("Ingrese el valor de la altura: ");
            altura = entrada.nextInt();
            perimetro = (2*base)+(2*altura);
            area = base*altura;
            System.out.println("El valor del perimetro es = " + perimetro);
            System.out.println("El valor del area es = " + area);
        }
    }