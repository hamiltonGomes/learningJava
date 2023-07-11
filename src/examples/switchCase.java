package examples;

import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int x;
        System.out.println("Digite um número referente ao dia da semaana (1 até 7): ");
        x = scan.nextInt();
        scan.close();

        // organizando o código da forma abaixo o "break" está subentendido
        switch (x) {
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Segunda-feira.");
            case 3 -> System.out.println("Terça-feira.");
            case 4 -> System.out.println("Quarta-feira");
            case 5 -> System.out.println("Quinta-feira");
            case 6 -> System.out.println("Sexta-feira");
            case 7 -> System.out.println("Sábado");
            default -> System.out.println("Valor inválido.");
        }
    }
}
