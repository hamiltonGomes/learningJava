package exercises;

//Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
//Lembrando que, por definição, fatorial de 0 é 1.

import java.util.Scanner;

public class exercise11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int entrada, fatorial = 1;
        entrada = scan.nextInt();

        for (int i = 1; i <= entrada; i++) {
            fatorial *= i;
        }
        System.out.println(fatorial);
    }
}
