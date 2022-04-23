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

    public void SetPosition(ChessPiece chessPiece, int horizontal, int vertical){
        for (int i = 0; i < HORIZONTAL; i++) {
            for (int j = 0; j < VERTICAL; j++) {
              if(board[i][j].equals(chessPiece)){
                  if(isCellValid(horizontal, vertical)) board[horizontal][vertical] = chessPiece;
                  board[i][j] = null;
              }
            }
        }
    }

    public void isItPossibleToMove(ChessPiece chessPiece, int horizontal, int vertical){
        if(chessPiece.getName().equals("Queen")){
            
        }
    }

    private boolean isCellEmpty(int horizontal, int vertical){
        return board[horizontal][vertical] == null;
    }

    private boolean checkLine(int horizontal, int vertical, int len, int incH, int incV){
        int endHorizontal = horizontal + 1 * (len - 1) * incH;
        int endVertical = vertical + 1 * (len - 1) * incV;

        if(!isCellValid( endHorizontal, endVertical)){
            return false;
        }
        for (int i = 0; i < len; i++) {
            if(board[horizontal + i * incH][vertical + 1 * incV] != null) return false;
        }
        return true;
    }

    private boolean isCellValid(int hor, int ver){
        return hor >= 0 && ver >= 0 && hor < HORIZONTAL && ver < VERTICAL;
    }

    private int lenLine(int positionH, int PositionV, int targetH, int targetV){
        
    }
}
