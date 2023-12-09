package org.Learnig.Estudos_do_Curso.Secao10.Vetores.Aprovados;

import java.util.Locale;
import java.util.Scanner;

public class aprovados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.print("Quantos alunos serao digitados? ");
        n = scanner.nextInt();

        String[] nome = new String[n];
        double[] nota1 = new double[n];
        double[] nota2 = new double[n];

        for (int i = 0; i < nome.length; i++) {
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno: \n",i+1);
            scanner.nextLine();
            nome[i] = scanner.nextLine();
            nota1[i] = scanner.nextDouble();
            nota2[i] = scanner.nextDouble();

        }

        double media;
        System.out.printf("Alunos aprovados: ");
        for (int i=1; i<n; i++) {
            media = ((nota1[i] + nota2[i]) / 2);
            if (media >= 6 ) {
                System.out.printf("\n%s", nome[i]);
            }
        }

        scanner.close();
    }
}