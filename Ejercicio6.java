import java.util.Scanner;
    public class Ejercicio6{
        public static void main(String[] args){
            double aumentado;
            int aleatorio = (int)(Math.random()*200+1);
            System.out.println("El número obtenido al azar es = " + aleatorio);
            aumentado = aleatorio + (aleatorio*0.3);
            System.out.println("El número aleatorio " + aleatorio + " aumentado al 30% es = " + aumentado);
        }
    }