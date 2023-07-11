import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n, soma = 0, x;
        n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            x = scan.nextInt();
            soma += x;
        }

        System.out.println(soma);

    }
}