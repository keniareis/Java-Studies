package org.Learnig.Estudos_do_Curso.Secao10.Vetores.mais_velho;

import java.util.Locale;
import java.util.Scanner;

public class maisVelho {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.print("Quantos elementos vai ter o vetor? ");
        n = scanner.nextInt();

        String[] nome = new String[n];
        int[] idade = new int[n];

        for (int i = 0; i < nome.length; i++) {
            System.out.printf("Dados da %da pessoa: \n",i+1);
            scanner.nextLine();
            System.out.print("nome: ");
            nome[i] = scanner.nextLine();

            System.out.print("idade: ");
            idade[i] = scanner.nextInt();

        }

        int maioridade = idade[0];
        int posicaomaior = 0;

        for (int i=1; i<n; i++) {
            if (idade[i] > maioridade) {
                maioridade = idade[i];
                posicaomaior = i;
            }
        }

        System.out.printf("PESSOA MAIS VELHA: %s\n", nome[posicaomaior]);

        scanner.close();
    }
}