package org.Learnig.AdivinheNumero;

import java.util.Locale;
import java.util.Scanner;

public class Program  {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Adivinhação adivinhação = new Adivinhação();

        while (true) {
            System.out.println("====== ADIVINHE O NÚMERO ======");
            System.out.print("Escolha um número de 1 a 5: ");
            adivinhação.escolhaUsuario = scanner.nextInt();
            adivinhação.computador();

            System.out.println(adivinhação);

            System.out.println("Jogar novamente? [1]Sim [2]Não");
            int resposta = scanner.nextInt();

            if (resposta == 2)
                break;
            else if (resposta < 1 || resposta > 2){
                System.out.println("\nEscolha Inválida!");
                System.out.println("Jogar novamente? [1]Sim [2]Não");
                resposta = scanner.nextInt();
            }
        }
    }
}
