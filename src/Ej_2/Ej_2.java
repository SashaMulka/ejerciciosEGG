/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre 
por pantalla
 */
package Ej_2;

import java.util.Scanner;

public class Ej_2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Como te llamas?");
        String nombre = entrada.nextLine();
        
        System.out.println("Su nombre es " + nombre);
        
        
    }
    
}
