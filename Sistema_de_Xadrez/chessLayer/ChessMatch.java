package org.Learnig.Sistema_de_Xadrez.chessLayer;

import org.Learnig.Sistema_de_Xadrez.boardLayer.Board;
import org.Learnig.Sistema_de_Xadrez.boardLayer.Piece;
import org.Learnig.Sistema_de_Xadrez.boardLayer.Position;
import org.Learnig.Sistema_de_Xadrez.chessLayer.pieces.King;
import org.Learnig.Sistema_de_Xadrez.chessLayer.pieces.Rook;

import java.util.ArrayList;
import java.util.List;

public class ChessMatch {
    private int turn;
    private Color currentPlayer;
    private Board board;

    private List<Piece> piecesOnTheBoard = new ArrayList<>();
    private List<Piece> capturedPieces = new ArrayList<>();

    public ChessMatch() {
        board = new Board(8, 8);
        turn = 1;
        currentPlayer = Color.WHITE;
        initialSetup();
    }

    public int getTurn() {
        return turn;
    }

    public Color getCurrentPlayer() {
        return currentPlayer;
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

    public boolean[][] possibleMoves(ChessPosition sourcePosition){
        Position position = sourcePosition.toPostion();
        validateSourcePosition(position);
        return board.piece(position).possibleMoves();
    }

    public ChessPiece performChessMove(ChessPosition sourcePosition, ChessPosition targetPosition) {
        Position source = sourcePosition.toPostion();
        Position target = targetPosition.toPostion();
        validateSourcePosition(source);//verifica se a peça na posição de origem pode ser movida
        validateTargetPosition(source, target);
        Piece capturedPiece = makeMove(source, target);//move a peça para o destino e retorna a peça capturada
        nextTurn();
        return (ChessPiece) capturedPiece;//converte pra chesspiece e a retorna
    }

    private Piece makeMove(Position source, Position target){
        Piece p = board.removePiece(source);
        Piece capturedPiece = board.removePiece(target);
        board.placePiece(p, target);

        if (capturedPiece != null){
            piecesOnTheBoard.remove(capturedPiece);
            capturedPieces.add(capturedPiece);
        }

        return capturedPiece;
    }

    private void validateSourcePosition(Position position){
        if (!board.thereIsAPiece(position)){
            throw new ChessException("Não há peça nessa posição");
        }
        if (currentPlayer != ((ChessPiece)board.piece(position)).getColor()){
            throw new ChessException("A peça escolhida não é sua");
        }
        if (!board.piece(position).isThereAnyPossibleMove()){
            throw new ChessException("Não tem movimentos possíveis para a peça escolhida");
        }
    }

    private void validateTargetPosition(Position source, Position target){
        if (!board.piece(source).possibleMove(target)){
            throw new ChessException("A peça escolhida não pode mover-se para o posição de destino");
        }
    }

    private void nextTurn(){
        turn++;
        currentPlayer = (currentPlayer == Color.WHITE) ? Color.BLACK : Color.WHITE;
    }

    private void placeNewPiece(char column, int row, ChessPiece piece){
        board.placePiece(piece, new ChessPosition(column, row).toPostion());//coloca a peça na posição especificada no toabuleiro do jogo
        piecesOnTheBoard.add(piece);
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
