package estagio01;

import java.util.Scanner;

public class FibonacciVerificacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para verificar se é da sequência de Fibonacci: ");
        int numero = scanner.nextInt();
        scanner.close();

        // Verifica se o número está na sequência de Fibonacci
        boolean pertence = pertenceFibonacci(numero);
        
        if (pertence) {
            System.out.println("O número " + numero + " está na sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não está na sequência de Fibonacci.");
        }
    }

    // Função simples para verificar se o número é Fibonacci
    private static boolean pertenceFibonacci(int n) {
        int a = 0;
        int b = 1;

        while (a < n) {
            int temp = a;
            a = b;
            b = temp + b;
        }

        return a == n;
    }
}