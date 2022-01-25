/*Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el 
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
*/

package Ej_18;

import java.util.Locale;
import java.util.Scanner;

public class Ej_18 {

  
    public static void main(String[] args) {
    Scanner entry = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    
    int num1, num2, num3, num4;
        System.out.println("Ingrese 4 números del 1 al 20");
    do {
        System.out.println("Ingrese el 1° número");
        num1 = entry.nextInt();
    }while (num1 < 1 || num1 > 20);
    
    do {
        System.out.println("Ingrese el 2°");
        num2 = entry.nextInt();
    }while (num2 < 1 || num2 > 20);
    
    do {
        System.out.println("Ingrese el 3°");
        num3 = entry.nextInt();
    }while (num3 < 1 || num3 > 20);    
    
    do {
        System.out.println("Ingrese el 4°");
        num4 = entry.nextInt();
    }while (num4 < 1 || num4 > 20);    
    
        asteriscos(num1);
        asteriscos(num2);
        asteriscos(num3);
        asteriscos(num4);
       
    
    }
public static void asteriscos(int num) {
    System.out.print(num + " ");
        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
        System.out.println("");
}
}

