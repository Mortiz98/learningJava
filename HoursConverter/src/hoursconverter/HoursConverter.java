
package hoursconverter;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class HoursConverter {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingresa el número total de horas: ");
            int totalHoras = scanner.nextInt();

            // Calcular el número de semanas, días y horas restantes
            int semanas = totalHoras / 168; // 1 semana = 168 horas
            int dias = (totalHoras % 168) / 24; // 1 día = 24 horas
            int horasRestantes = totalHoras % 24;
            // Mostrar el resultado
            System.out.println("El número equivalente es:");
            System.out.println("Semanas: " + semanas);
            System.out.println("Días: " + dias);
            System.out.println("Horas: " + horasRestantes);
            System.out.println("El numero de horas es: " + horasRestantes);

        }
    }

}
