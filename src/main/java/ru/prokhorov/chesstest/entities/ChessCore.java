package ru.prokhorov.chesstest.entities;

import ru.prokhorov.chesstest.interfaces.ChessPiece;

public class ChessCore {
    private final int HORIZONTAL = 8;
    private final int VERTICAL = 8;

    private final PixelRange[] pixelRangesX;
    private final PixelRange[] pixelRangesY;

    public ChessCore() {
        pixelRangesX = new PixelRange[8];
        pixelRangesY = new PixelRange[8];
        int constX = 250;
        int constX2 = 350;
        int constY = 200;
        int constY2 = 300;
        for (int i = 0; i < 8; i++) {
            PixelRange pixelRange_x = new PixelRange(constX, constX2);
            PixelRange pixelRange_y = new PixelRange(constY, constY2);
            pixelRangesY[i] = pixelRange_y;
            pixelRangesX[i] = pixelRange_x;
            constX = constX + 100;
            constX2 = constX2 + 100;
            constY = constY + 100;
            constY2 = constY2 + 100;
        }
    }

    public boolean isCellValid(int hor, int ver){
        return hor >= 0 && ver >= 0 && hor < HORIZONTAL && ver < VERTICAL;
    }

    public ChessPiece isPiece(int targetFieldH, int targetFieldV, ChessPiece[][] board){
        ChessPiece chessPiece = board[targetFieldH][targetFieldV];
        return chessPiece;
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
            }

            if(positionH == targetH && positionV > targetV){
                for (int i = positionV-1; i >= targetV ; i--) {
                    if(!isCellValid(positionH, i)) break;
                    line.setObjectToLine(board[positionH][i], len);
                    len++;
                }
            }

            if(positionH > targetH && positionV == targetV){
                for (int i = positionH-1; i >= targetH ; i--) {
                    if(!isCellValid(i, positionV)) break;
                    line.setObjectToLine(board[i][positionV], len);
                    len++;
                }
            }

            if(positionH < targetH && positionV == targetV){
                for (int i = positionH+1; i <= targetH ; i++) {
                    if(!isCellValid(i, positionV)) break;
                    line.setObjectToLine(board[i][positionV], len);
                    len++;
                }
            }

            if(positionH < targetH && positionV < targetV){
                for (int i = positionH+1; i <= targetH ; i++) {
                    for (int j = positionV+1; j <= targetV; j++) {
                        if(!isCellValid(i, j)) break;
                        line.setObjectToLine(board[i][j], len);
                        len++;
                    }
                }
            }

            if(positionH < targetH && positionV > targetV){
                for (int i = positionH+1; i <= targetH ; i++) {
                    for (int j = positionV-1; j >= targetV; j--) {
                        if(!isCellValid(i, j)) break;
                        line.setObjectToLine(board[i][j], len);
                        len++;
                    }
                }
            }

            if(positionH > targetH && positionV > targetV){
                for (int i = positionH-1; i >= targetH ; i--) {
                    for (int j = positionV-1; j >= targetV; j--) {
                        if(!isCellValid(i, j)) break;
                        line.setObjectToLine(board[i][j], len);
                        len++;
                    }
                }
            }
        }
        return line;
    }


    public Field getField(int mousePositionX, int mousePositionY) {
        Field field = new Field();

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if(mousePositionX >= pixelRangesX[i].getRangeX() && mousePositionX <= pixelRangesX[i].getRangeX2() &&
                mousePositionY >= pixelRangesY[j].getRangeX() && mousePositionY <= pixelRangesY[j].getRangeX2()){
                    field.setX(i);
                    field.setY(j);
                }
            }
        }
        return field;
    }
}
