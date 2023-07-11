package exercises;

import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        int horaInicial, horaFinal, horaTotal;

        Scanner scan = new Scanner(System.in);

        horaInicial = scan.nextInt();
        horaFinal = scan.nextInt();

        if (horaFinal > horaInicial) {
            horaTotal = (horaFinal - horaInicial);
        } else {
            horaTotal = 24 - horaInicial + horaFinal;
        }

        System.out.printf("O jogo durou %d hora(s).", horaTotal);
    }
}
