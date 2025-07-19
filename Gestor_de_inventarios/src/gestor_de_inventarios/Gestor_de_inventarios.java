
package gestor_de_inventarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gestor_de_inventarios {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        List<Producto> inventario = new ArrayList < > ();

        System.out.println("Bienvenido al sistema de gestion de invetarios");
        System.out.println("MENU");
        System.out.println("1.Agregar producto");
        System.out.println("2.Consultar producto");
        System.out.println("3.Vender producto");
        System.out.println("4.Calcular total del producto");
        System.out.println("5.Salir");

        int opcion;

        do {
            System.out.println("Seleccione una opcion: ");
            opcion = entrada.nextInt();

            switch (opcion) {

                case 1:
                    entrada.nextLine();
                    System.out.println("Ingrese el nombre del producto: ");
                    String nombre = entrada.nextLine();
                    System.out.println("Ingrese el precio del producto: ");
                    double precio = entrada.nextDouble();
                    entrada.nextLine();
                    
                    Producto producto = new Producto(nombre,precio);
                    inventario.add(producto);
                    System.out.println("Producto agregado al inventario");
                    break;
                    
                case 2: 
                    System.out.println("INVENTARIO: ");
                    for(Producto i: inventario){
                        System.out.println(i.getNombre()+"-$"+i.getPrecio());
                    }
                    break;
                    
                case 3:
                    System.out.println("Ingrese el indice del producto a vender: ");
                    int indice = entrada.nextInt();
                    
                    if(indice>= 0 && indice<inventario.size()){
                    Producto productoVendido = inventario.remove(indice);
                        System.out.println("Producto vendido: "+ productoVendido.getNombre());
                    }
                    else{
                        System.out.println("Indice invalido, intente nuevamente");
                    }
                    break;
                    
                case 4: 
                    double valorTotal = 0;
                    for(Producto i :inventario){
                    valorTotal += i.getPrecio();
                }
                          
                    System.out.println("El valor total del inventrio es: " + valorTotal);
                    break;
                    
                case 5: 
                    System.out.println("Hasta luego, gracias por usar nuestro servicio");
                    
                    
                    
                    
                  
            }

        } while(opcion != 5);
        
        entrada.close();
        
            
            
        
    }

}

}
