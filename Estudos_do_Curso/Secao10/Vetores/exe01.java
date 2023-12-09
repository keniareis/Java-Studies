package org.Learnig.Estudos_do_Curso.Secao10.Vetores;

import java.util.Locale;
import java.util.Scanner;

public class exe01 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double sum = 0.0;
        int n = scanner.nextInt();
        double[] vect = new double[n];
        for (int i = 0; i < n; i++) {
            vect[i] = scanner.nextDouble();
            sum += vect[i];
        }

        double media = sum / n;
        System.out.println(media);

        scanner.close();
    }

}
