/*
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 
la nota se pedirá de nuevo hasta que la nota sea correcta.
*/

package Ej_12;

import java.util.Scanner;


public class Ej_12 {

  
    public static void main(String[] args) {
Scanner leer = new Scanner(System.in);
double nota;        
do{
    System.out.println("Ingrese su nota");
nota = leer.nextDouble();
if(nota<11 && nota>=0){
    System.out.println("OK");
} else {
    System.out.println("Nota invalida");
}
    
} while(nota < 0 || nota > 10);        
    }

}
