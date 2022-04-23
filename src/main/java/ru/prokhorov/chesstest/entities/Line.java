package ru.prokhorov.chesstest.entities;

import ru.prokhorov.chesstest.interfaces.ChessPiece;

public class Line {
    private int len;
    private final ChessPiece[] listObjectOnLine;

    public Line() {
        len = 0;
        listObjectOnLine = new ChessPiece[8];
    }

    public int getLen() {
        return len;
    }

    public ChessPiece[] getListObjectOnLine() {
        return listObjectOnLine;
    }

    public void setLen(int len) {
        this.len = len;
    }

    public void setObjectToLine(ChessPiece chessPiece, int pos) {
        this.listObjectOnLine[pos] = chessPiece;
    }
}
