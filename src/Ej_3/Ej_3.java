/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y 
después toda en minúsculas. Nota: investigar la función toUpperCase() y 
toLowerCase() en Java
 */
package Ej_3;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;


public class Ej_3 {

    
    public static void main(String[] args) {
Scanner leer = new Scanner(System.in);

System.out.println("Ingrese su frase");
String frase = leer.nextLine();

System.out.println(toUpperCase(frase));
System.out.println(toLowerCase(frase));
    }
    
}
