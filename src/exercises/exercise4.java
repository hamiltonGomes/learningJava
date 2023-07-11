package exercises;

import java.util.Locale;
import java.util.Scanner;

public class exercise4 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double salario, imposto;

        System.out.println("Vamos calcular os impostos incidentes no seu salário!");
        System.out.println("Insira o valor do seu salário mensal: ");
        salario = scan.nextDouble();

        if (salario > 0 && salario <= 2000) {
            imposto = 0;
        } else if (salario <= 3000) {
            imposto = (salario - 2000) * 0.08;
        } else if (salario <= 4500) {
            imposto = (salario - 3000) * 0.18 + 999.99 * 0.08;
        } else {
            imposto = (salario - 4500) * 0.28 + 999.99 * 0.08 + 1499.99 * 0.18;
        }

        if (imposto == 0) {
            System.out.println("Seu salário está isento de tributação.");
        } else {
            System.out.printf("O valor a ser pago no imposto de salario é: R$ %.2f.", imposto);
        }

        scan.close();
    }
}
