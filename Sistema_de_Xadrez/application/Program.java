package org.Learnig.Sistema_de_Xadrez.application;

import org.Learnig.Sistema_de_Xadrez.chessLayer.ChessException;
import org.Learnig.Sistema_de_Xadrez.chessLayer.ChessMatch;
import org.Learnig.Sistema_de_Xadrez.chessLayer.ChessPiece;
import org.Learnig.Sistema_de_Xadrez.chessLayer.ChessPosition;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();

        try {
            UI.clearScreen();
            UI.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.print("Origem: ");
            ChessPosition source = UI.readChessPosition(scanner);

            boolean[][] possibleMoves = chessMatch.possibleMoves(source);
            UI.clearScreen();
            UI.printBoard(chessMatch.getPieces(), possibleMoves);

            System.out.println();
            System.out.print("Destino: ");
            ChessPosition target = UI.readChessPosition(scanner);

            ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
        }catch (ChessException | InputMismatchException e){
            System.out.println(e.getMessage());
            scanner.nextLine();
        }
    }
}