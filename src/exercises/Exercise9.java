package exercises;
//Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
//Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
//essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int in = 0, out = 0, entradas, valorEntrada;

        System.out.println("Número de entradas:");
        entradas = scan.nextInt();

        for (int i = 0; i < entradas; i++) {
            System.out.println("Valor da entrada:");
            valorEntrada = scan.nextInt();

            if (valorEntrada >= 10 && valorEntrada <= 20) {
                in += 1;
            } else {
                out += 1;
            }
        }

        scan.close();
        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}
