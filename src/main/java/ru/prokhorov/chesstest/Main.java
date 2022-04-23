package ru.prokhorov.chesstest;

import ru.prokhorov.chesstest.entities.ChessBoard;
import ru.prokhorov.chesstest.entities.ChessPlayer;

public class Main {
    public static void main(String[] args) {
        ChessBoard chessBoard = new ChessBoard();
        chessBoard.setStartPosition();
        ChessPlayer chessPlayer = new ChessPlayer();
        chessPlayer.turn(6, 0, 6, 7, chessBoard.getBoard(), chessBoard.getBlackPawn());
    }
}
