package org.Learnig.Estudos_do_Curso.Secao10.Vetores.exeNegativos.Aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int vzs = scanner.nextInt();
        int[] n = new int[vzs];

        for (int i = 0; i < n.length; i++) {
            System.out.print("Digite um numero: ");
            n[i] = scanner.nextInt();
        }

        System.out.print("NUMEROS NEGATIVOS:");
        for (int i = 0; i < n.length ; i++) {
            if (n[i] < 0)
                System.out.printf("\n%d", n[i]);
        }


        scanner.close();
    }
}
