package exercises;

//Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
//X, se for o caso.

import java.util.Scanner;

public class exercise8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x;

        System.out.println("Digite um valor entre 1 e 1000.");
        x = scan.nextInt();
        while (x < 1 || x > 1000) {
            System.out.println("Valor inválido.");
            System.out.println("Digite um valor entre 1 e 1000.");
            x = scan.nextInt();
        }

        for (int i = 1; i <= x; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        scan.close();
    }
}
