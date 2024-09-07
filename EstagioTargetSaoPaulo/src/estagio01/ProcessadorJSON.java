package estagio01;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProcessadorJSON {
    public static List<Linha> lerJSON(String caminhoArquivo) {
        List<Linha> linhas = new ArrayList<>();
        try {
            BufferedReader leitor = new BufferedReader(new FileReader(caminhoArquivo));
            StringBuilder sb = new StringBuilder();
            String linha;
            while ((linha = leitor.readLine()) != null) {
                sb.append(linha);
            }
            leitor.close();

            JSONArray arrayJson = new JSONArray();
            for (int i = 0; i < arrayJson.length(); i++) {
                JSONObject item = arrayJson.getJSONObject(i);
                int dia = item.getInt("dia");
                double valor = item.getDouble("valor");
                linhas.add(new Linha(dia, valor));
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Erro ao processar o JSON: " + e.getMessage());
        }
        return linhas;
    }
}