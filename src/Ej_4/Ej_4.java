/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en 
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package Ej_4;

import java.util.Scanner;


public class Ej_4 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Cuantos grados °C hay?");
        Double centigrados = leer.nextDouble();
         
        Double fahrenheit = 32 + (9 * centigrados / 5);                        
             
                
        System.out.println("Eso son: " + fahrenheit + " °F");
        
        

    }
    
}
