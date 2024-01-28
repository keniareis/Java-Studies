package org.Learnig.novaCalculadora.application;

import org.Learnig.novaCalculadora.model.entities.CalculoSimples;
import org.Learnig.novaCalculadora.model.entities.ConversorDeTemperatura;
import org.Learnig.novaCalculadora.model.entities.MediaPonderada;
import org.Learnig.novaCalculadora.model.exceptions.CalculatorException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            try {

                System.out.println("\n=====  CALCULADORA/CONVERSOR  =====\n");
                System.out.print("Escolha uma opção: \n[1]Calculo Simples\n[2]Média Ponderada\n[3]Conversor de Temperatura\n");
                int choice = scanner.nextInt();

                if (choice < 1 || choice > 3){
                    throw new CalculatorException("Escolha invalida!");
                }else {
                    if (choice == 1) {
                        System.out.println(CalculoSimples.operacao());
                    } else if (choice == 2) {
                        System.out.println(MediaPonderada.operacao());
                    } else {
                        System.out.println(ConversorDeTemperatura.operação());
                    }
                }
            } catch (CalculatorException e) {
                System.out.println(e.getMessage());
                scanner.nextLine();
            }
            System.out.println("\nUsar a calculadora denovo? \n[s]Sim\n[n]Não\n");
            String again = scanner.next();
            if (again.equalsIgnoreCase("n")) continuar = false;
        }
            scanner.close();
    }
}
