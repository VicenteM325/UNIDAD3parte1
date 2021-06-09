import java.util.Scanner;
    public class Ejercicio2{
        public static void main(String[] args){
            String pais, capital;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nombre del pais: ");
            pais = scanner.nextLine();
            System.out.print("Nombre de la capital: ");
            capital = scanner.nextLine(); 
            System.out.println(capital + " es la capital de " + pais);
        }
    }