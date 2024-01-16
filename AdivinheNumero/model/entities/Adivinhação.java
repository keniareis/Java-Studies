package org.Learnig.AdivinheNumero.model.entities;

import org.Learnig.AdivinheNumero.model.exceptions.GuessException;

import java.util.Random;

public class Adivinhação {
    private Integer escolhaUsuario;
    private Integer escolhaComputador;

    public Adivinhação(){
    }
    public Adivinhação(Integer escolhaUsuario) {
        this.escolhaUsuario = escolhaUsuario;
    }

    public Integer getEscolhaUsuario() {
        return escolhaUsuario;
    }

    public void setEscolhaUsuario(Integer escolhaUsuario) {
        this.escolhaUsuario = escolhaUsuario;
    }

    public int computador() throws GuessException {
        Random random = new Random();
        escolhaComputador = random.nextInt(1,6);

        if (getEscolhaUsuario() < 1 || getEscolhaUsuario() > 5) {
            throw new GuessException("Escolha inválida!");
        }else {
            return escolhaComputador;
        }
    }

    public boolean playAgain(int resposta) throws GuessException {
        if (resposta < 1 || resposta > 2) {
            throw new GuessException("\nEscolha Inválida!");
        }
        if (resposta == 2) {
            return false;
        }
        return true;
    }

    public String toString(){
        if (escolhaUsuario == escolhaComputador)
            return "\nYou Win! :D\nYou: " + escolhaUsuario + "\nComputer: " + escolhaComputador ;
        else
            return "\nYou Lose! :(\nYou: " + escolhaUsuario + "\nComputer: " + escolhaComputador;

    }
}
