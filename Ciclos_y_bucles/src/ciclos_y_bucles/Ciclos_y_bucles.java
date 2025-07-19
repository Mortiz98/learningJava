package ciclos_y_bucles;

import java.time.Clock;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ciclos_y_bucles {

    public static void main(String[] args) {

        //Pedir numeros hasta que se teclee uno negativo y mostrar cuantos se han introducido y la suma
        /* Scanner scanner = new Scanner(System.in);
        
        
        int num,suma=0,contador=0;
        System.out.println("Digite un numero: ");
        num = scanner.nextInt();
        
        while(num>0){
        suma +=num;
        contador +=1;
            System.out.println("Digite un numero: ");
            num = scanner.nextInt();
            }
        System.out.println("Se han introducido "+contador+" numeros, y la suma de ellos es "+ suma);*/
        //-----------------------------------------------------------------------------------------------------------------
//Pedir 5 numeros y escribir la suma total
        /* Scanner scanner = new Scanner(System.in);
        int num, suma = 0;

        for (int i = 0; i < 5; i++){
        System.out.println("Digite el numero "+(i+1)+":");
        num = scanner.nextInt();
        suma += num;
        }
        System.out.println("La suma de los numeros ingresados es: "+suma);*/
        //--------------------------------------------------------------------------------------------------------------------
        /*Pedir 10 numeros, sacar la media de los numeros positivos, la media de los numeros negativos
       y la cantidad de ceros.
         */
 /* int num, media_positivos, media_negativos, contador_ceros = 0, suma_positivos=0, suma_negativos=0,contador_positivos=0,contador_negativos=0;
        

        for (int i= 0; i<10; i++) {

            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero " + (i + 1) + ":"));
            if (num == 0) {
                contador_ceros += 1;
            } else if (num > 0) {
                suma_positivos += num;
                contador_positivos +=1;
            } else {
                suma_negativos += num;
                contador_negativos +=1;
            }
         
        }
      
        media_negativos = suma_negativos/contador_negativos;
        media_positivos = suma_positivos/contador_positivos;
        JOptionPane.showMessageDialog(null,"La cantidad de ceros es "+contador_ceros+" la suma de positivos es " 
        +suma_positivos+" su media es "+media_positivos+ " La suma de negativos es "+suma_negativos+" su media es "+media_negativos);
         */
        //----------------------------------------------------------------------------------------------------------------------------------
        /*Dadas las edades y alturas de 5 alumnos, mostrar la edad y estatura media, la cantidad de alumnos
        mayores de 18 años y la cantidad de alumnos que miden mas de 1.75.*/
 /*    int edad, mayores_18 = 0, alumnos_altos = 0, suma_edad = 0, contador_edad = 0, contador_estatura = 0;
        float estatura, est_media, edad_media, suma_estatura = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite la edad del alumno " + (i + 1) + ":");
            edad = scanner.nextInt();
            suma_edad += edad;
            contador_edad += 1;
            if (edad >= 18) {
                mayores_18 += 1;
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite la estatura del alumno " + (i + 1) + ":");
            estatura = scanner.nextFloat();
            suma_estatura += estatura;
            contador_estatura += 1;
            if (estatura > 1.75) {
                alumnos_altos += 1;
            }
        }
        est_media = suma_estatura / contador_estatura;
        edad_media = suma_edad / contador_edad;

        System.out.println("La edad media es " + edad_media);
        System.out.println("La estatura media es " + est_media);
        if(mayores_18>0){
        System.out.println("Hay " + mayores_18 + " Alumnos mayores de edad");
        }
        else{
            System.out.println("No hay alumnos mayores de edad");
        }
        if(alumnos_altos>0){
        System.out.println("Hay " + alumnos_altos + " que miden mas de 1.75");
        }
        else {
            System.out.println("No hay alumnos mas altos de 1.75");
        }
//-----------------------------------------------------------------------------------------------------------------------------------------
         */
 /*Una empresa que se dedica a la venta de desinfectantes necesita un programa para gestionar las
facturas. En cada factura figura: el código del artículo, la cantidad vendida en litros y el
precio por litro. 
Se pide de 5 facturas introducidas: Facturación total, cantidad en litros vendidos del artículo 1
y cuantas facturas se emitieron de más de 600 €.*/
 /* Scanner scanner = new Scanner(System.in);
       
       int codigo, litros,fact_mas_600=0,cant_art_1=0;
       float precio,importe_total=0,facturacion_total=0;
       
       for (int i=0; i<5;i++){
           System.out.println("Factura n°"+(i+1));
           System.out.println("Introduzca el codigo del articulo:  ");
           codigo = scanner.nextInt();
           System.out.println("Introduzca la cantidad vendida en litros: ");
           litros = scanner.nextInt();
           System.out.println("Introduzca el precio por litro: ");
           precio = scanner.nextFloat();
           
           importe_total = litros * precio;
           System.out.println("El importe total de la factura "+(i+1)+" es de "+importe_total);
            if(codigo==1){
           cant_art_1 += litros;
           }
             if(importe_total>600){
            fact_mas_600 += 1;
           }
             facturacion_total += importe_total;
           
       }
          System.out.println("La facturacion total es de: "+facturacion_total);
           
           
           if(fact_mas_600==0){
               System.out.println("No hubieron facturas mayores a 600");
           }
           else{
               System.out.println("hubieron "+fact_mas_600+ " facturas mayores a 600");
                
           }
           System.out.println("La cantidad de litros vendida con el codigo 1 fue de "+cant_art_1);*/
        //----------------------------------------------------------------------------------------------------------------------------   
        String frase = "Tres trigo tristes tigres tragan trigo en un trigal";
        String palabra = "trigo";
        int cantidad = 0;

        bucle:
        for (int i = 0; i < frase.length(); i++) {
            int k = i;
            for (int j = 0; j < palabra.length(); j++) {
                if (frase.charAt(k++) != palabra.charAt(j)) {
                    continue bucle;
                }
            }
         cantidad ++;
        }
        

        System.out.println("Encontrado " + cantidad + " vez la palabra " + palabra);

    }

}
