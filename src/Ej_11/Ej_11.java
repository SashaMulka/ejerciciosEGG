/*Considera que estás desarrollando una web para una empresa que fabrica motores 
(suponemos que se trata del tipo de motor de una bomba para mover fluidos). 
Definir una variable tipoMotor y permitir que el usuario ingrese un valor entre 1 y 4. 
El programa debe mostrar lo siguiente:
o Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una 
bomba de agua”. 
o Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una 
bomba de gasolina”. o Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una 
bomba de hormigón”. 
o Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una 
bomba de pasta alimenticia”.
o Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No 
existe un valor válido para tipo de bomba”*/

package Ej_11;

import java.util.Scanner;


public class Ej_11 {

  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        boolean valido = false;
        while(valido == false){
        System.out.println("Que motor estas buscando?");
        int tipoMotor = leer.nextInt();
        
        switch(tipoMotor) {
            case 1:
                    System.out.println("La bomba es una bomba de agua");
                    valido = true;
            break;
            case 2:
                    System.out.println("La bomba es una bomba de gasolina");
                    valido = true;
                    break;
            case 3:
                    System.out.println("La bomba es una bomba de hormigon");
                    valido = true;
                    break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                valido = true;
                break;
            default:
                System.out.println("El valor no es válido para ningun tipo de bomba");
        }         
        } 

    }

}
