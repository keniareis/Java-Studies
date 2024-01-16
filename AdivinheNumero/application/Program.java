package org.Learnig.AdivinheNumero.application;

import org.Learnig.AdivinheNumero.model.entities.Adivinhação;
import org.Learnig.AdivinheNumero.model.exceptions.GuessException;

import java.util.Locale;
import java.util.Scanner;

public class Program  {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("====== ADIVINHE O NÚMERO ======");
            System.out.print("Escolha um número de 1 a 5: ");
            int escolhaUsuario = scanner.nextInt();

            Adivinhação adivinhação = new Adivinhação(escolhaUsuario);

            try {
                adivinhação.computador();
                System.out.println(adivinhação);
            } catch (GuessException e) {
                System.out.println(e.getMessage());
            }


            System.out.println("Jogar novamente? [1]Sim [2]Não");
            int resposta = scanner.nextInt();

            try{
                if(!adivinhação.playAgain(resposta)){
                    break;
                }
            }catch (GuessException e){
                System.out.println(e.getMessage());
            }

        }
    }
}
