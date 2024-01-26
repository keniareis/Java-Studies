package org.Learnig.Sistema_de_Xadrez.application;

import org.Learnig.Sistema_de_Xadrez.chessLayer.ChessMatch;
import org.Learnig.Sistema_de_Xadrez.chessLayer.ChessPiece;
import org.Learnig.Sistema_de_Xadrez.chessLayer.ChessPosition;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();

        while (true){
            UI.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.print("Origem: ");
            ChessPosition source = UI.readChessPosition(scanner);

            System.out.println();
            System.out.print("Destino: ");
            ChessPosition target = UI.readChessPosition(scanner);

            ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
        }
    }
}
