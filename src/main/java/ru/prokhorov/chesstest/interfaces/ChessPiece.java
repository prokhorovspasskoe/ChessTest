package ru.prokhorov.chesstest.interfaces;

import ru.prokhorov.chesstest.enums.Color;

public interface ChessPiece {
    Color isColor();
    String getName();
    void move();
}
