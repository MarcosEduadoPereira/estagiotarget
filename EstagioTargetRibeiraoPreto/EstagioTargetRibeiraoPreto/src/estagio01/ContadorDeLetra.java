package estagio01;

import java.util.Scanner;

public class ContadorDeLetra {

    public static int contarLetraA(String s) {
        int contagem = 0;
        for (char c : s.toCharArray()) {
            if (Character.toLowerCase(c) == 'a') {
                contagem++;
            }
        }
        return contagem;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String entrada = scanner.nextLine();
        int contagem = contarLetraA(entrada);
        System.out.println("A letra 'a' aparece " + contagem + " vez(es) na string.");
        scanner.close();
    }
}