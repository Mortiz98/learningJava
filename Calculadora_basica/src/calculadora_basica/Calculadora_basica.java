package calculadora_basica;

import java.util.Scanner;

public class Calculadora_basica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float num1, num2, resultado = 0.0f;
        char signo, continuar, usar_resultado;

        do {
            if (resultado == 0.0f) {
                System.out.println("Calculadora basica");
                System.out.println("Ingrese el primer numero: ");
                num1 = scanner.nextFloat();
            } else {
                System.out.println("Desea operar con el resultado anterior?(s/n) ");
                usar_resultado = scanner.next().charAt(0);
                if (usar_resultado == 's') {
                    num1 = resultado;
                } else {
                    System.out.println("Ingrese el primer numero: ");
                    num1 = scanner.nextFloat();
                }
            }
            System.out.println("Ingrese el operador (+,-,*,/: ");
            signo = scanner.next().charAt(0);

            System.out.println("Ingrese el segundo numero: ");
            num2 = scanner.nextFloat();

            switch (signo) {
                case '+' ->
                    resultado = num1 + num2;
                case '-' ->
                    resultado = num1 - num2;
                case '*' ->
                    resultado = num1 * num2;
                case '/' -> {
                    if (num2 != 0) {
                        resultado = num1 / num2;
                    } else {
                        System.out.println("No se puede realizar la division");
                    }
                }
                default ->
                    System.out.println("Signo invalido");

            }
            System.out.println("Resultado = " + resultado);
            System.out.println("¿Desea realizar otra operacion? (s/n): ");
            continuar = scanner.next().charAt(0);

        } while (continuar == 's' || continuar == 'S');
        System.out.println("Gracias por usar la calculadora");

    }

}
