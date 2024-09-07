package estagio01;

import java.util.ArrayList;
import java.util.List;

public class Faturamento {

    public static void main(String[] args) {
        String caminhoArquivoXML = "C:\\Temp\\ws-eclipse\\EstagioTarget\\faturamento.xml"; 
        String caminhoArquivoJSON = "C:\\Temp\\ws-eclipse\\EstagioTarget\\dados.json"; 

        // Processar XML
        List<Linha> linhasXML = ProcessadorXML.lerXML(caminhoArquivoXML);

        // Processar JSON
        List<Linha> linhasJSON = ProcessadorJSON.lerJSON(caminhoArquivoJSON);

        // Combinar listas de dados
        List<Linha> todasLinhas = new ArrayList<>();
        todasLinhas.addAll(linhasXML);
        todasLinhas.addAll(linhasJSON);

        // Calcular estatísticas
        List<Double> faturamentos = new ArrayList<>();
        for (Linha linha : todasLinhas) {
            if (linha.getValor() > 0) {
                faturamentos.add(linha.getValor());
            }
        }

        if (faturamentos.isEmpty()) {
            System.out.println("Não há dados válidos para processamento.");
            return;
        }

        double menorValor = faturamentos.stream().min(Double::compare).orElse(Double.NaN);
        double maiorValor = faturamentos.stream().max(Double::compare).orElse(Double.NaN);
        double mediaMensal = faturamentos.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
        long diasAcimaDaMedia = faturamentos.stream().filter(valor -> valor > mediaMensal).count();

        // Exibir resultados
        System.out.println("Menor valor de faturamento: " + menorValor);
        System.out.println("Maior valor de faturamento: " + maiorValor);
        System.out.println("Número de dias acima da média: " + diasAcimaDaMedia);
    }
}