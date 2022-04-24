package ru.prokhorov.chesstest.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ChessBoard {
    private final ChessPiece[][] board;
    private final List<ChessPiece> chessPieceList;
    private final int HORIZONTAL = 8;
    private final int VERTICAL = 8;

    public ChessBoard() {
        this.board = new ChessPiece[HORIZONTAL][VERTICAL];
        chessPieceList = new ArrayList<>();
    }

    public ChessPiece[][] getBoard() {
        return board;
    }

    public List<ChessPiece> getChessPieceList() {
        return chessPieceList;
    }

    public void setChessPieceToList(ChessPiece chessPiece) {
        this.chessPieceList.add(chessPiece);
    }

    public void deleteChessPieceFromList(ChessPiece chessPiece){
        this.chessPieceList.remove(chessPiece);
    }

    private boolean isCellValid(int hor, int ver){
        return hor >= 0 && ver >= 0 && hor < HORIZONTAL && ver < VERTICAL;
    }

}