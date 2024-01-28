package org.Learnig.novaCalculadora.model.entities;

import org.Learnig.novaCalculadora.model.exceptions.CalculatorException;

import java.util.Scanner;

public class ConversorDeTemperatura {
    public static String operação(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n=====  CONVERSOR DE TEMPERATURA  =====\n");
        System.out.print("Temperatura de partida:\n[1]Celsius-°C\n[2]Fahrenheit-°F\n[3]Kelvin-K\n");
        int escolha_inicio = scanner.nextInt();

        while (true) { //loop so vai sair  quando a operação for feita
            if (escolha_inicio < 1 || escolha_inicio > 3) {
                throw new CalculatorException("\nEscolha inválida\n");
            }else {
                System.out.print("Para que temperatura você quer converter?\n[1]Fahrenheit-°F\n[2]Kelvin-K\n");
                int escolha_convert = scanner.nextInt();

                System.out.print("Digite a temperatura: ");
                double temp = scanner.nextDouble();

                if (escolha_inicio == 1) {

                    if (escolha_convert < 1 || escolha_convert > 2) {
                        throw new CalculatorException("\nEscolha inválida\n");

                    } else if (escolha_convert == 1) {//temp para fahrenheit
                        return String.format("Temperatura convertida: %.0f°F\n", ((temp * (9 / 5)) + 32));

                    } else { //temp para kelvin
                        return String.format("Temperatura convertida: %.0fK\n", (temp + 273.15));
                    }

                } else if (escolha_inicio == 2) {

                    if (escolha_convert < 1 || escolha_convert > 2) {
                        throw new CalculatorException("\nEscolha inválida\n");

                    } else if (escolha_convert == 1) {//fahrenheit para temp
                        return String.format("Temperatura convertida: %.0f°C\n", ((temp - 32) * (5 / 9)));

                    } else {//fahrenheit para kelvin
                        return String.format("Temperatura convertida: %.0fK\n", ((temp + 459.67) * (5 / 9)));
                    }
                } else {

                    if (escolha_convert < 1 || escolha_convert > 2) {
                        throw new CalculatorException("\nEscolha inválida\n");

                    } else if (escolha_convert == 1) {//kelvin para temp
                        return String.format("Temperatura convertida: %.0f°C\n", (temp - 273.15));

                    } else {//kelvin para fahrenheit
                        return String.format("Temperatura convertida: %.0fK\n", (temp * (9 / 5) - 459.67));
                    }
                }
            }
        }
    }
}
