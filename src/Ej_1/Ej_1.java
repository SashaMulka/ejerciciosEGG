/*
 Escribir un programa que pida dos números enteros por teclado y calcule la suma 
de los dos. El programa deberá después mostrar el resultado de la suma
 */
package Ej_1;

import java.util.Scanner;

public class Ej_1 {


    public static void main(String[] args) {
       Scanner Entrada = new Scanner(System.in);
       
       System.out.println("Ingrese un numero");
       int num1 = Entrada.nextInt(); 
               
       System.out.println("Ingrese otro numero");
       int num2 = Entrada.nextInt();
       
       int rtta = num1 + num2;
       System.out.println("La suma es " + rtta);
    }
    
}
