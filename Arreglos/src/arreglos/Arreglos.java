

package arreglos;

import java.util.Scanner;



public class Arreglos {

   
    public static void main(String[] args) {

       /*Scanner scanner = new Scanner(System.in);
       int cant_letras;
       
        System.out.println("Ingrese la cantidad de letras : ");
        cant_letras = scanner.nextInt();
        
        char[] letras = new char[cant_letras];
        
        //ingresamos las letras
        
        for (int i = 0; i < cant_letras; i++) {
            System.out.println(" Digite la letra "+ (i+1));
            letras[i] = scanner.next().charAt(0);
        }
        // imprimimos el arreglo
        /*System.out.print("Las letras del arreglo son: ");
        for (int i = 0; i < cant_letras; i++) {
            System.out.print(letras[i]);
        }
       // for each
        System.out.print("Las letras del arreglo son: ");
       for(char i: letras){
           System.out.print( i +" "); */
        
      //------------------------------------------------------------------------------------------------------------------------------ 
       
       /*Leer 5 numeros por teclado, almacenarlos en un arreglo y a continuacion realizar
        la media de los numeros positivos, la media de los negativos y contar el numero
        de ceros*/
      
     Scanner scanner = new Scanner(System.in);
     float cant_numeros, conteo_ceros = 0, conteo_pos = 0, conteo_neg = 0, media_neg, media_pos,sum_pos= 0,sum_neg= 0;
     float[] numeros = new float[5];
           
      // Ingresamos los numeros del arreglo
        System.out.println("Por favor ingrese 5 numeros");
          for (int i = 0; i < 5; i++) {
              System.out.println("Ingrese el numero "+(i+1));
              numeros[i] = scanner.nextInt();
              
              if (numeros[i] == 0){
                  conteo_ceros += 1;
              } 
              else if(numeros[i]>0) {
              conteo_pos +=1;
              sum_pos += numeros[i];
              }
          else {
              conteo_neg +=1;
              sum_neg += numeros[i];
         
          }
          }
       //Imprimimos el arreglo
          System.out.print("Los numeros del arreglo son: ");
          for( float i: numeros){
              System.out.print(i);
          }
          System.out.println("La suma de positivos es "+ sum_pos);
          System.out.println("La suma de negativos es "+ sum_neg);
          System.out.println("La cantidad de ceros es "+ conteo_ceros);
          System.out.println("La cantidad de positivos es "+conteo_pos);
          System.out.println("La cantidad de negativos es "+conteo_neg);
          
        
              
       }
    }
    

