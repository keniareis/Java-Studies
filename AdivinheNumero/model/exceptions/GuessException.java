package org.Learnig.AdivinheNumero.model.exceptions;

public class GuessException extends Exception{
    private static final long serialVersionUID = 1L;

    public GuessException(String msg){
        super(msg);
    }
}
