package org.Learnig.Estruturas_de_Dados.QuickSort.tecnicaDC;

import java.util.List;

public class DividirConquistar {
    public static void main(String[] args){
        int[] list = {2, 4, 6};
        System.out.println(soma(list, 0));
    }

    public static int soma(int[] list, int indice){
        if (list.length == indice)
            return 0;
        else
            return list[indice] + soma(list, indice + 1);
    }
}
