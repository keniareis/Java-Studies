package org.Learnig.Sistema_de_Xadrez.chessLayer;

import org.Learnig.Sistema_de_Xadrez.boardLayer.Board;
import org.Learnig.Sistema_de_Xadrez.boardLayer.Piece;
import org.Learnig.Sistema_de_Xadrez.boardLayer.Position;
import org.Learnig.Sistema_de_Xadrez.chessLayer.pieces.King;
import org.Learnig.Sistema_de_Xadrez.chessLayer.pieces.Rook;

public class ChessMatch {
    private Board board;

    public ChessMatch() {
        board = new Board(8, 8);
        initialSetup();
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

    public ChessPiece performChessMove(ChessPosition sourcePosition, ChessPosition targetPosition) {
        Position source = sourcePosition.toPostion();
        Position target = targetPosition.toPostion();
        validateSourcePosition(source);//verifica se a peça na posição de origem pode ser movida
        Piece capturedPiece = makeMove(source, target);//move a peça para o destino e retorna a peça capturada
        return (ChessPiece) capturedPiece;//converte pra chesspiece e a retorna
    }

    private Piece makeMove(Position source, Position target){
        Piece p = board.removePiece(source);
        Piece capturedPiece = board.removePiece(target);
        board.placePiece(p, target);
        return capturedPiece;
    }

    private void validateSourcePosition(Position position){
        if (!board.thereIsAPiece(position)){
            throw new ChessException("Não há peça nessa posição");
        }
    }

    private void placeNewPiece(char column, int row, ChessPiece piece){
        board.placePiece(piece, new ChessPosition(column, row).toPostion());//coloca a peça na posição especificada no toabuleiro do jogo
    }

    public void initialSetup(){
        placeNewPiece('c', 1, new Rook(board, Color.WHITE));
        placeNewPiece('c', 2, new Rook(board, Color.WHITE));
        placeNewPiece('d', 2, new Rook(board, Color.WHITE));
        placeNewPiece('e', 2, new Rook(board, Color.WHITE));
        placeNewPiece('e', 1, new Rook(board, Color.WHITE));
        placeNewPiece('d', 1, new King(board, Color.WHITE));

        placeNewPiece('c', 7, new Rook(board, Color.BLACK));
        placeNewPiece('c', 8, new Rook(board, Color.BLACK));
        placeNewPiece('d', 7, new Rook(board, Color.BLACK));
        placeNewPiece('e', 7, new Rook(board, Color.BLACK));
        placeNewPiece('e', 8, new Rook(board, Color.BLACK));
        placeNewPiece('d', 8, new King(board, Color.BLACK));
    }

}
