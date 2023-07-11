package exercises;

import java.util.Scanner;

public class exercise7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int resposta, alcool = 0, gasolina = 0, diesel = 0;

        resposta = scan.nextInt();

        while (resposta != 4) {
            if (resposta == 1) {
                alcool += 1;
            } else if (resposta == 2) {
                gasolina += 1;
            } else if (resposta == 3) {
                diesel += 1;
            } else {
                System.out.println("Valor inválido. Tente um número de 1 até 3 ou insira 4 para concluir o programa.");
            }
            resposta = scan.nextInt();
        }

        System.out.println("Muito obrigado!");
        System.out.printf("Alcool: %d.%nGasolina: %d.%nDiesel: %d.", alcool, gasolina, diesel);

        scan.close();
    }
}
