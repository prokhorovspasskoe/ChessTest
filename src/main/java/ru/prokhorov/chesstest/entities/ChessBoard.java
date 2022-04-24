package ru.prokhorov.chesstest.entities;

import ru.prokhorov.chesstest.enums.Color;
import ru.prokhorov.chesstest.interfaces.ChessPiece;

import java.util.ArrayList;
import java.util.List;

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

    public Rook getBlackRook() {
        return blackRook;
    }

    public Knight getBlackKnight() {
        return blackKnight;
    }

    public Bishop getBlackBishop() {
        return blackBishop;
    }

    public Queen getBlackQueen() {
        return blackQueen;
    }

    public King getBlackKing() {
        return blackKing;
    }

    public Pawn getBlackPawn() {
        return blackPawn;
    }

    public Rook getWhiteRook() {
        return whiteRook;
    }

    public Knight getWhiteKnight() {
        return whiteKnight;
    }

    public Bishop getWhiteBishop() {
        return whiteBishop;
    }

    public Queen getWhiteQueen() {
        return whiteQueen;
    }

    public King getWhiteKing() {
        return whiteKing;
    }

    public Pawn getWhitePawn() {
        return whitePawn;
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

    public void setStartPosition(){
        board[0][0] = blackRook;
        board[1][0] = blackKnight;
        board[2][0] = blackBishop;
        board[3][0] = blackQueen;
        board[4][0] = blackKing;
        board[5][0] = blackBishop;
        board[6][0] = blackKnight;
        board[7][0] = blackRook;
        for (int i = 0; i < VERTICAL; i++) {
            board[i][1] = blackPawn;
        }

        board[0][7] = whiteRook;
        board[1][7] = whiteKnight;
        board[2][7] = whiteBishop;
        board[3][7] = whiteQueen;
        board[4][7] = whiteKing;
        board[5][7] = whiteBishop;
        board[6][7] = whiteKnight;
        board[7][7] = whiteRook;
        for (int i = 0; i < VERTICAL; i++) {
            board[i][6] = whitePawn;
        }
    }
}