package org.Learnig.novaCalculadora.model.entities;

import org.Learnig.novaCalculadora.model.exceptions.CalculatorException;

import java.util.Scanner;

public class MediaPonderada {
    public static String operacao(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n=====  MÉDIA PONDERADA  =====\n");

        System.out.print("De quantos números será a média? ");
        int numMedia = scanner.nextInt();

        double dividendo = 0, divisor= 0;
        for (int i = 0; i < numMedia; i++) {
            System.out.printf("%d° valor: ", i+1);
            double valor = scanner.nextDouble();

            System.out.print("Peso do valor: ");
            double peso = scanner.nextDouble();

            double x = (valor * peso);
            dividendo += x;

            divisor += peso;
        }
        if (numMedia <= 0){
            throw new CalculatorException("A média tem que ser coposta por pelo menor 1 número");
        }
        return String.format("A média é: %.2f",  dividendo/divisor);

    }

}

