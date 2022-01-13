/*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa 
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: 
investigar la función equals() en Java.*/

package Ej_8;

import java.util.Scanner;


public class Ej_8 {

  
    public static void main(String[] args) {
    Scanner leer= new Scanner(System.in);

        System.out.println("Escriba eureka");
        String palabra = leer.nextLine();
        
        if ("eureka".equals(palabra)) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }

}
