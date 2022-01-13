//Crear un programa que dado un numero determine si es par o impar

package Ej_7;

import java.util.Scanner;


public class Ej_7 {

  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número");
        int num = leer.nextInt();
        
        if (num%2==0){
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
        
    }

}
