import java.util.Scanner;
    public class Ejercicio9{
        public static void main(String[] args){
            String palabraUno, palabraDos, auxiliar;
            Scanner entrada = new Scanner(System.in);
            System.out.print("Ingrese palabra 1: ");
            palabraUno = entrada.nextLine();
            System.out.print("Ingrese palabra 2: ");
            palabraDos = entrada.nextLine();
            auxiliar = palabraUno;
            palabraUno = palabraDos;
            palabraDos = auxiliar;
            System.out.println("Cambiando posición de palabras");
            System.out.println("Palabra 1 = " + palabraUno);
            System.out.println("Palabra 2 = " + palabraDos);
        }
    }