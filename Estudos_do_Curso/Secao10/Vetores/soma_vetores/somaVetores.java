package org.Learnig.Estudos_do_Curso.Secao10.Vetores.soma_vetores;

import java.util.Locale;
import java.util.Scanner;

public class somaVetores {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = scanner.nextInt();

        int[] A = new int[n];
        int[] B = new int[n];
        int[] vetor = new int[n];

        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextInt();
        }

        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < B.length; i++) {
            B[i] = scanner.nextInt();
        }

        System.out.println("VETOR RESULTANTE: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = A[i] + B[i];
            System.out.printf("%d\n", vetor[i]);
        }

        scanner.close();
    }
}
