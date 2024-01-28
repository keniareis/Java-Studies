package org.Learnig.novaCalculadora.model.entities;

import org.Learnig.novaCalculadora.model.exceptions.CalculatorException;

import java.util.Scanner;

public class CalculoSimples {

    public static String operacao() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=====  CALCULO SIMPLES  =====");
        System.out.println("Qual operação? \n[1]Soma\n[2]Subtração\n[3]Multiplicação\n[4]Divisão\n");
        int escolha = scanner.nextInt();

        System.out.print("1° Valor: ");
        int valorUm = scanner.nextInt();
        System.out.print("2° Valor: ");
        int valorDois = scanner.nextInt();

        if (escolha < 5 && escolha > 0) {
            switch (escolha) {
                case 1:
                    return "Resultado: " + (int)(valorUm + valorDois);

                case 2:
                    return "Resultado: " + (int)(valorUm - valorDois);

                case 3:
                    return "Resultado: " + (int)(valorUm * valorDois);

                case 4:
                    if (valorDois == 0) {
                        throw new CalculatorException("Divisão por 0 não é permitida");
                    } else {
                        return "Resultado: " + (valorUm / valorDois);
                    }

                default:
                    System.out.println("Operação inválida!");
                    break;
            }
        }
        return "";
    }
}