package ru.prokhorov.chesstest.entities;

import ru.prokhorov.chesstest.enums.Color;
import ru.prokhorov.chesstest.interfaces.ChessPiece;

public class Knight implements ChessPiece {
    private final String name;
    private final Color color;

    @Override
    public int getWeight() {
        return 3;
    }

    @Override
    public Color isColor() {
        return color;
    }

    @Override
    public String getName() {
        return name;
    }

    public Knight(String name, Color color) {
        this.name = name;
        this.color = color;
    }
}
