package ru.prokhorov.chesstest.entities;

public class Queen implements ChessPiece{
    private final String name;
    private final Color color;

    @Override
    public void move() {

    }

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
