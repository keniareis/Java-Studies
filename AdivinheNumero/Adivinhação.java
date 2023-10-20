package org.Learnig.AdivinheNumero;

import java.util.Random;

public class Adivinhação {
    public int escolhaUsuario;
    public int escolhaComputador;
    public int computador(){
        Random random = new Random();
        return escolhaComputador = random.nextInt(1,6);
    }

    public String toString(){
        if (escolhaUsuario < 1 || escolhaUsuario > 5)
            return "\nEscolha inválida!";
        else if (escolhaUsuario == escolhaComputador)
            return "\nYou Win! :D\nYou: " + escolhaUsuario + "\nComputer: " + escolhaComputador ;
        else
            return "\nYou Lose! :(\nYou: " + escolhaUsuario + "\nComputer: " + escolhaComputador;

    }
}
