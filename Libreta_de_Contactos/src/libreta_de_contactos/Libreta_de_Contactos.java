package libreta_de_contactos;

import java.util.Scanner;

public class Libreta_de_Contactos {

    private static final int Max_contacts = 10;
    private static String[] nombres = new String[Max_contacts];
    private static String[] numeros = new String[Max_contacts];
    private static String[] paises = new String[Max_contacts];
    private static int cantidad_contactos = 0;
    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        boolean salir = false;
        while (!salir) {
            System.out.println("\n Bienvenido a la libreta de contactos");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Buscar contacto por nombre");
            System.out.println("3. Mostrar contactos");
            System.out.println("4. Salir");
            System.out.println("Elija una opcion: ");
            int opcion = entrada.nextInt();

            entrada.nextLine(); //Limpiar el buffer

            switch (opcion) {
                case 1 -> Agregar_Contacto();
                case 2 -> Buscar_Contacto();
                case 3 -> Mostrar_Contactos();
                case 4 -> salir = true;
                default -> System.out.println("Opcion no valida, elija una opcion del 1 al 4");

            }

        }
        System.out.println("Gracias por utilizar nuestro servicio");
    }

    public static void Agregar_Contacto() {
        if (cantidad_contactos < Max_contacts) {
            System.out.println("Ingrese el nombre: ");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese el numero telefonico: ");
            String numero = entrada.nextLine();
            System.out.println("Ingrese el pais del contacto");
            String pais = entrada.nextLine();
            nombres[cantidad_contactos] = nombre;
            numeros[cantidad_contactos] = numero;
            paises[cantidad_contactos] = pais;
            cantidad_contactos++;
        }
        else{
            System.out.println("La lista de contactos esta llena...");
        }

    }
    
     public static void Buscar_Contacto(){
     
         if(cantidad_contactos == 0){
             System.out.println("La lista de contactos esta vacia");
         }
         else{
             System.out.println("Ingrese el nombre del contacto a buscar: ");
             String nombre_buscado = entrada.nextLine();
             boolean encontrado = false;
             for (int i = 0; i < cantidad_contactos; i++) {
                 if (nombres[i].equalsIgnoreCase(nombre_buscado)){
                     System.out.println("Contacto encontrado");
                     System.out.println("Nombre:"+ nombres[i]);
                     System.out.println("Numero:"+ numeros[i]);
                     System.out.println("Pais:"+ paises[i]);
                     encontrado = true;
                     break;
                 }
                 if(!encontrado){
                     System.out.println("Contacto no encontrado");
                 }
             }
         
         }
     }
     
      public static void Mostrar_Contactos(){
      
          if(cantidad_contactos==0){
              System.out.println("Lista de contactos vacia");
          }
          else{
              for (int i = 0; i < cantidad_contactos; i++) {
                  System.out.println((i+1) +"."+nombres[i]+"-"+numeros[i]+"-"+paises[i]);
              }
          }
      }

}
