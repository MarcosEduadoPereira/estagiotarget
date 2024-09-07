package estagio01;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ProcessadorXML {
    public static List<Linha> lerXML(String caminhoArquivo) {
        List<Linha> linhas = new ArrayList<>();
        try {
            File arquivo = new File(caminhoArquivo);
            DocumentBuilderFactory fabrica = DocumentBuilderFactory.newInstance();
            DocumentBuilder construtor = fabrica.newDocumentBuilder();
            Document documento = construtor.parse(arquivo);
            documento.getDocumentElement().normalize();

            NodeList listaDeLinhas = documento.getElementsByTagName("row");
            for (int i = 0; i < listaDeLinhas.getLength(); i++) {
                Element elemento = (Element) listaDeLinhas.item(i);
                int dia = Integer.parseInt(elemento.getElementsByTagName("dia").item(0).getTextContent());
                double valor = Double.parseDouble(elemento.getElementsByTagName("valor").item(0).getTextContent());
                linhas.add(new Linha(dia, valor));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return linhas;
    }
}