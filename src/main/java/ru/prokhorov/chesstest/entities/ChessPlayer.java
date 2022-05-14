package ru.prokhorov.chesstest.entities;

import ru.prokhorov.chesstest.interfaces.ChessPiece;

public class ChessPlayer {
    public void makeMove(ChessPiece[][] board, ChessPiece chessPiece, int positionToHorizontal,
                         int positionToVertical, int targetFieldH, int targetFieldV){
        board[targetFieldH][targetFieldV] = chessPiece;
        board[positionToHorizontal][positionToVertical] = null;
    }
}
