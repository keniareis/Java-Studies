package org.Learnig.Sistema_de_Xadrez.chessLayer.pieces;

import org.Learnig.Sistema_de_Xadrez.boardLayer.Board;
import org.Learnig.Sistema_de_Xadrez.chessLayer.ChessPiece;
import org.Learnig.Sistema_de_Xadrez.chessLayer.Color;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString(){
        return "K";
    }
}
