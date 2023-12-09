package org.Learnig.Estudos_do_Curso.Secao10.Vetores.SomaVetor.program;

import java.util.Locale;
import java.util.Scanner;

public class aplication {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n;
        System.out.print("Quantos numeros voce vai digitar? ");
        n = scanner.nextInt();

        double[] vct = new double[n];
        double sum = 0.0;
        for (int i = 0; i < vct.length; i++) {
            System.out.print("Digite um numero: ");
            vct[i] = scanner.nextDouble();
            sum += vct[i];
        }

        System.out.print("VALORES = ");
        for (int i = 0; i < vct.length; i++) {
            System.out.printf("%.1f ", vct[i]);
        }
        double media = sum / vct.length;

        System.out.printf("\nSOMA = %.2f\nMEDIA = %.2f", sum, media);



        scanner.close();
    }
}
