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


    public Field getField(int mousePositionX, int mousePositionY) {
        Field field = new Field();

        if(mousePositionX >= 250 && mousePositionX <= 350 && mousePositionY >= 200 && mousePositionY <= 300){
            field.setX(0);
            field.setY(0);
        }
        if(mousePositionX >= 350 && mousePositionX <= 450 && mousePositionY >= 200 && mousePositionY <= 300){
            field.setX(1);
            field.setY(0);
        }
        if(mousePositionX >= 450 && mousePositionX <= 550 && mousePositionY >= 200 && mousePositionY <= 300){
            field.setX(2);
            field.setY(0);
        }
        if(mousePositionX >= 550 && mousePositionX <= 650 && mousePositionY >= 200 && mousePositionY <= 300){
            field.setX(3);
            field.setY(0);
        }
        if(mousePositionX >= 650 && mousePositionX <= 750 && mousePositionY >= 200 && mousePositionY <= 300){
            field.setX(4);
            field.setY(0);
        }
        if(mousePositionX >= 750 && mousePositionX <= 850 && mousePositionY >= 200 && mousePositionY <= 300){
            field.setX(5);
            field.setY(0);
        }
        if(mousePositionX >= 850 && mousePositionX <= 950 && mousePositionY >= 200 && mousePositionY <= 300){
            field.setX(6);
            field.setY(0);
        }
        if(mousePositionX >= 950 && mousePositionX <= 1050 && mousePositionY >= 200 && mousePositionY <= 300){
            field.setX(7);
            field.setY(0);
        }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if(mousePositionX >= 250 && mousePositionX <= 350 && mousePositionY >= 300 && mousePositionY <= 400){
            field.setX(0);
            field.setY(1);
        }
        if(mousePositionX >= 350 && mousePositionX <= 450 && mousePositionY >= 300 && mousePositionY <= 400){
            field.setX(1);
            field.setY(1);
        }
        if(mousePositionX >= 450 && mousePositionX <= 550 && mousePositionY >= 300 && mousePositionY <= 400){
            field.setX(2);
            field.setY(1);
        }
        if(mousePositionX >= 550 && mousePositionX <= 650 && mousePositionY >= 300 && mousePositionY <= 400){
            field.setX(3);
            field.setY(1);
        }
        if(mousePositionX >= 650 && mousePositionX <= 750 && mousePositionY >= 300 && mousePositionY <= 400){
            field.setX(4);
            field.setY(1);
        }
        if(mousePositionX >= 750 && mousePositionX <= 850 && mousePositionY >= 300 && mousePositionY <= 400){
            field.setX(5);
            field.setY(1);
        }
        if(mousePositionX >= 850 && mousePositionX <= 950 && mousePositionY >= 300 && mousePositionY <= 400){
            field.setX(6);
            field.setY(1);
        }
        if(mousePositionX >= 950 && mousePositionX <= 1050 && mousePositionY >= 300 && mousePositionY <= 400){
            field.setX(7);
            field.setY(1);
        }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if(mousePositionX >= 250 && mousePositionX <= 350 && mousePositionY >= 400 && mousePositionY <= 500){
            field.setX(0);
            field.setY(2);
        }
        if(mousePositionX >= 350 && mousePositionX <= 450 && mousePositionY >= 400 && mousePositionY <= 500){
            field.setX(1);
            field.setY(2);
        }
        if(mousePositionX >= 450 && mousePositionX <= 550 && mousePositionY >= 400 && mousePositionY <= 500){
            field.setX(2);
            field.setY(2);
        }
        if(mousePositionX >= 550 && mousePositionX <= 650 && mousePositionY >= 400 && mousePositionY <= 500){
            field.setX(3);
            field.setY(2);
        }
        if(mousePositionX >= 650 && mousePositionX <= 750 && mousePositionY >= 400 && mousePositionY <= 500){
            field.setX(4);
            field.setY(2);
        }
        if(mousePositionX >= 750 && mousePositionX <= 850 && mousePositionY >= 400 && mousePositionY <= 500){
            field.setX(5);
            field.setY(2);
        }
        if(mousePositionX >= 850 && mousePositionX <= 950 && mousePositionY >= 400 && mousePositionY <= 500){
            field.setX(6);
            field.setY(2);
        }
        if(mousePositionX >= 950 && mousePositionX <= 1050 && mousePositionY >= 400 && mousePositionY <= 500){
            field.setX(7);
            field.setY(2);
        }
        return field;
    }
}
