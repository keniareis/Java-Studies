package org.Learnig.Estudos_do_Curso.Secao10.Vetores.Alturas.Aplication;

import org.Learnig.Estudos_do_Curso.Secao10.Vetores.Alturas.Entities.Pessoas;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n;
        System.out.print("Quantas pessoas serao digitadas? ");
        n = scanner.nextInt();

        Pessoas[] pessoas = new Pessoas[n];

        double soma = 0.0;
        for (int i = 0; i < pessoas.length; i++) {
            System.out.printf("Dados da %da pessoa:\n", i+1);
            scanner.nextLine();
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            System.out.print("Altura: ");
            double altura = scanner.nextDouble();

            pessoas[i] = new Pessoas(nome, idade, altura);

            soma += pessoas[i].getAltura();
        }

        double alturaMedia = soma / pessoas.length;
        System.out.printf("\nAltura media: %.2f", alturaMedia);

        double menorDeIdade = 0.0;
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getIdade() < 16)
                menorDeIdade++;
        }
        System.out.printf("\nPessoas com menos de 16 anos: %.1f%%", (menorDeIdade/ pessoas.length) * 100);

        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getIdade() < 16)
                System.out.printf("\n%s", pessoas[i].getNome());
        }


        scanner.close();
    }
}
