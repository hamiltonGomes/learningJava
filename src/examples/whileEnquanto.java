package examples;

import java.util.Scanner;

public class whileEnquanto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int soma, x;
        soma = 0;
        x = scan.nextInt();

        while (x != 0) {
            soma += x;
            x = scan.nextInt();
        }

        System.out.printf("a soma é: %s", soma);
        scan.close();
    }

}
