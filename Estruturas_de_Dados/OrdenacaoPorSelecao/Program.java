package org.Learnig.Estruturas_de_Dados.OrdenacaoPorSelecao;

import java.util.Arrays;

public class Program {
    public static void main(String[] args){
        int[] novoArr = new int[5];
        BuscaMenor buscaMenor = new BuscaMenor();
        int menor = 0;

        for (int i: buscaMenor.arr) {
            menor = buscaMenor.menorIndice;
            novoArr[i] = buscaMenor.arr[menor];
        }
        System.out.println(Arrays.toString(novoArr));
    }
}
