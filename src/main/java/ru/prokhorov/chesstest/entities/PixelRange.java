package ru.prokhorov.chesstest.entities;

public class PixelRange {
    private final int rangeX;
    private final int rangeX2;

    public PixelRange(int rangeX, int rangeX2) {
        this.rangeX = rangeX;
        this.rangeX2 = rangeX2;
    }

    public int getRangeX() {
        return rangeX;
    }

    public int getRangeX2() {
        return rangeX2;
    }

}
