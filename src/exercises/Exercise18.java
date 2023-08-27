package exercises;

import java.util.Scanner;

public class Exercise18 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numeros;
        int resposta;
        int intervalo1 = 0, intervalo2 = 0, intervalo3 = 0, intervalo4 = 0;

        do {
            System.out.println("Digite um número:");
            resposta = scan.nextInt();

            if (resposta <= 25) {
                intervalo1++;
            } else if (resposta > 25 && resposta <= 50) {
                intervalo2++;
            } else if (resposta > 50 && resposta <= 75) {
                intervalo3++;
            } else if (resposta > 75 && resposta <= 100) {
                intervalo4++;
            }

        } while (resposta > 0);

        System.out.println("A quantiadade de valores no intervalo [0-25] foi de " + intervalo1);
        System.out.println("A quantiadade de valores no intervalo [26-50] foi de " + intervalo2);
        System.out.println("A quantiadade de valores no intervalo [51-75] foi de " + intervalo3);
        System.out.println("A quantiadade de valores no intervalo [76-100] foi de " + intervalo4);

        System.out.println("Programa finalizado.");
    }
}
