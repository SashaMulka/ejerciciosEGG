/*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”*/

package Ej_17;

import java.util.Locale;
import java.util.Scanner;


public class Ej_17 {

  
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        
        System.out.println("Ingrese el tamaño del cuadrado");
        int n = entry.nextInt();
       
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==0 || j==0 || i==n-1 || j==n-1) {
                System.out.print("* ");
            }else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        
    }
}
