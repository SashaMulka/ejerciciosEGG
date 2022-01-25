/*Crea una aplicación que a través de una función nos convierta una cantidad de 
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o 
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a 
converir que será una cadena, este no devolverá ningún valor y mostrará un 
mensaje indicando el cambio (void).
El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €*/

package Ej_19;

import java.util.Locale;
import java.util.Scanner;

public class Ej_19 {

  
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Cuantos euros quiere convertir?");
        double euros = entry.nextDouble();
        System.out.println("Desea convertirlos a libras, yenes o dolares?");
        String moneda = entry.next().toLowerCase();
        
        convertidor(euros, moneda);
    }

public static void convertidor(double euros, String moneda) {
    switch (moneda){
        case "libras":
            System.out.println("Libras: " + euros*0.86);
            break;
        case "dolares":
            System.out.println("Dolares: " + euros*1.28611);
            break;
        case "yenes":
            System.out.println("Yenes: " + euros*129.852);
            break;
        default:
            System.out.println("La moneda ingresa no es una opcion valida");
    }
       
       
       
    }
}
