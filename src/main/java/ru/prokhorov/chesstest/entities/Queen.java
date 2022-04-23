package ru.prokhorov.chesstest.entities;

import ru.prokhorov.chesstest.enums.Color;
import ru.prokhorov.chesstest.interfaces.ChessPiece;

public class Queen implements ChessPiece {
    private final String name;
    private final Color color;


    @Override
    public int getWeight() {
        return 9;
    }

    @Override
    public Color isColor() {
        return color;
    }

    @Override
    public String getName() {
        return name;
    }

    public Queen(String name, Color color) {
        this.name = name;
        this.color = color;
    }
}
