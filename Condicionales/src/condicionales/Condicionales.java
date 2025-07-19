package condicionales;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Condicionales {

    public static void main(String[] args) {
        /*int num;
                
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero"));
        
        if(num>0){
            //System.out.println("El "+num+" es positivo");
            JOptionPane.showMessageDialog(null, "El " + num +" es positivo");}
            else if (num == 0){
                    System.out.println("El numero es 0");
                    }
        else {
            System.out.println("El " +num+ " es negativo");
        }*/

        
        
 /* En megaplaza se hace un 20% de descuento a los clientes cuya compra supere los 300
         ¿Cual sera la cantidad que pague una persona por su compra?
         */
 /*Scanner scanner = new Scanner(System.in);
         
        float compra,descuento,compraDescuento;
        System.out.println("¿Que valor tuvo la compra? ");
        compra = scanner.nextInt();
        
        if(compra>300){
            descuento = compra * 0.20f;
            compraDescuento = compra - descuento; 
            System.out.println("El valor a pagar es "+compraDescuento);
        }
        else{
            System.out.println("El valor a pagar es "+compra);
        }*/
 /*Si un obrero trabaja 40 horas o menos se le paga 16 por hora
        Si trabaja mas de 40 horas se le paga 16 por hora, 
        y 20 por cada hora extra
        Calcular salario del obrero*/
        
 /*int horasTrabajadas, pagoHora, pagoHoraExtra, salario, horaExtra;
        pagoHora = 16;
        pagoHoraExtra = 20;

        horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("El numero de horas trabajadas fue de "));
        horaExtra = horasTrabajadas - 40;
        if (horasTrabajadas >= 40) {
            salario = (horaExtra * pagoHoraExtra) + (pagoHora * 40);
        } else {
            salario = pagoHora * horasTrabajadas;
        }
        System.out.println("El salario del trabajador es de " + salario);*/
 
 
 
 /*Pedir dos números y decir si uno es múltiplo del otro.*/
 
/* Scanner scanner = new Scanner(System.in);
 
 int n1,n2;
        System.out.println("Digite el numero 1: ");
        n1 = scanner.nextInt();
        System.out.println("Digite el numero 2: ");
        n2 = scanner.nextInt();
        
        if(n1%n2 ==0){
            System.out.println("Son multiplos");
        }
        else {
            System.out.println("No son multiplos");
        }*/
int n1,n2;
n1= Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero: "));
n2 =Integer.parseInt(JOptionPane.showInputDialog("Escriba un numero: "));

       if(n1%n2==0){
       JOptionPane.showInternalMessageDialog(null,"Es mulltiplo");
       }
       else{
       JOptionPane.showInternalMessageDialog(null, "No es multiplo");
       }
 
    }

}
