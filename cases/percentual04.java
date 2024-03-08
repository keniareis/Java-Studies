package org.Learnig.cases;

import java.util.HashMap;
import java.util.Map;

public class percentual04 {
    public static void main(String[] args){

        Map<String, Double> faturamentoPorEstado = new HashMap<>();
        faturamentoPorEstado.put("SP", 67836.43);
        faturamentoPorEstado.put("RJ", 36678.66);
        faturamentoPorEstado.put("MG", 29229.88);
        faturamentoPorEstado.put("ES", 27165.48);
        faturamentoPorEstado.put("Outros", 19849.53);

        double total = 0;
        for (double valor : faturamentoPorEstado.values()) {
            total += valor;
        }

        for (Map.Entry<String, Double> entry : faturamentoPorEstado.entrySet()) {
            double percentual = (entry.getValue() / total) * 100;
            System.out.printf("%s representou %.2f%% do faturamento total.\n", entry.getKey(), percentual);
        }
    }
}
