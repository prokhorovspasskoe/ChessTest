package ru.prokhorov.chesstest.entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ChessBoard {
    private final ChessPiece[][] board;
    private final List<ChessPiece> chessPieceList;
    private final int HORIZONTAL = 8;
    private final int VERTICAL = 8;
    private final Rook blackRook;
    private final Knight blackKnight;
    private final Bishop blackBishop;
    private final Queen blackQueen;
    private final King blackKing;
    private final Pawn blackPawn;

    private final Rook whiteRook;
    private final Knight whiteKnight;
    private final Bishop whiteBishop;
    private final Queen whiteQueen;
    private final King whiteKing;
    private final Pawn whitePawn;

    public ChessBoard() {
        this.board = new ChessPiece[HORIZONTAL][VERTICAL];
        chessPieceList = new ArrayList<>();
        blackRook = new Rook("Rook", Color.BLACK);
        chessPieceList.add(blackRook);
        blackKnight = new Knight("Knight", Color.BLACK);
        chessPieceList.add(blackKnight);
        blackBishop = new Bishop("Bishop", Color.BLACK);
        chessPieceList.add(blackBishop);
        blackQueen = new Queen("Queen", Color.BLACK);
        chessPieceList.add(blackQueen);
        blackKing = new King("King", Color.BLACK);
        chessPieceList.add(blackKing);
        chessPieceList.add(blackBishop);
        chessPieceList.add(blackKnight);
        chessPieceList.add(blackRook);
        blackPawn = new Pawn("Pawn", Color.BLACK);
        for (int i = 0; i < VERTICAL; i++) {
            chessPieceList.add(blackPawn);
        }

        whiteRook = new Rook("Rook", Color.WHITE);
        chessPieceList.add(whiteRook);
        whiteKnight = new Knight("Knight", Color.WHITE);
        chessPieceList.add(whiteKnight);
        whiteBishop = new Bishop("Bishop", Color.WHITE);
        chessPieceList.add(whiteBishop);
        whiteQueen = new Queen("Queen", Color.WHITE);
        chessPieceList.add(whiteQueen);
        whiteKing = new King("King", Color.WHITE);
        chessPieceList.add(whiteKing);
        chessPieceList.add(whiteBishop);
        chessPieceList.add(whiteKnight);
        chessPieceList.add(whiteRook);
        whitePawn = new Pawn("Pawn", Color.WHITE);
        for (int i = 0; i < VERTICAL; i++) {
            chessPieceList.add(whitePawn);
        }
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

    private int lenLine(int positionH, int positionV, int targetH, int targetV){
        int len = 0;
        if(isCellValid(targetH, targetV)){
            if(positionH == targetH && positionV < targetV){
                for (int i = positionV; i <= targetV; i++) {
                    if(!isCellValid(positionH, i)) break;
                    len++;
                }
            }

            if(positionH == targetH && positionV > targetV){
                for (int i = positionV; i >= targetV ; i--) {
                    if(!isCellValid(positionH, i)) break;
                    len++;
                }
            }

            if(positionH > targetH && positionV == targetV){
                for (int i = positionH; i >= targetH ; i--) {
                    if(!isCellValid(i, positionV)) break;
                    len++;
                }
            }

            if(positionH < targetH && positionV == targetV){
                for (int i = positionH; i <= targetH ; i++) {
                    if(!isCellValid(i, positionV)) break;
                    len++;
                }
            }
        }

        return len;
    }

    public void setStartPosition(){
        board[0][0] = blackRook;
        board[0][1] = blackKnight;
        board[0][2] = blackBishop;
        board[0][3] = blackQueen;
        board[0][4] = blackKing;
        board[0][5] = blackBishop;
        board[0][6] = blackKnight;
        board[0][7] = blackRook;
        for (int i = 0; i < VERTICAL; i++) {
            board[1][i] = blackPawn;
        }

        board[7][0] = whiteRook;
        board[7][1] = whiteKnight;
        board[7][2] = whiteBishop;
        board[7][3] = whiteQueen;
        board[7][4] = whiteKing;
        board[7][5] = whiteBishop;
        board[7][6] = whiteKnight;
        board[7][7] = whiteRook;
        for (int i = 0; i < VERTICAL; i++) {
            board[6][i] = whitePawn;
        }
    }
}