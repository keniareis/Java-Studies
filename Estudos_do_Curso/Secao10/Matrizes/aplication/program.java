package org.Learnig.Estudos_do_Curso.Secao10.Matrizes.aplication;

import java.util.Locale;
import java.util.Scanner;

public class program{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Main diagonal: ");
        for (int i = 0; i < n; i++) {
            System.out.println(mat[i][i] + " ");
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(mat[i][j] < 0){
                    count++;
                }
            }
        }
        System.out.println(count);


        scanner.close();
    }
}
