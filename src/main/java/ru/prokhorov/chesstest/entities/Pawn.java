package ru.prokhorov.chesstest.entities;

import ru.prokhorov.chesstest.enums.Color;

public class Pawn implements ChessPiece{
    private final String name;
    private final int weight = 1;
    private final Color color;

    public Pawn(String name, Color color) {
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
