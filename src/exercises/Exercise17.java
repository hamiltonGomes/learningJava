import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        double valorProduto, valorParcelas;
        int metodoPagamento;

        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o valor do produto: ");
        valorProduto = scan.nextDouble();

        do {
            System.out.println("Qual a forma de pagamento desejada?");
            System.out.println("1 - À vista em dinheiro");
            System.out.println("2 - À vista no cartão");
            System.out.println("3 - Em dua vezes");
            System.out.println("4 - Em três vezes");
            metodoPagamento = scan.nextInt();
        } while (metodoPagamento < 1 || metodoPagamento > 4);

        if (metodoPagamento == 1) {
            valorProduto *= 0.9;
            System.out.printf("O valor do produto é R$%.2f.", valorProduto);
        } else if (metodoPagamento == 2) {
            valorProduto *= 0.85;
            System.out.printf("O valor do produto é R$%.2f.", valorProduto);
        } else if (metodoPagamento == 4) {
            valorProduto *= 1.1;
            valorParcelas = valorProduto / 3;
            System.out.printf("O valor do produto é R$%.2f. Parcelas de R$%.2f.", valorProduto, valorParcelas);
        } else {
            valorParcelas = valorProduto / 2;
            System.out.printf("O valor do produto é R$%.2f. Parcelas de R$%.2f.", valorProduto, valorParcelas);
        }
    }
}
