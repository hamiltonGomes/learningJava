package exercises;

import java.util.Locale;
import java.util.Scanner;

// Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
//Se o ponto estiver na origem, escreva a mensagem “Origem”.
//Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.

public class Exercise3 {

    public static void main(String[] args) {
        double x, y;
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor de X: ");
        x = scan.nextDouble();
        System.out.println("Informe o valor de Y: ");
        y = scan.nextDouble();

        scan.close();

        if (x == 0 && y == 0) {
            System.out.println("Origem.");
        } else if (x == 0) {
            System.out.printf("No eixo Y (%.2f).", y);
        } else if (y == 0) {
            System.out.printf("No eixo X (%.2f).", x);
        } else {
            if (x > 0 && y > 0) {
                System.out.println("Q1");
            } else if (x > 0 && y < 0) {
                System.out.println("Q4");
            } else if (x < 0 && y > 0) {
                System.out.println("Q2");
            } else if (x < 0 && y < 0) {
                System.out.println("Q3");
            }
            System.out.println();
        }
    }
}
