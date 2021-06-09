import java.util.Scanner;
    public class Ejercicio7{
        public static void main(String[] args){
            int aleatorio = (int)(Math.random()*50+1);
            double disminuido;
            if(aleatorio > 10 && aleatorio < 50){
                System.out.println("El número aleatorio es = " + aleatorio);
                disminuido = aleatorio - (aleatorio*0.15);
                System.out.println("El número " + aleatorio + " disminuido al 15% es = " + disminuido);
            }
        }
    }