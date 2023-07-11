package exercises;

import java.util.Locale;
import java.util.Scanner;

public class exercise14Alura {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int resposta = 0, resposta1, idade;
        String nome, tipoConta;
        double saldo;

        System.out.println("""
                ***************************
                ** Bem vindo ao Unibank! **
                ***************************
                """);

        //incrmentar validação posteriormente
        System.out.println("Realize o seu cadastro informando os dados abaixo:");
        System.out.println("Nome completo:");
        nome = scan.nextLine();
        System.out.println("Qual sua idade?");
        idade = scan.nextInt();
        do {
            System.out.println("""
                    Qual seu tipo de conta?
                    1- Poupança;
                    2- Corrente;
                    3- Conta salário.
                    """);
            resposta1 = scan.nextInt();
            if (resposta1 == 1) {
                tipoConta = "Poupança";
            } else if (resposta1 == 2) {
                tipoConta = "Corrente";
            } else {
                tipoConta = "Conta salário";
            }
        } while (resposta1 != 1 && resposta1 != 2 && resposta1 != 3);
        System.out.println("Qual seu saldo inicial?");
        saldo = scan.nextDouble();


        while (resposta != 4) {
            System.out.println("""
                    ************* MENU *************
                    Selecione uma das opções abaixo:
                    1- Consultar meu saldo;
                    2- Depositar valor;
                    3- Transferir valor;
                    4- Sair.
                    ********************************
                    """);
            resposta = scan.nextInt();

            if (resposta == 1) {
                System.out.printf("""
                        ********************************
                        Nome completo: %s
                        Idade: %d
                        Tipo de conta: %s
                        Saldo atual: R$ %f
                        ********************************
                        """, nome, idade, tipoConta, saldo);
            } else if (resposta == 2) {
                System.out.println("Digite o valor que deseja depositar: ");
                saldo += scan.nextDouble();
                System.out.printf("O seu novo saldo é R$ %f.", saldo);
            } else if (resposta == 3) {
                System.out.println("Digite o valor que deseja transferir: ");
                saldo -= scan.nextDouble();
                System.out.printf("O seu novo saldo é R$ %f.", saldo);
            } else {
                System.out.println("O valor inserido é inválido.");
            }
        }
    }
}
