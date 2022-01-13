/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación 
solicite números al usuario hasta que la suma de los números introducidos supere 
el límite inicial.
*/

package Ej_13;

import java.util.Scanner;


public class Ej_13 {

  
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el limite");
        int limite = leer.nextInt();
        int suma = 0;
        do {
            System.out.println("Ingrese un numero de unidades");
            int num = leer.nextInt();
            suma = suma + num;
            System.out.println("Suma: "+ suma);
        } while(suma < limite);
                
        System.out.println("Limite alcanzado");
        
                
    }

}
