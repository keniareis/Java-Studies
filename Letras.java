package org.Learnig;

import java.util.Scanner;

public class Letras {

    public static int vogal(String palavra){

        String vogais = "aeiou";
        int qtd_vogais = 0;

        for(int i = 0; i < palavra.length(); i++){
            for (int j = 0; j < vogais.length(); j++){
                if (palavra.charAt(i) == vogais.charAt(j)) {
                    qtd_vogais++;
                }
            }
        }
        return qtd_vogais;
    }

    public static int consoante(String palavra){

        String consoantes = "bcdfgjklmnpqrstvwxzç";
        int qtd_cosoantes = 0;

        for(int i = 0; i < palavra.length(); i++) {
            for (int j = 0; j < consoantes.length(); j++) {
                if (palavra.charAt(i) == consoantes.charAt(j)) {
                    qtd_cosoantes++;
                }
            }
        }
        return qtd_cosoantes;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite uma palavra/frase: ");
            String palavra = scanner.nextLine().toLowerCase();

            if (vogal(palavra) == 0 || consoante(palavra) == 0) {
                System.out.print("\nPalavra Inválida!\n\n");

            }else {
                System.out.printf("Vogais: %d\nConsoantes: %d", vogal(palavra), consoante(palavra));
                break;
            }
        }
    }
}
