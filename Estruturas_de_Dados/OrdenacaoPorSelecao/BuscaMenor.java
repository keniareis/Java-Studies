package org.Learnig.Estruturas_de_Dados.OrdenacaoPorSelecao;

public class BuscaMenor {
    public int[] arr = new int[5];
    int menor = arr[0];
    public int menorIndice = 0;

    public int ordem (){
        for (int i = 1; i <= arr.length; i++){
            if (arr[i] < menor){
                menor = arr[i];
                menorIndice = i;
            }
        }
        return menorIndice;
    }

}
