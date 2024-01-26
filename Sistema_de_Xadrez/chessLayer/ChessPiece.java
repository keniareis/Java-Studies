package org.Learnig.Sistema_de_Xadrez.chessLayer;

import org.Learnig.Sistema_de_Xadrez.boardLayer.Board;
import org.Learnig.Sistema_de_Xadrez.boardLayer.Piece;
import org.Learnig.Sistema_de_Xadrez.boardLayer.Position;

public class ChessPiece extends Piece {
    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }


    public Color getColor() {
        return color;
    }

    protected boolean isThereOpponentPiece(Position position){
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p != null && p.getColor() != color;
    }

    @Override
    public boolean[][] possibleMoves() {
        return new boolean[0][];
    }
}
