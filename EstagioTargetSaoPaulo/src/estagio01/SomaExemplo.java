package estagio01;

public class SomaExemplo {
    public static void main(String[] args) {
        int indice = 13;
        int soma = 0;
        int k = 0;

        // Loop para calcular a soma dos números de 1 a 13
        while (k < indice) {
            k = k + 1;
            soma = soma + k;
        }

        // Exibindo o resultado
        System.out.println("SOMA: " + soma);
    }
}