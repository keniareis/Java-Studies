package org.Learnig.Sistema_de_Xadrez.boardLayer;

public class Board {
    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns) {
        if (rows < 1 || columns < 1){
            throw new BoardException("Erro cirando o tabuleiro: É preciso ter pelo menos 1 linha e 1 coluna");
        }
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public Piece piece(int row, int column){
        if (!positionExists(row, column)){
            throw new BoardException("Posição não está no tabuleiro!");
        }
        return pieces[row][column];
    }
    public Piece piece(Position position){
        if (!positionExists(position)){
            throw new BoardException("Posição não está no tabuleiro!");
        }
        return pieces[position.getRow()][position.getColumn()];
    }

    public void placePiece(Piece piece, Position position){
        if (thereIsAPiece(position)){
            throw new BoardException("Já existe uma peça nessa posição " + position);
        }
        pieces[position.getRow()][position.getColumn()] = piece; // coloca a peça na posição especificada
        piece.position = position; // atualizando a posição da peça para a nova posição no tabuleiro
    }

    private boolean positionExists(int row, int column){
        return row >= 0 && row < rows && column >= 0 && column < columns;//verifica se a posição especifica para o row e column existe no tabuleiro
    }

    public boolean positionExists(Position position){
        return positionExists(position.getRow(), position.getColumn());// chama o metodo anterio para verificar se a posição existe
    }

    public boolean thereIsAPiece(Position position){
        if (!positionExists(position)){
            throw new BoardException("Posição não está no tabuleiro!");
        }
        return piece(position) != null; // veirifica se a peça na posição é null
    }

}
