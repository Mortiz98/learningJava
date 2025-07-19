/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaregistroventas;

/**
 *
 * @author morti
 */
public class SistemaRegistroVentas {

   
    
    public static void main(String[] args) {
        
        int rep = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                if(j==i){
                continue;
            
                }
                rep++;
                System.out.println("i="+i+" j="+j);
            }
        }System.out.println(rep);
    }
    
}
