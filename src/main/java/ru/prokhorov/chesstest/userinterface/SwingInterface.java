package ru.prokhorov.chesstest.userinterface;

import javax.swing.*;

public class SwingInterface {

    public SwingInterface() {
        JFrame mainFrame = new JFrame("Test chess");
        mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setResizable(false);
        mainFrame.setVisible(true);
    }

}
