package estagio01;

public class PercentualEstado {
    public static void main(String[] args) {
        // Valores de faturamento por estado
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;

        double total = sp + rj + mg + es + outros;

        // Calcular percentual para cada estado
        double percentualSp = (sp / total) * 100;
        double percentualRj = (rj / total) * 100;
        double percentualMg = (mg / total) * 100;
        double percentualEs = (es / total) * 100;
        double percentualOutros = (outros / total) * 100;

        System.out.println("Percentual de SP: " + percentualSp + "%");
        System.out.println("Percentual de RJ: " + percentualRj + "%");
        System.out.println("Percentual de MG: " + percentualMg + "%");
        System.out.println("Percentual de ES: " + percentualEs + "%");
        System.out.println("Percentual de Outros: " + percentualOutros + "%");
    }
}