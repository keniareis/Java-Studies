package org.Learnig.Estruturas_de_Dados.QuickSort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[]    args){
        int[] array = {7, 8, 10, 9, 2, 1, 5};
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));

        // ou apenas
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(int[] array, int menor, int maior){
        if (menor < maior){
            int pivo = particao(array, menor, maior);//chama o metodo partção para obter o indice do pivo
            quickSort(array, menor, pivo - 1);//realiza a ordenação recursiva nas duas subpartiçoes
            quickSort(array, pivo + 1, maior);
        }
    }

    public static int particao(int[] array, int menor, int maior){//escolher o pivo para a ordenação
        int pivo = array[menor]; //selecionar o primeiro elemento como pivo
        int i = menor + 1;//inicializar os indices para percorrer o array
        int j = maior;

        while (true){//será interrompido quando os indices 'i' e 'j' se cruzarem
            while (i < maior && array[i] < pivo){i++;}
            while (j > menor && array[j] > pivo){j--;}

            if (i >= j){
                virar(array, menor, j);//se 'i' e 'j' se cruzarem, troca o pivo para a posiçao correta e retorna o indice final do pivo
                return j;
            }
            virar(array, i, j);
        }
    }

    public static void virar(int[] array, int i, int j){//troca os elementos dos indices 'i' e 'j' do array
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
