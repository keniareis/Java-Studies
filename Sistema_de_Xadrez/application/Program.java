package org.Learnig.Sistema_de_Xadrez.application;

import org.Learnig.Sistema_de_Xadrez.chessLayer.ChessMatch;

public class Program {
    public static void main(String[] args){
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
}
