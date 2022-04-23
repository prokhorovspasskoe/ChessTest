package ru.prokhorov.chesstest.entities;

public interface ChessPiece {
    boolean isColor();
    String getName();
    void move();
}
