//Em breve modularização!!!

package org.Learnig;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;

        do {

            System.out.println("\n======= CALCULADORA/CONVERSOR =======\n");
            System.out.print("O que você deseja fazer?\n[1]Calculo Simples\n[2]Calcular Média Ponderada\n[3]Converter Temperatura\n[4]Sair\n");
            escolha = scanner.nextInt();


            switch (escolha) {
                case 1:
                    while (true) {
                        System.out.println("\n======= CALCULO SIMPLES =======\n");

                        System.out.print("Qual operação você quer fazer?\n[1]Soma\n[2]Subtração\n[3]Multiplicação\n[4]Divisão\n[5]Sair\n");
                        int operacao = scanner.nextInt();

                        if (operacao < 5 && operacao > 0) {
                            System.out.print("Digite o primeiro valor: ");
                            double valor1 = scanner.nextDouble();

                            System.out.print("Digite o segundo valor: ");
                            double valor2 = scanner.nextDouble();

                            if (operacao == 1) {
                                System.out.printf("RESULTADO: %.2f\n", valor1 + valor2);
                                break;

                            } else if (operacao == 2) {
                                System.out.printf("RESULTADO: %.2f\n", valor1 - valor2);
                                break;

                            } else if (operacao == 3) {
                                System.out.printf("RESULTADO: %.2f\n", valor1 * valor2);
                                break;

                            } else if (operacao == 4) {
                                System.out.printf("RESULTADO: %.2f\n", valor1 / valor2);
                                break;
                            }
                        }else if (operacao !=5) {
                            System.out.println("\nEscolha Inválida!\n");
                        }
                        else
                            break;
                    }
                    break;
                case 2:
                    double dividendo = 0, divisor = 0;
                    System.out.println("\n======= MÉDIA PONDERADA =======\n");

                    System.out.print("De quantos números será a média?\n");
                    int numeros_media = scanner.nextInt();

                    for (int i = 0; i < numeros_media; i++){

                        System.out.printf("%d° valor: ", i+1);
                        double valor = scanner.nextDouble();

                        System.out.print("Peso do valor: ");
                        double peso = scanner.nextDouble();

                        double x = (valor * peso);
                        dividendo += x;

                        divisor += peso;
                    }
                    System.out.printf("A média é: %.2f", dividendo/divisor);

                    break;

                case 3:
                    System.out.println("\n======= CONVERSOR DE TEMPERATURA =======\n");

                    System.out.printf("Temperatura de partida:\n[1]Celsius-°C\n[2]Fahrenheit-°F\n[3]Kelvin-K\n");
                    int escolha_inicio = scanner.nextInt();

                    while (true) {
                        if (escolha_inicio < 1 || escolha_inicio > 3) {
                            System.out.println("\nEscolha inválida\n");
                        }
                        else if(escolha_inicio == 1) {
                            System.out.print("Para que temperatura você quer converter?\n[1]Fahrenheit-°F\n[2]Kelvin-K\n");
                            int escolha_convert = scanner.nextInt();

                            System.out.print("Digite a temperatura: ");
                            double celsius = scanner.nextDouble();

                            if (escolha_convert < 1 || escolha_convert > 2){
                                System.out.println("Escolha inválida");

                            }
                            else if (escolha_convert == 1) {
                                System.out.printf("Temperatura convertida: %.0f°F\n", (celsius * (9 / 5)) + 32);

                            }
                            else{
                                System.out.printf("Temperatura convertida: %.0fK\n", celsius + 273,15);
                            }
                            break;

                        }
                        else if (escolha_inicio == 2) {

                            System.out.print("Para que temperatura você quer converter?\n[1]Celsius-°C\n[2]Kelvin-K\n");
                            int escolha_convert = scanner.nextInt();

                            System.out.print("Digite a temperatura: ");
                            double fahre = scanner.nextDouble();

                            if (escolha_convert < 1 || escolha_convert > 2){
                                System.out.println("\nEscolha inválida\n");

                            }
                            else if (escolha_convert == 1) {
                                System.out.printf("Temperatura convertida: %.0f°C\n", (fahre - 32) * (5 / 9));

                            }
                            else{
                                System.out.printf("Temperatura convertida: %.0fK\n", (fahre+ 459.67) * ( 5 / 9 ));
                            }
                            break;
                        }
                        else {
                            System.out.print("Para que temperatura você quer converter?\n[1]Celsius-°C\n[2]Fahrenheit-°F\n");
                            int escolha_convert = scanner.nextInt();

                            System.out.print("Digite a temperatura: ");
                            double kelvin = scanner.nextDouble();

                            if (escolha_convert < 1 || escolha_convert > 2){
                                System.out.println("\nEscolha inválida\n");

                            }
                            else if (escolha_convert == 1) {
                                System.out.printf("Temperatura convertida: %.0f°C\n", kelvin - 273,15);

                            }
                            else{
                                System.out.printf("Temperatura convertida: %.0fK\n", kelvin * (9 / 5) - 459.67);
                            }
                            break;
                        }
                    }
                    break;

                case 4:
                    return;


            }
        }while (escolha != 4);
    }
}
