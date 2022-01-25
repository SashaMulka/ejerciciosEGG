/*Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y 
los muestre por pantalla en orden descendente*/

package Ej_20;

import java.util.Locale;
import java.util.Scanner;

public class Ej_20 {

  
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        int[] vector = new int [100];
        vector[0] = 0;
        
        for (int i = 99; i > 0; i--) {
            vector[i-99] = vector[i]; 
        }
        
        for (int i = 0; i < 99; i++) {
            System.out.println(vector[i]);
        }
    }

}
