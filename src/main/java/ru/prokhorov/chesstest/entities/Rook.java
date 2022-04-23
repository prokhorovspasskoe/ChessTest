package ru.prokhorov.chesstest.entities;

import ru.prokhorov.chesstest.enums.Color;
import ru.prokhorov.chesstest.interfaces.ChessPiece;

public class Rook implements ChessPiece {
    private final String name;
    private final Color color;

    @Override
    public int getWeight() {
        return 50;
    }

    @Override
    public Color isColor() {
        return color;
    }

    @Override
    public String getName() {
        return name;
    }

    public Rook(String name, Color color) {
        this.name = name;
        this.color = color;
    }
}
