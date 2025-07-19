package cajero_automatico;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cajero_automatico {

    /*Simula el funcionamiento de un cajero automatico permitiendo al usuario
    consultar saldo, depositar dinero, retirar dinero*/
 /* Scanner scanner = new Scanner(System.in);
        
       double saldo= 1000,cantidad_retirar,deposito;
       int opcion;
       
       while(true){
           System.out.println("Bienvenido al servicio de cajero automatico");
           System.out.println("1. Consultar saldo");
           System.out.println("2. Retirar dinero");
           System.out.println("3. Depositar dinero");
           System.out.println("4. Salir");
           System.out.println("Seleccione una opcion: ");
           
           opcion = scanner.nextInt();
           
           switch(opcion){
               case 1: System.out.println("Su saldo es "+saldo);
               break;
               
               case 2: System.out.println("Ingrese la cantidad a retirar: ");
               cantidad_retirar = scanner.nextDouble();
               if(cantidad_retirar <= saldo && cantidad_retirar > 0){
               saldo -= cantidad_retirar;
                   System.out.println("Su retiro fue de "+cantidad_retirar+", su nuevo saldo es "+saldo);
               }
               else{
                   System.out.println("Saldo insuficiente");
               }
               break;
               
               case 3: System.out.println("Ingrese la cantidad a depositar: ");
               deposito = scanner.nextDouble();
               if(deposito >0){
               saldo += deposito;
                   System.out.println("Su deposito fue de "+deposito+", su saldo es "+saldo);
               }
               else {
                   System.out.println("Valor no valido");
               }
               break;
               
               case 4: System.out.println("Saliendo del cajero automatico");
               System.exit(0);
             default:
                 System.out.println("Opcion no valida");    
                     
           }
                 
                 
       }*/
  private static final Map<String, String> usuarios = new HashMap<>();
private static final Map<String, Double> saldo = new HashMap<>();

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int opcion, opcion1;
    String nombre_de_usuario, contraseña;

    do {
        System.out.println("Bienvenido al cajero automático");
        System.out.println("1. Iniciar sesión");
        System.out.println("2. Registrar usuario nuevo");
        System.out.println("3. Salir");
        System.out.println("Seleccione una opción");
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1 -> {
                System.out.println("Ingrese su nombre de usuario: ");
                nombre_de_usuario = scanner.next();
                System.out.println("Ingrese su contraseña: ");
                contraseña = scanner.next();
                if (usuarios.containsKey(nombre_de_usuario) && usuarios.get(nombre_de_usuario).equals(contraseña)) {
                    System.out.println("¡Inicio de sesión exitoso!");
                    do {
                        System.out.println("Bienvenido " + nombre_de_usuario);
                        System.out.println("1. Consultar saldo");
                        System.out.println("2. Retirar dinero");
                        System.out.println("3. Depositar dinero");
                        System.out.println("4. Salir");
                        System.out.println("Seleccione una opción: ");
                        opcion1 = scanner.nextInt();

                        switch (opcion1) {
                            case 1 -> System.out.println("Su saldo es " + saldo.get(nombre_de_usuario));
                            case 2 -> { 
                                System.out.println("Digite el valor que desea retirar: ");
                                double cantidad_retirar = scanner.nextDouble();
                                if (cantidad_retirar <= saldo.get(nombre_de_usuario) && cantidad_retirar > 0) {
                                    saldo.put(nombre_de_usuario, saldo.get(nombre_de_usuario) - cantidad_retirar);
                                    System.out.println("Has retirado "+cantidad_retirar+" su nuevo saldo es "+saldo.get(nombre_de_usuario));
                                } else {
                                    System.out.println("Saldo insuficiente, su saldo actual es " + saldo.get(nombre_de_usuario));
                                }
                            }
                            
                            case 3 -> { 
                                System.out.println("Digite la cantidad de dinero que desea depositar :");
                                double deposito = scanner.nextDouble();
                                saldo.put(nombre_de_usuario, saldo.get(nombre_de_usuario) + deposito);
                                System.out.println("Has depositado "+deposito+" su nuevo saldo es: "+saldo.get(nombre_de_usuario));
                            }
                            case 4 -> System.out.println("Gracias por usar nuestros servicios, vuelva pronto");
                            default -> System.out.println("Opción no válida");
                        }
                    } while (opcion1 != 4);
                } else {
                    System.out.println("Nombre de usuario o contraseña incorrectos");
                }
            }
            case 2 -> {
                System.out.println("Registro de usuario nuevo");
                System.out.println("Introduzca el nombre de usuario: ");
                nombre_de_usuario = scanner.next();
                System.out.println("Introduzca su contraseña: ");
                contraseña = scanner.next();

                if (usuarios.containsKey(nombre_de_usuario)) {
                    System.out.println("El usuario ya está en uso, intente con otro");
                } else {
                    usuarios.put(nombre_de_usuario, contraseña);
                    saldo.put(nombre_de_usuario, 0.0);
                    System.out.println("Usuario registrado exitosamente");
                }
                
            }
            case 3 -> System.out.println("¡Hasta luego!");
      
            default -> System.out.println("Opción no válida");
        }
    } while (opcion != 3);
}
}

