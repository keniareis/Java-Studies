package org.Learnig.Estudos_do_Curso.Secao10.Vetores.numeros_pares;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n, cont = 0;
        ;
        System.out.print("Quantos numeros voce vai digitar: ");
        n = scanner.nextInt();

        int[] numero = new int[n];

        for (int i = 0; i < numero.length; i++) {
            System.out.print("Digite um numero: ");
            numero[i] = scanner.nextInt();
        }

        System.out.print("\nNUMEROS PARES:\n");

        for (int i = 0; i < numero.length; i++) {
            if (numero[i] % 2 == 0) {
                System.out.printf("%d  ", numero[i]);
                cont++;
            }
        }

        System.out.printf("\nQUANTIDADE DE PARES = %d", cont);

        scanner.close();
    }
}
