package org.Learnig.Sistema_de_Xadrez.chessLayer;

import org.Learnig.Sistema_de_Xadrez.boardLayer.Board;

public class ChessException extends RuntimeException{
    private static final long srtialVersionUID = 1L;

    public ChessException(String msg){
        super(msg);
    }
}
