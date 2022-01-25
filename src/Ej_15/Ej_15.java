/*Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe 
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa 
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el 
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.*/

package Ej_15;

import java.util.Locale;
import java.util.Scanner;


public class Ej_15 {

  
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    
    int contador = 0; 
    int total = 0;
    int num;
   
        for (int i = 0; i < 20; i++) {
            
            num = entry.nextInt();
            
            if (num > 0) {
                total = total + num;
             
            } else if (num==0){
                System.out.println("Se capturo el número 0");
            break;
            }
               
        }
    
            System.out.println("Suma total: " + total);
        }
    }
