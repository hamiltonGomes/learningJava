package exercises;

import java.util.Scanner;

//Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
//segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel"
public class exercise10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        double x, y, divisao;

        n = scan.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.println("Dividendo:");
            x = scan.nextInt();
            System.out.println("Divisor:");
            y = scan.nextInt();

            if (y == 0) {
                System.out.println("Divisão impossível.");
            } else {
                divisao = x / y;
                System.out.println(divisao);
            }
        }
        scan.close();
        System.out.println();
    }
}
