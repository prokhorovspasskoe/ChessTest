package ru.prokhorov.chesstest.entities;

import ru.prokhorov.chesstest.interfaces.ChessPiece;

public class ChessCore {
    private final int HORIZONTAL = 8;
    private final int VERTICAL = 8;

    public boolean isCellValid(int hor, int ver){
        return hor >= 0 && ver >= 0 && hor < HORIZONTAL && ver < VERTICAL;
    }

    public ChessPiece isPiece(int targetFieldH, int targetFieldV, ChessPiece[][] board){
        return board[targetFieldH][targetFieldV];
    }

    public Line scanLine(int positionH, int positionV, int targetH, int targetV, ChessPiece[][] board){
        int len = 0;
        Line line = new Line();
        if(isCellValid(targetH, targetV)){
            if(positionH == targetH && positionV < targetV){
                for (int i = positionV+1; i <= targetV; i++) {
                    if(!isCellValid(positionH, i)) break;
                    line.setObjectToLine(board[positionH][i], len);
                    len++;
                }
                line.setLen(len);
            }

            if(positionH == targetH && positionV > targetV){
                for (int i = positionV-1; i >= targetV ; i--) {
                    if(!isCellValid(positionH, i)) break;
                    line.setObjectToLine(board[positionH][i], len);
                    len++;
                }
                line.setLen(len);
            }

            if(positionH > targetH && positionV == targetV){
                for (int i = positionH-1; i >= targetH ; i--) {
                    if(!isCellValid(i, positionV)) break;
                    line.setObjectToLine(board[i][positionV], len);
                    len++;
                }
                line.setLen(len);
            }

            if(positionH < targetH && positionV == targetV){
                for (int i = positionH+1; i <= targetH ; i++) {
                    if(!isCellValid(i, positionV)) break;
                    line.setObjectToLine(board[i][positionV], len);
                    len++;
                }
                line.setLen(len);
            }

            if(positionH < targetH && positionV < targetV){
                for (int i = positionH+1; i <= targetH ; i++) {
                    for (int j = positionV+1; j <= targetV; j++) {
                        if(!isCellValid(i, j)) break;
                        line.setObjectToLine(board[i][j], len);
                        len++;
                        line.setLen(len);
                    }
                }
            }

            if(positionH < targetH && positionV > targetV){
                for (int i = positionH+1; i <= targetH ; i++) {
                    for (int j = positionV-1; j >= targetV; j--) {
                        if(!isCellValid(i, j)) break;
                        line.setObjectToLine(board[i][j], len);
                        len++;
                        line.setLen(len);
                    }
                }
            }

            if(positionH > targetH && positionV > targetV){
                for (int i = positionH-1; i >= targetH ; i--) {
                    for (int j = positionV-1; j >= targetV; j--) {
                        if(!isCellValid(i, j)) break;
                        line.setObjectToLine(board[i][j], len);
                        len++;
                        line.setLen(len);
                    }
                }
            }
        }
        return line;
    }


}
