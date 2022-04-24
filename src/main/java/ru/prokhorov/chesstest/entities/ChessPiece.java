package ru.prokhorov.chesstest.entities;

import ru.prokhorov.chesstest.enums.Color;

public interface ChessPiece {
    Color isColor();
    String getName();
    void move();
}
