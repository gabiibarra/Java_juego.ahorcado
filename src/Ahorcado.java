import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
       Scanner leer = new Scanner(System.in);

       String[] palabras={"programa", "codigo","teclado","lenguaje", "java", "computadora"};
       Random rand = new Random();
       String palabraSecreta = palabras[rand.nextInt(palabras.length)];

       int intentosMax = 8;
       int intentos = 0;
       int palabraAdivinada = 0;
       
       char[] progreso = new char[palabraSecreta.length()];
        for (int i = 0; i < progreso.length; i++) {
            progreso[i] = '_';

        }
    
        System.out.println("------------- JUEGO DEL AHORCADO ------------- \n"); 

        while (palabraAdivinada !=1 && intentos < intentosMax) {           
            System.out.println(String.valueOf(progreso));
            System.out.println("Introduce una letra porfavor");
            char letra = Character.toLowerCase(leer.next().charAt(0));
            
            boolean letracorrecta = false;

            for (int i=0; i<palabraSecreta.length();i++){
                if (palabraSecreta.charAt(i)== letra){
                    progreso[i]=letra;
                    letracorrecta =true;

                }
            }

            if (!letracorrecta){
                intentos++;
                System.out.println("Letra incorrecta");
                /*como le agrego las partes del ahrcado si va perdiendo */
            }

            if (String.valueOf(progreso).equals(palabraSecreta)){
                palabraAdivinada = 1;
                System.out.println("\n Felicidades Ganaste  "+palabraSecreta);
            }


         }
         
         if (palabraAdivinada!= 1) {
            System.out.println("\n GAME OVER");
         }

         leer.close();

    }
}