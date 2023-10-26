package org.Learnig.ValidadorSenha.Aplication;

import org.Learnig.ValidadorSenha.entities.Validacao;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Validacao validacao = new Validacao();


        boolean senhaForte = false;

        while (!senhaForte) {
            System.out.print("\nDigite sua senha: \n");
            validacao.setSenha(scanner.nextLine());

            if (validacao.maiusculas() != null || validacao.minusculas() != null ||
                validacao.especiais() != null || validacao.numero() != null || validacao.tamanho() != null)
            {
                System.out.println("SENHA MUITO FRACA");
                if (validacao.maiusculas() != null) {
                    System.out.println(validacao.maiusculas());
                }

                if (validacao.minusculas() != null) {
                    System.out.println(validacao.minusculas());
                }

                if (validacao.especiais() != null) {
                    System.out.println(validacao.especiais());
                }

                if (validacao.numero() != null) {
                    System.out.println(validacao.numero());
                }

                if (validacao.tamanho() != null) {
                    System.out.println(validacao.tamanho());
                }
            }
            else {
                senhaForte = true;
                System.out.println("SENHA FORTE!");
            }
        }
    }

}
