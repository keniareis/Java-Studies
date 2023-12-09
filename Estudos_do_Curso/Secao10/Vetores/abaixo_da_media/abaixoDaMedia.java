package org.Learnig.Estudos_do_Curso.Secao10.Vetores.abaixo_da_media;

import java.util.Locale;
import java.util.Scanner;

public class abaixoDaMedia {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = scanner.nextInt();
        
        double[] vetor = new double[n];

        double sum = 0.0;
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = scanner.nextDouble();
            sum += vetor[i];
        }

        double media = sum / vetor.length;
        System.out.printf("\nMEDIA DO VETOR: %.2f", media);

        System.out.print("\nELEMENTOS ABAIXO DA MEDIA:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < media)
                System.out.printf("\n%.2f", vetor[i]);

        }

        scanner.close();
    }

}
