package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercise14Alura {
    public static void main(String[] args) throws InterruptedException {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int resposta, resposta1, idade;
        String nome, tipoConta;
        double saldo, transferencia;

        System.out.println("***************************");
        System.out.println("** Bem vindo ao Unibank! **");
        System.out.println("***************************");
        Thread.sleep(2000);

        System.out.println("Realize o seu cadastro informando os dados abaixo:");
        System.out.print("Nome completo: ");
        nome = scan.nextLine();
        System.out.print("Qual sua idade? ");
        idade = scan.nextInt();

        do {
            System.out.println("\nQual seu tipo de conta?");
            System.out.println("1- Poupança");
            System.out.println("2- Corrente");
            System.out.println("3- Conta salário");
            resposta1 = scan.nextInt();
            scan.nextLine();

            if (resposta1 == 1) {
                tipoConta = "Poupança";
            } else if (resposta1 == 2) {
                tipoConta = "Corrente";
            } else {
                tipoConta = "Conta salário";
            }
        } while (resposta1 != 1 && resposta1 != 2 && resposta1 != 3);

        System.out.print("Qual seu saldo inicial? ");
        saldo = scan.nextDouble();

        resposta = 0;
        while (resposta != 4) {
            Thread.sleep(2000);
            System.out.println("\n************* MENU *************");
            System.out.println("Selecione uma das opções abaixo:");
            System.out.println("1- Consultar meu saldo");
            System.out.println("2- Depositar valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");
            System.out.println("********************************");

            resposta = scan.nextInt();
            scan.nextLine();

            if (resposta == 1) {
                System.out.println("\n********************************");
                System.out.printf("Nome completo: %s%n", nome);
                System.out.printf("Idade: %d%n", idade);
                System.out.printf("Tipo de conta: %s%n", tipoConta);
                System.out.printf("Saldo atual: R$ %.2f%n", saldo);
                System.out.println("********************************");
            } else if (resposta == 2) {
                System.out.print("\nDigite o valor que deseja depositar: ");
                double valorDeposito = scan.nextDouble();
                saldo += valorDeposito;
                System.out.printf("O seu novo saldo é R$ %.2f.%n", saldo);
            } else if (resposta == 3) {
                System.out.print("\nDigite o valor que deseja transferir: ");
                transferencia = scan.nextDouble();
                while (transferencia > saldo) {
                    System.out.println("\nO valor que deseja transferir é maior que o seu saldo em conta.");
                    System.out.print("Por favor, digite um valor válido: ");
                    transferencia = scan.nextDouble();
                }
                saldo -= transferencia;
                System.out.printf("O seu novo saldo é R$ %.2f.%n", saldo);
            } else if (resposta != 4) {
                System.out.println("\nO valor inserido é inválido.");
            } else {
                System.out.println("\nPrograma finalizado.");
            }
        }
    }
}
