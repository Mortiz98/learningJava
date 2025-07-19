
package arreglos;

import java.util.Scanner;


public class Ejercicios {
    
      public static void main(String[] args) {
      
      /*Leer 5 numeros por teclado, almacenarlos en un arreglo y a continuacion realizar
        la media de los numeros positivos, la media de los negativos y contar el numero
        de ceros*/
      
     Scanner scanner = new Scanner(System.in);
     int cant_numeros;
          System.out.println("Digita la cantidad de numeros del arreglo: ");
          cant_numeros = scanner.nextInt();
          
          int[] numeros = new int[cant_numeros];
           
      // Ingresamos los numeros del arreglo
      
          for (int i = 0; i < cant_numeros; i++) {
              System.out.println("Ingrese el numero "+(i+1));
              numeros[i] = scanner.nextInt();
          }
       //Imprimimos el arreglo
          System.out.println("Los numeros del arreglo son: ");
          for( int i: numeros){
              System.out.println(i);
          }
          
          
      
      
      }
    
}
