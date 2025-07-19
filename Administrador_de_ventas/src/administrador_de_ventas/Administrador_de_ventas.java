
package administrador_de_ventas;

import java.util.Scanner;

public class Administrador_de_ventas {

  
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       
        System.out.println("Ingrese la cantidad de productos: ");
        int cant_productos = entrada.nextInt();
        
        String[]nombres = new String[cant_productos];
        double[]precios = new double[cant_productos];
        
        //Ingresar productos 
       
        for (int i = 0; i < cant_productos; i++) {
             entrada.nextLine();
            System.out.println("Ingrese el producto "+(i+1)+":");
            nombres[i]=entrada.nextLine();
            System.out.println("Ingrese el precio "+(i+1)+":");
            precios[i]=entrada.nextInt();     
        }
        
       //Calcular total de ventas
        double total_ventas = 0;
        for (int i = 0; i < cant_productos; i++) {
            total_ventas += precios[i];
        }
        
        //Mostrar valores
        
        System.out.println("Productos: \n");
        for (int i = 0; i < cant_productos; i++) {
            System.out.println("Producto: " +nombres[i]+" - "+"Precio: "+precios[i]); 
        }
        System.out.println("Total de ventas: "+ total_ventas);
                
    }
    
}
