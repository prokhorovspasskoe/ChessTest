package ru.prokhorov.chesstest.entities;

import ru.prokhorov.chesstest.enums.Color;
import ru.prokhorov.chesstest.interfaces.ChessPiece;

public class Rook implements ChessPiece {
    private String name;
    private final int weight = 50;
    private Color color;

    public Rook(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public void move() {
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public Color isColor() {
        return color;
    }


    @Override
    public String getName() {
        return name;
    }
}
