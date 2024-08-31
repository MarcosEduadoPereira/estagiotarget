package estagio01;

import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a string para inverter: ");
        String input = scanner.nextLine();
        scanner.close();

        // Inverter a string manualmente
        String resultado = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            resultado += input.charAt(i);
        }

        System.out.println("String invertida: " + resultado);
    }
}