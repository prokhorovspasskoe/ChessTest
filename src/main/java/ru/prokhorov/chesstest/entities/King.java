package ru.prokhorov.chesstest.entities;

import ru.prokhorov.chesstest.enums.Color;
import ru.prokhorov.chesstest.interfaces.ChessPiece;

public class King implements ChessPiece {
    private final String name;
    private final int weight = 50;
    private final Color color;

    public King(String name, Color color) {
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
