package estagio01;

import java.util.Scanner;

public class VerificadorFibonacci {

    public static boolean pertenceFibonacci(int n) {
        if (n < 0) return false;

        int a = 0, b = 1;
        while (a <= n) {
            if (a == n) return true;
            int proximo = a + b;
            a = b;
            b = proximo;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = scanner.nextInt();
        if (pertenceFibonacci(num)) {
            System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + num + " não pertence à sequência de Fibonacci.");
        }
        scanner.close();
    }
}