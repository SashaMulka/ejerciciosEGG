

package Ej_25;

import java.util.Locale;
import java.util.Scanner;


public class Ej_25 {

  
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        int totalcolumnas = 0, totalfilas = 0, totaldiagonal1 = 0,totaldiagonal2 = 0;
        int[][] matriz = new int [3][3];
        
        System.out.println("Rellene la matriz");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do{
                matriz[i][j] = entry.nextInt();
                }while (matriz[i][j]<0 || matriz[i][j]>10);
            }    
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                totalfilas += matriz[i][j];
                totalcolumnas += matriz[j][i];
                if (i == j) {
                    totaldiagonal1 = matriz[i][j];
                }
                if (i+j == 2) {
                    totaldiagonal2 += matriz[i][j];
                }
            }
           
        }
        
        if (totalfilas == totalcolumnas && totaldiagonal1 == totaldiagonal2 && totalfilas/3 == totaldiagonal1){
            System.out.println("LA MATRIZ ES MAGICA");
        }else{
            System.out.println("LA MATRIZ NO ES MAGICA");
        }
    }

}
