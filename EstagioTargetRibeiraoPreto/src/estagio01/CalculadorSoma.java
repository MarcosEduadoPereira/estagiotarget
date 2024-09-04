package estagio01;

public class CalculadorSoma {

    public static void main(String[] args) {
        int indice = 12, soma = 0, k = 1;
        while (k < indice) {
            k = k + 1;
            soma = soma + k;
        }
        System.out.println("O valor da variável SOMA é: " + soma);
    }
}