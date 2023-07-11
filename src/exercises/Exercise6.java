package exercises;

//Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
//cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
//menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

import java.util.Locale;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double x, y;

        do {
            System.out.println("Digite a coordenada X: ");
            x = scan.nextDouble();
            System.out.println("Digite a coordenada Y: ");
            y = scan.nextDouble();

            if (x > 0 && y > 0) {
                System.out.println("1ª quadrante.");
            } else if (x > 0 && y < 0) {
                System.out.println("4ª quadrante.");
            } else if (x < 0 && y > 0) {
                System.out.println("2ª quadrante.");
            } else if (x < 0 && y < 0) {
                System.out.println("3ª quadrante.");
            } else {
                System.out.println("Uma das coordenadas inseridas é nula.");
            }
        } while (x != 0 && y != 0);

        System.out.println("Programa encerrrado.");
        scan.close();
    }
}
