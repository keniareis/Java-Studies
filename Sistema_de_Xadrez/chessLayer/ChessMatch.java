package org.Learnig.Sistema_de_Xadrez.chessLayer;

import org.Learnig.Sistema_de_Xadrez.boardLayer.Board;
import org.Learnig.Sistema_de_Xadrez.boardLayer.Position;
import org.Learnig.Sistema_de_Xadrez.chessLayer.pieces.King;
import org.Learnig.Sistema_de_Xadrez.chessLayer.pieces.Rook;

public class ChessMatch {
    private Board board;

    public ChessMatch() {
        board = new Board(8, 8);
    }

    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];//nova matriz com o mesmo numero de linhas e colunas
        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                mat[i][j] = (ChessPiece) board.piece(i, j); // pega a peça na posição atual do tabuleiro e coloca na posição correspondente de mat
            }
        }
        return mat; //retorna a matri que agora contem todas as peças do tabuleiro em posição correspondente
    }

    public void initialSetup(){
        board.placePiece(new Rook(board, Color.WHITE), new Position(2, 1));
        board.placePiece(new King(board, Color.BLACK), new Position(0, 4));
        board.placePiece(new King(board, Color.WHITE), new Position(7, 4));
    }

}
