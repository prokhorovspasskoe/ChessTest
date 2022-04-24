package ru.prokhorov.chesstest.entities;

public class ChessPlayer {
    public void makeMove(ChessPiece[][] board, ChessPiece chessPiece, int positionToHorizontal,
                         int positionToVertical, int targetFieldH, int targetFieldV){
        board[targetFieldH][targetFieldV] = chessPiece;
        board[positionToHorizontal][positionToVertical] = null;
    }
}
