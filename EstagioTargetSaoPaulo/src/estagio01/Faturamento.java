package estagio01;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Faturamento {

    public static void main(String[] args) {
        String caminhoArquivo = "faturamento.json"; // Substitua pelo caminho do seu arquivo JSON

        try {
            // Ler o arquivo JSON
            BufferedReader reader = new BufferedReader(new FileReader(caminhoArquivo));
            StringBuilder sb = new StringBuilder();
            String linha;
            while ((linha = reader.readLine()) != null) {
                sb.append(linha);
            }
            reader.close();

            // Parse o JSON
            JSONObject jsonObject = new JSONObject();
            JSONArray faturamentoArray = jsonObject.getJSONArray("faturamento");

            // Processar os dados
            List<Double> faturamentos = new ArrayList<>();
            for (int i = 0; i < faturamentoArray.length(); i++) {
                JSONObject item = faturamentoArray.getJSONObject(i);
                double valor = item.getDouble("valor");
                if (valor > 0) {
                    faturamentos.add(valor);
                }
            }

            if (faturamentos.isEmpty()) {
                System.out.println("Não há faturamento válido para processamento.");
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

        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Erro ao processar o JSON: " + e.getMessage());
        }
    }
}