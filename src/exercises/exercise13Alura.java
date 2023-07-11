package exercises;

import java.util.Random;
import java.util.Scanner;

public class exercise13Alura {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tentativa, numeroAleatorio;

        numeroAleatorio = new Random().nextInt(100);

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite sua tentaiva: ");
            tentativa = scan.nextInt();

            if (i == 4 && tentativa != numeroAleatorio) {
                System.out.printf("""
                        Não foi dessa vez!
                        O número aleatório era % d, tente novamente!
                        """, numeroAleatorio);
            } else if (tentativa == numeroAleatorio) {
                System.out.printf("Você acertou! O número aleatório era %d.", numeroAleatorio);
                break;
            } else if (tentativa > numeroAleatorio) {
                System.out.println("O número aleatório é menor.");
            } else {
                System.out.println("O número aleatório é maior.");
            }
        }

    }
}
