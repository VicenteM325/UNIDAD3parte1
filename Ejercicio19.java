public class Ejercicio19{
    public static void main(String[] args){
        int aleatorio = (int)(Math.random()*1000+1);
        System.out.println("El valor del número aleatorio es = " + aleatorio);
        if(aleatorio < 25 && aleatorio % 5 == 0){
            System.out.println("Correcto");
        } else {
            System.out.println("El número " + aleatorio + " no  es menor a 25 y/o no es divisible entre 5");
        }
    }
}