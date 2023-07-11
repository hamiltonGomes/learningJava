package exercises;

import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int password, passwordAttempt;
        password = 2002;

        System.out.println("Digite a senha: ");
        passwordAttempt = scan.nextInt();

        while (passwordAttempt != password) {
            System.out.println("Senha inválida.");
            System.out.println("Digite a senha: ");
            passwordAttempt = scan.nextInt();
        }
        System.out.println("Acesso permitido.");

        scan.close();
    }
}
