/*Implementar un programa que dado dos números enteros determine cuál es el 
mayor y lo muestre por pantalla.*/

package Ej_6;

import java.util.Scanner;


public class Ej_6 {

  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int mayor = 0;
        
        System.out.println("Ingrese un número");
        int num1 = leer.nextInt();
                
        System.out.println("Ingrese otro número");
        int num2 = leer.nextInt();
        
        if (num1 > num2){
            mayor = num1;
            System.out.println(mayor + " es el mayor de los dos números");
        } else if (num2 > num1){
            mayor = num2;
            System.out.println(mayor + " es el mayor de los dos números");
        } else {
            System.out.println("error, los numeros parecen ser iguales");
        }
        
        
    }

}
