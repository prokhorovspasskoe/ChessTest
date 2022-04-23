package ru.prokhorov.chesstest.entities;

public class King implements ChessPiece{
    private final String name;
    private final Color color;

    @Override
    public void move() {

    }

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

    public King(String name, Color color) {
        this.name = name;
        this.color = color;
    }
}
