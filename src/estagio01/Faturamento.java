package estagio01;

public class Faturamento {
    public static void main(String[] args) {
        // Array com valores de faturamento diário
        double[] faturamento = {1000.00, 1500.00, 2000.00, 1200.00, 1100.00, 0, 0, 1300.00, 1400.00, 0, 1500.00, 0};

        double soma = 0;
        double menor = faturamento[0];
        double maior = faturamento[0];
        int count = 0;

        // Calcula a soma, menor e maior valor de faturamento
        for (int i = 0; i < faturamento.length; i++) {
            double valor = faturamento[i];
            if (valor > 0) {
                soma += valor;
                count++;
                if (valor < menor) menor = valor;
                if (valor > maior) maior = valor;
            }
        }

        // Calcula a média
        double media = soma / count;

        int diasAcimaMedia = 0;

        // Conta os dias com faturamento acima da média
        for (int i = 0; i < faturamento.length; i++) {
            if (faturamento[i] > media) {
                diasAcimaMedia++;
            }
        }

        // Exibe os resultados
        System.out.println("Menor valor de faturamento: R$" + menor);
        System.out.println("Maior valor de faturamento: R$" + maior);
        System.out.println("Número de dias acima da média: " + diasAcimaMedia);
    }
}