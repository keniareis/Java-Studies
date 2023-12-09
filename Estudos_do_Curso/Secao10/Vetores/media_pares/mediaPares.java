package org.Learnig.Estudos_do_Curso.Secao10.Vetores.media_pares;

import java.util.Locale;
import java.util.Scanner;

public class mediaPares {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int sum = 0, n, media;

        System.out.print("Quantos elementos vai ter o vetor? ");
        n = scanner.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i < vetor.length ; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = scanner.nextInt();

            if (vetor[i] % 2 == 0)
                sum += vetor[i];
        }

        if (sum > 0) {
            media = sum / vetor.length;
            System.out.printf("MEDIA DOS PARES: %d", media);
        }
        else
            System.out.print("NENHUM NUMERO PAR");


        scanner.close();
    }
}
