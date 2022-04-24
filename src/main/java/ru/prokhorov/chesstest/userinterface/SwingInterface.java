package ru.prokhorov.chesstest.userinterface;

import ru.prokhorov.chesstest.entities.ChessCore;
import ru.prokhorov.chesstest.entities.ChessPlayer;
import ru.prokhorov.chesstest.entities.Field;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingInterface implements ActionListener {

    private int mousePositionX;
    private int getMousePositionY;

    public SwingInterface(){
        ChessPlayer chessPlayer = new ChessPlayer();
        ChessCore chessCore = new ChessCore();
        JFrame mainFrame = new JFrame("Test chess");
        mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setResizable(false);

        JMenuBar jmb = new JMenuBar();
        JMenu jmGame = new JMenu("Game");
        JMenuItem jmiNewGame = new JMenuItem("New game", KeyEvent.VK_N);
        jmiNewGame.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
        jmiNewGame.setToolTipText("Новая игра с предварительными настройками");
        jmiNewGame.addActionListener(this);
        jmGame.add(jmiNewGame);
        jmb.add(jmGame);
        mainFrame.setJMenuBar(jmb);
        ImageComponent imageComponent = new ImageComponent();
        mainFrame.add(imageComponent);
        mainFrame.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                mousePositionX = e.getX();
                getMousePositionY = e.getY();
                Field field = chessCore.getField(mousePositionX, getMousePositionY);
                mainFrame.setTitle("x - " + field.getX() + " y - " + field.getY());

            }

            @Override
            public void mouseReleased(MouseEvent e) {
                mousePositionX = e.getX();
                getMousePositionY = e.getY();
            }
        });
        mainFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String command = ae.getActionCommand();
        if(command.equals("New game")) System.exit(0);
    }
}
