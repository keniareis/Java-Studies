package org.Learnig.Estudos_do_Curso.Secao10.Vetores.maior_posicao;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = scanner.nextInt();

        double[] vetor = new double[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = scanner.nextDouble();
        }

        double num = vetor[0];
        int cont = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > num) {
                num = vetor[i];
                cont = i;
            }
        }
        System.out.printf("\nMAIOR VALOR: %.2f\nPOSICAO DO MAIOR VALOR: %d", num, cont);

        scanner.close();
    }
}
