package ru.prokhorov.chesstest.userinterface;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ImageComponent extends JComponent {
    private Image image;
    private Image fonBoard;
    private Image fieldWhite;
    private Image fieldBlack;
    private Image loadPiece;

    public ImageComponent()
    {
        // Получаем изображения.
        try
        {
            image = ImageIO.read(new File("src/main/resources/img/Fon.jpg"));
            fonBoard = ImageIO.read(new File("src/main/resources/img/FonBoard.jpg"));
            fieldWhite = ImageIO.read(new File("src/main/resources/img/FieldWhite.png"));
            fieldBlack = ImageIO.read(new File("src/main/resources/img/FieldBlack.png"));
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void paintComponent(Graphics g)
    {
        if(image == null) return;
        int constX = 250;
        int constY = 150;

        // Отображение рисунка в левом верхнем углу.
        g.drawImage(image, 0, 0, null);
        g.drawImage(fonBoard, 200, 100, null);

        painterBoard(constX, constY, g);
    }

    public void painterBoard(int constX, int constY, Graphics g){
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                g.drawImage(fieldWhite, constX, constY, null);
                setLoadPiece(true, "pawn");
                if(j == 3) g.drawImage(loadPiece, constX, constY, null);
                constX = constX + 100;
                g.drawImage(fieldBlack, constX, constY, null);
                setLoadPiece(false, "pawn");
                if(j == 3) g.drawImage(loadPiece, constX, constY, null);
                constX = constX + 100;
            }
            constX = 250;
            constY = constY + 100;

            for (int i = 0; i < 4; i++) {
                g.drawImage(fieldBlack, constX, constY, null);
                constX = constX + 100;
                g.drawImage(fieldWhite, constX, constY, null);
                constX = constX + 100;
            }

            constX = 250;
            constY = constY + 100;
        }
    }

    private void setLoadPiece(boolean color, String piece){
        if(color && piece.equals("pawn")){
            try{
                loadPiece = ImageIO.read(new File("src/main/resources/img/WhitePawn.jpg"));
            }catch (IOException ioe){
                ioe.printStackTrace();
            }
        }
        if(!color && piece.equals("pawn")){
            try{
                loadPiece = ImageIO.read(new File("src/main/resources/img/WhitePawnBlackField.jpg"));
            }catch (IOException ioe){
                ioe.printStackTrace();
            }
        }
    }
}
