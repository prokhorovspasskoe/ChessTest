package ru.prokhorov.chesstest.entities;

import java.util.ArrayList;
import java.util.List;

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
                if (board[horizontal][vertical] == null && board[i][j] != null && board[i][j].equals(chessPiece)) {
                    board[i][j] = null;
                    board[horizontal][vertical] = chessPiece;
                    break;
                }
                if(board[horizontal][vertical] != null && board[i][j] != null && board[i][j].equals(chessPiece)){
                    if(board[horizontal][vertical].isColor() != board[HORIZONTAL][VERTICAL].isColor()){
                        deleteChessPieceFromList(board[horizontal][vertical]);
                        board[horizontal][vertical] = chessPiece;
                    }
                }
            }
        }
    }

    public void isItPossibleToMove(ChessPiece chessPiece, int horizontal, int vertical){
        
    }
}
