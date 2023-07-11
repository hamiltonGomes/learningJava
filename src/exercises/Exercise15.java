package exercises;

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {

        double x1, x2, b, a, c, raiz, delta;

        Scanner scan = new Scanner(System.in);
        System.out.println("Fórmula de Bhaskara!");
        System.out.println("Escreva o coeficiente A: ");
        a = scan.nextDouble();
        System.out.println("Escreva o coeficiente B: ");
        b = scan.nextDouble();
        System.out.println("Escreva o coeficiente C: ");
        c = scan.nextDouble();

        delta = (Math.pow(b, 2)) - 4 * a * c;
        raiz = Math.sqrt(delta);

        x1 = (-b + raiz) / 2 * a;
        x2 = (-b - raiz) / 2 * a;

        if (delta > 0) {
            System.out.printf("Os valores das raízes são: X1= %.2f e X2= %.2f.", x1, x2);
        } else if (delta < 0) {
            System.out.printf("O valor do delta é negativo: %.2f.%n", delta);
            System.out.println("A equação não possui raízes reais.");
        } else {
            System.out.println("Os dados inseridos não são válidos, por favor repita a operação.");
        }
        scan.close();
    }

}
