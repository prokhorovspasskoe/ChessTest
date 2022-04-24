package ru.prokhorov.chesstest;

import ru.prokhorov.chesstest.entities.ChessBoard;
import ru.prokhorov.chesstest.entities.ChessPlayer;

public class Main {
    public static void main(String[] args) {
        ChessBoard chessBoard = new ChessBoard();
        chessBoard.setStartPosition();
        ChessPlayer chessPlayer = new ChessPlayer();
        chessPlayer.checkTurn(7, 2, 3, 7, chessBoard.getBoard(), chessBoard.getWhiteBishop());
    }
}
