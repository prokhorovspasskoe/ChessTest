package ru.prokhorov.chesstest.entities;

public class Knight implements ChessPiece{
    private String name;
    private final int weight = 3;
    private boolean color;

    @Override
    public void move() {
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean isColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
