package org.Learnig.Estruturas_de_Dados.Busca_Binaria;

import java.util.Scanner;

public class Busca_binaria {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[1000000];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i * 2;
        }

        System.out.println("Procurar: ");
        int num = scanner.nextInt();

        int inicio = 0;
        int fim = vetor.length - 1;
        int meio;
        boolean achou = false;
        int contador = 0;

        while (inicio <= fim){
            meio = (int) (inicio + fim) / 2;
            System.out.println("Chute: " + vetor[meio]);
            contador++;

            if (vetor[meio] == num){
                achou = true;
                break;
            } else if (vetor[meio] < num) {
                inicio = meio + 1;
            }else {
                fim = meio - 1;
            }
        }
        System.out.println("Testes: " + contador);
        if (achou){
            System.out.println("Achou!");
        }else {
            System.out.println("Não achou!");
        }
    }
}
