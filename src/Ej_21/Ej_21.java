/*Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le 
pida al usuario un numero a buscar en el vector. El programa mostrará donde se 
encuentra el numero y si se encuentra repetido*/

package Ej_21;

import java.util.Locale;
import java.util.Scanner;


public class Ej_21 {

  
    public static void main(String[] args) {
               Scanner entry = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
               
               int[] vector = new int [10];
               //String ubicaciones = "";
               
               for (int i=0; i<10; i++){
                   vector[i]=(int) (Math.random() * 10); 
               }

             
               System.out.println("Elija un numero del 0 al 9");
               int num = entry.nextInt();
               
               System.out.print("El numero se encuentra en las posiciones: ");
               for (int i=0; i<10; i++) {
                   if (vector[i]==num){
                       System.out.print(i + " ");
                       
                       //ubicaciones.concat(String.valueOf(i) + " ");
                       
                   }
                }
               System.out.println();
               
    }
    

}
