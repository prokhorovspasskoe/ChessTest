package ru.prokhorov.chesstest.entities;

public interface ChessPiece {
    Color isColor();
    String getName();
    int getWeight();
    void move();
}
