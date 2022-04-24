package ru.prokhorov.chesstest.entities;

import ru.prokhorov.chesstest.interfaces.ChessPiece;

public class ChessPlayer {
    private final int HORIZONTAL = 8;
    private final int VERTICAL = 8;

    private boolean isCellValid(int hor, int ver){
        return hor >= 0 && ver >= 0 && hor < HORIZONTAL && ver < VERTICAL;
    }

    private Line scanLine(int positionH, int positionV, int targetH, int targetV, ChessPiece[][] board){
        int len = 0;
        Line line = new Line();
        if(isCellValid(targetH, targetV)){
            if(positionH == targetH && positionV < targetV){
                for (int i = positionV+1; i <= targetV; i++) {
                    if(!isCellValid(positionH, i)) break;
                    line.setObjectToLine(board[positionH][i], len);
                    len++;
                    line.setLen(len);
                }
            }

            if(positionH == targetH && positionV > targetV){
                for (int i = positionV-1; i >= targetV ; i--) {
                    if(!isCellValid(positionH, i)) break;
                    line.setObjectToLine(board[positionH][i], len);
                    len++;
                    line.setLen(len);
                }
            }

            if(positionH > targetH && positionV == targetV){
                for (int i = positionH-1; i >= targetH ; i--) {
                    if(!isCellValid(i, positionV)) break;
                    line.setObjectToLine(board[i][positionV], len);
                    len++;
                    line.setLen(len);
                }
            }

            if(positionH < targetH && positionV == targetV){
                for (int i = positionH+1; i <= targetH ; i++) {
                    if(!isCellValid(i, positionV)) break;
                    line.setObjectToLine(board[i][positionV], len);
                    len++;
                    line.setLen(len);
                }
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

    private ChessPiece isCellEmpty(int targetH, int targetV, ChessPiece[][] board){
        ChessPiece chessPiece = null;
        chessPiece = board[targetH][targetV];
        return chessPiece;
    }

    public void checkTurn(int positionH, int positionV, int targetH, int targetV, ChessPiece[][] board, ChessPiece chessPiece){

        boolean isThisPossibleMove = possibilityOfTheMove(chessPiece, positionH, positionV, targetH, targetV, board);
        System.out.println(isThisPossibleMove);

    }

    // Не открывает ли шах ходящая фигура (абсолютная связка)
    // Взятие на проходе для пешки
    // Рокировка и поле под ударом для короля
    private boolean possibilityOfTheMove(ChessPiece chessPiece, int positionH, int positionV, int targetH, int targetV,
                                         ChessPiece[][] board) {

        if(chessPiece.getName().equals("Knight")){
            if(Math.abs(positionH - targetH) == 2 && Math.abs(positionV - targetV) == 1) return true;
            if(Math.abs(positionH - targetH) == 1 && Math.abs(positionV - targetV) == 2) return true;
        }

        if(chessPiece.getName().equals("Pawn")){
            if(targetV > positionH) {
                if(targetV - positionH == 2 && positionH == 1 && targetV < 6) return true;
                if(targetV - positionH == 1 && positionH >= 1 && targetV < 6) return true;
            }
            if(positionH > targetV){
                if(positionH - targetV == 2 && positionH == 6 && targetV > 1) return true;
                if(positionH - targetV == 1 && positionH >= 6 && targetV > 1) return true;
            }
        }

        if(chessPiece.getName().equals("Bishop")){
            Line line = scanLine(positionH, positionV, targetH, targetV, board);
            int len = line.getLen();
            if(len > 0){
                ChessPiece[] chessPieces = line.getListObjectOnLine();
                for (int i = 0; i < len; i++) {
                    if(chessPieces[i] != null && i != len-1) return false;
                    if(chessPieces[i] != null && i == len-1 && chessPieces[i].isColor() == chessPiece.isColor()) return false;
                    if(chessPieces[i] != null && i == len-1 && chessPieces[i].isColor() != chessPiece.isColor()) return true;
                }
                return true;
            }
        }

        if(chessPiece.getName().equals("Rook")){
            Line line = scanLine(positionH, positionV, targetH, targetV, board);
            int len = line.getLen();
            if(len > 0){
                ChessPiece[] chessPieces = line.getListObjectOnLine();
                for (int i = 0; i < len; i++) {
                    if(chessPieces[i] != null && i != len-1) return false;
                    if(chessPieces[i] != null && i == len-1 && chessPieces[i].isColor() == chessPiece.isColor()) return false;
                    if(chessPieces[i] != null && i == len-1 && chessPieces[i].isColor() != chessPiece.isColor()) return true;
                }
                return true;
            }
        }

        if(chessPiece.getName().equals("Queen")){
            Line line = scanLine(positionH, positionV, targetH, targetV, board);
            int len = line.getLen();
            if(len > 0){
                ChessPiece[] chessPieces = line.getListObjectOnLine();
                for (int i = 0; i < len; i++) {
                    if(chessPieces[i] != null && i != len-1) return false;
                    if(chessPieces[i] != null && i == len-1 && chessPieces[i].isColor() == chessPiece.isColor()) return false;
                    if(chessPieces[i] != null && i == len-1 && chessPieces[i].isColor() != chessPiece.isColor()) return true;
                }
                return true;
            }
        }

        if(chessPiece.getName().equals("King")){
            ChessPiece chPiece = isCellEmpty(targetH, targetV, board);
            if(chPiece == null && Math.abs(positionH - targetH) == 1 && Math.abs(positionV - targetV) == 1){
                return true;
            }
            if(chPiece != null && Math.abs(positionH - targetH) == 1 && Math.abs(positionV - targetV) == 1) {
                return chPiece.isColor() != chessPiece.isColor();
            }
        }
        return false;
    }
}
