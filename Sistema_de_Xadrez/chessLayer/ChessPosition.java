package org.Learnig.Sistema_de_Xadrez.chessLayer;

import org.Learnig.Sistema_de_Xadrez.boardLayer.Position;

public class ChessPosition {
    private char column;
    private int row;

    public ChessPosition(char column, int row){
        if (column < 'a' || column > 'h' || row < 1 || row > 8){
            throw new ChessException("Erro ao instanciar a posição de xadrez. Os valores válidos são de a1 a h8");
        }
        this.column = column;
        this.row = row;
    }

    public int getRow() {
        return row;
    }

    public char getColumn() {
        return column;
    }

    protected Position toPostion(){
        return new Position(8 - row, column - 'a');// cria um novo objeto e o retorna
    }

    protected static ChessPosition fromPosition(Position position){
        return new ChessPosition((char)('a' + position.getColumn()), 8 - position.getRow());//converte a linha e a coluna do sistema do array para as cordernadas do tabuleiro
    }

    @Override
    public String toString(){
        return "" + column + row;
    }
}
