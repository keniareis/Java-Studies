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
            int pivo = particao(array, menor, maior);
            quickSort(array, menor, pivo - 1);
            quickSort(array, pivo + 1, maior);
        }
    }

    static int particao(int[] array, int menor, int maior){
        int pivo = array[menor];
        int i = menor + 1;
        int j = maior;

        while (true){
            while (i < maior && array[i] < pivo) {i++;}
            while (j > menor && array[j] > pivo){ j--;}

            if (i >= j){
                virar(array, menor, j);
                return j;
            }
            virar(array, i, j);
        }
    }

    static void virar(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
