package examples;

import java.util.Scanner;

public class ternaryExpression {
    public static void main(String[] args) {
        // (condição) ? valorSeVerdadeiro : valorSeFalso

        Scanner scan = new Scanner(System.in);
        double y = scan.nextDouble();

        String formattedY = (y == (int) y) ? String.valueOf((int) y) : String.valueOf(y);
        // eu comparo se o valor inserio é igual ao valor inteiro (sem casas decimais), se verdadeiro eu vou imprimir o valor realizando o casting para que não seja impresso casas decimais desnecessárias, se falso o valor vai ser impresso normalmente com suas casas decimais.

        String x = (y > 4) ? String.format("%s é maior que 4", formattedY) : String.format("4 é maior que %s", formattedY);
        System.out.println(x);


    }
}
