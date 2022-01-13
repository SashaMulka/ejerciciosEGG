/*
Realizar un programa que pida dos números enteros positivos por teclado y 
muestre por pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por 
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la 
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir 
del programa directamente, se debe mostrar el siguiente mensaje de confirmación: 
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el 
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú
*/

package Ej_14;

import java.util.Scanner;


public class Ej_14 {

  
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero entero positivo");
        int num1 = leer.nextInt();
        System.out.println("Ingrese otro");
        int num2 = leer.nextInt();
        boolean salir = false;
        
        do{
        System.out.println("-----Menu-----");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        int opt = leer.nextInt();
        
        switch(opt){
            case 1:
                int suma = num1 + num2;
                System.out.println("La suma es igual a: " + suma);
                break;
            case 2:
                int resta = num1 - num2;
                System.out.println("La resta es igual a: " + resta);
                break;
            case 3:
                int mult = num1 * num2;
                System.out.println("La multiplicacion es igual a: " + mult);
                break;
            case 4:
                double div = num1 / num2;
                System.out.println("La divicion es igual a: " + div);
                break;
            case 5:
                
                String rtta;
                do {
                System.out.println("Esta seguro que desea salir del programa? S/N");
                rtta = leer.nextLine(); //como leer un caracter??
                
                switch (rtta) {
                    case "S":
                        salir = true;
                        break;
                    case "N":
                        break;
                    default:
                        System.out.println("Respuesta no valida");
                }
                }while( !(rtta == "N") || !(rtta == "S") ); 
                
        }   
        }while(!salir);
        5
    }

}
