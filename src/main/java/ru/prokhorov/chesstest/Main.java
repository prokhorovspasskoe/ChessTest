package ru.prokhorov.chesstest;

import ru.prokhorov.chesstest.entities.ChessBoard;
import ru.prokhorov.chesstest.entities.ChessPlayer;

public class Main {
    public static void main(String[] args) {
        ChessBoard chessBoard = new ChessBoard();
        chessBoard.setStartPosition();
        ChessPlayer chessPlayer = new ChessPlayer();
        chessPlayer.turn(7, 0, 2, 0, chessBoard.getBoard(), chessBoard.getBlackBishop());
    }
}
