package exercises;

import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        int valorA, valorB;
        Scanner scan = new Scanner(System.in);

        System.out.println("--- Identificando números múltiplos ---");
        System.out.println("Digite o primeiro valor inteiro: ");
        valorA = scan.nextInt();
        System.out.println("Digite o segundo valor inteiro: ");
        valorB = scan.nextInt();

        scan.close();

        if (valorA % valorB == 0 || valorB % valorA == 0) {
            System.out.println("São múltiplos.");
        } else {
            System.out.println("Não são múltiplos.");
        }
    }
}
