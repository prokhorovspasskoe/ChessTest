package ru.prokhorov.chesstest.entities;

import ru.prokhorov.chesstest.interfaces.ChessPiece;

import java.util.ArrayList;
import java.util.List;

public class Line {
    private final List<ChessPiece> objectsOnLine;
    private int len;
    public Line() {
        this.objectsOnLine = new ArrayList<>();
    }

    public void setObjectToLine(ChessPiece chessPiece, int len) {
        this.len = len;
        objectsOnLine.add(chessPiece);
    }
    public ChessPiece getPieceInCellOnLine(int index){
        return objectsOnLine.get(index);
    }
    public List<ChessPiece> getObjectsOnLine() {
        return objectsOnLine;
    }

    public int getLen() {
        return len;
    }
}
