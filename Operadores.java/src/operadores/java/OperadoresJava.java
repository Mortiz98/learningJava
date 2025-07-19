
package operadores.java;

import java.util.Scanner;
import javax.swing.JOptionPane;




public class OperadoresJava {

    public static void main(String[] args) {
          
       /* String NombreEmpleado;
        int HorasSemanales;
        float SalarioHora, SalarioTotal;
        
        NombreEmpleado = JOptionPane.showInputDialog("Digite el nombre del empleado: ");
        HorasSemanales = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de horas laboradas: "));
        SalarioHora = Float.parseFloat(JOptionPane.showInputDialog("Digite el salario por hora: "));
        SalarioTotal = SalarioHora * HorasSemanales;
        //Mostrar por ventana emergente
        JOptionPane.showMessageDialog(null, "El salario total de "+NombreEmpleado+ " es " +SalarioTotal);
        //Mostrando por consola
        System.out.println("El salario total de "+ NombreEmpleado + " es " +SalarioTotal);*/
   
 
       
    /*Gillermo tiene n dolares
    Luis tiene la mitad de lo que tiene guillermo
    Juan tiene la mitad de lo que tienen luis y guillermo juntos
    Calcule e imprima la cantidad que tienen entre los tres*/
    
    /*Scanner scanner = new Scanner(System.in);
    float Guillermo,Luis, Juan, Total;
    System.out.println("Digite la cantidad de dinero que tiene guillermo ");
    Guillermo = scanner.nextFloat();
    
    Luis = Guillermo / 2;
    Juan = (Luis + Guillermo)/ 2;
    
    Total = Guillermo+Luis+Juan;
        System.out.println("La cantidad de dinero de Luis es " +Luis +" La de Juan es de " +Juan +" Y el total es "+ Total);
        */
    
   Scanner scanner = new Scanner(System.in);
   Float participacion, primerParcial,segundoParcial, examenFinal,notaFinal;
   
        System.out.println("Nota participacion: ");
        participacion = scanner.nextFloat();
         System.out.println("Nota primerParcial: ");
        primerParcial = scanner.nextFloat();
         System.out.println("Nota segundoParcial: ");
        segundoParcial = scanner.nextFloat();
         System.out.println("Nota examenFinal: ");
        examenFinal = scanner.nextFloat();
        
        //sacar los calculos
        
        participacion *= 0.10f;
        primerParcial *= 0.25f;
        segundoParcial *= 0.25f;
        examenFinal *= 0.40f;
        
        notaFinal = participacion+primerParcial+segundoParcial+examenFinal;
        
        System.out.println("La nota final es " +notaFinal);
        
             
         
    
    
    
    
    
    
    
    }
    
}
       

