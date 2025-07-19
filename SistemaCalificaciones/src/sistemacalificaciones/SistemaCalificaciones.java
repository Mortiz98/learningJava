
package sistemacalificaciones;

import java.util.Scanner;


public class SistemaCalificaciones {
       private static Scanner entrada = new Scanner(System.in);
       private static String[] primero ={"pedro","andres","mateo","felipe","santiago"};
       private static String[] segundo ={"esteban","andrea","sebastian","zack","jhon"};
       private static String[] tercero ={"david","carlos","pablo","juanes","samuel"};
       private static double[] notas = new double[5];
        private static double suma = 0;
   
    public static void main(String[] args) {
    
        System.out.println("Bienvenido al sistema de calificaciones");
        System.out.println("Que grupo desea calificar? ");
        System.out.println("Grupo 1");
        System.out.println("Grupo 2");
        System.out.println("Grupo 3");
        System.out.println("Seleccione una opcion:");
        int opcion = entrada.nextInt();
                
        switch(opcion){
            
            case 1 -> Grupo1();
            case 2 -> Grupo2();
            case 3 -> Grupo3();
   
            }
       
       
    }

    public static void Grupo1() {
        System.out.println("El grupo 1 esta compuesto por: ");
        for (int i = 0; i < primero.length; i++) {
            System.out.println(primero[i]);
        }
        System.out.println("Sus notas fueron: ");
        for (int i = 0; i < primero.length; i++) {
            System.out.println("Digite la nota de "+primero[i]);
            notas[i] = entrada.nextDouble();
            suma += notas[i];  
        }
        double promedio = suma / primero.length;
        System.out.println("El promedio del grupo fue de: "+promedio);
    }
    
    public static void Grupo2() {
        System.out.println("El grupo 2 esta compuesto por: ");
        for (int i = 0; i < segundo.length; i++) {
            System.out.println(segundo[i]);
        }
        System.out.println("Sus notas fueron: ");
        for (int i = 0; i < segundo.length; i++) {
            System.out.println("Digite la nota de "+segundo[i]);
            notas[i] = entrada.nextDouble();
            suma += notas[i]; 
    }
          double promedio = suma / segundo.length;
        System.out.println("El promedio del grupo fue de: "+promedio);
    }
    public static void Grupo3() {
        System.out.println("El grupo 3 esta compuesto por: ");
        for (int i = 0; i < tercero.length; i++) {
            System.out.println(tercero[i]);
        }
        System.out.println("Sus notas fueron: ");
        for (int i = 0; i < tercero.length; i++) {
            System.out.println("Digite la nota de "+tercero[i]);
            notas[i] = entrada.nextDouble();
            suma += notas[i]; 
    }
         double promedio = suma / tercero.length;
        System.out.println("El promedio del grupo fue de: "+promedio);

        

    
           
       }
        
        
        
        
       
    }
    
}1
1
