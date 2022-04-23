package ru.prokhorov.chesstest.entities;

public class Bishop implements  ChessPiece{
    private final String name;
    private final Color color;

    @Override
    public void move() {
    }

    @Override
    public Color isColor() {
        return color;
    }

    @Override
    public String getName() {
        return name;
    }

    public Bishop(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public int getWeight() {
        return 3;
    }
}
