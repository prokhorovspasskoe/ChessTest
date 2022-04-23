package ru.prokhorov.chesstest.interfaces;

import ru.prokhorov.chesstest.enums.Color;

public interface ChessPiece {
    Color isColor();
    String getName();
    int getWeight();
    boolean movePossible(int startPosH, int startPosV, int targetH, int targetV);
}
