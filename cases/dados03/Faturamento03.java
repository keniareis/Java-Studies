package org.Learnig.cases.dados03;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Faturamento03 {

    public static void main(String[] args) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File("src\\main\\java\\org\\Learnig\\cases\\dados03\\dados(2).xml"));

        Element raiz = document.getDocumentElement();
        NodeList faturamentos = raiz.getElementsByTagName("row") ;

        List<Double> valores = new ArrayList<>();
        List<String> datas = new ArrayList<>();

        for (int i = 0; i < faturamentos.getLength(); i++) {
            Element dia = (Element) faturamentos.item(i);
            String valorStr = dia.getElementsByTagName("valor").item(0).getTextContent();
            String data = dia.getElementsByTagName("dia").item(0).getTextContent();

            double valor = Double.parseDouble(valorStr);

            valores.add(valor);
            datas.add(data);
        }
        if (!valores.isEmpty()) {
            double menorFaturamento = valores.get(0);
            double maiorFaturamento = valores.get(0);
            int diasAcimaMedia = 0;
            double mediaFaturamento = 0;

            for (double valor : valores) {
                if (valor < menorFaturamento) {
                    menorFaturamento = valor;
                }
                if (valor > maiorFaturamento) {
                    maiorFaturamento = valor;
                }
                mediaFaturamento += valor;
            }

            mediaFaturamento /= valores.size();

            for (double valor : valores) {
                if (valor > mediaFaturamento) {
                    diasAcimaMedia++;
                }
            }

            System.out.println("Menor valor: " + menorFaturamento);
            System.out.println("Maior valor: " + maiorFaturamento);
            System.out.println("Dias acima da média: " + diasAcimaMedia);
        } else {
            System.out.println("A lista de valores está vazia.");
        }
    }
}
