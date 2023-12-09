package org.Learnig.Estudos_do_Curso.Secao10.Vetores.dados_pessoas;

import java.util.Locale;
import java.util.Scanner;

public class dadosPessoas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.print("Quantas pessoas serao digitadas? ");
        n = scanner.nextInt();

        String[] Genero = new String[n];
        double[] altura = new double[n];

        for (int i = 0; i < Genero.length; i++) {
            System.out.printf("Altura da %da pessoa: \n", i + 1);
            altura[i] = scanner.nextDouble();
            scanner.nextLine();
            System.out.printf("Gerenero da %da pessoa: ", i+1);
            Genero[i] = scanner.nextLine();

        }

        double menor = altura[0];
        double maior = altura[0];
        for (int i = 0; i < n; i++) {
            if (maior < altura[i]){
                maior = altura[i];
            }
            if (menor > altura[i]){
                menor = altura[i];
            }
        }
        System.out.printf("Maior altura = %.2f\nMenor altura = %.2f", maior,menor);

        double media = 0.0;
        int cont = 0;
        for (int i = 1; i < n; i++) {
            if (Genero[i].equals("F")) {
                media += altura[i];
                cont++;
            }
        }
        System.out.printf("\nMedia das alturas das mulheres = %.2f", (media/cont));

        int contHome = 0;
        for (int i = 0; i < n; i++) {
            if (Genero[i].equals("M")){
                contHome++;
            }
        }
        System.out.printf("\nNumero de homens = %d", contHome);

        scanner.close();
    }
}
