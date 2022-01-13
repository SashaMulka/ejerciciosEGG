/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla 
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función 
Math.sqrt()
 */
package Ej_5;

import java.util.Scanner;


public class Ej_5 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        double num = leer.nextDouble(); 
                
        double doble = num * 2;
        double triple = num * 3;
        double raiz2 = Math.sqrt(num);
        
        System.out.println("El doble de su numero es: " + doble);
        System.out.println("El triple de su numero es: " + triple);
        System.out.println("La raiz cuadrada de su número es: " + raiz2);
                
    }
    
}
