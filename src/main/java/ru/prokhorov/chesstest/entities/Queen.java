package ru.prokhorov.chesstest.entities;

import ru.prokhorov.chesstest.enums.Color;
import ru.prokhorov.chesstest.interfaces.ChessPiece;

public class Queen implements ChessPiece {
    private String name;
    private final int weight = 9;
    private Color color;

    public Queen(String name, Color color) {
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
