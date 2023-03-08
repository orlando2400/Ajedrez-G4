package com.example.chessgame.vista;

import javax.swing.*;

public abstract class AbstractChessGUI {

    public void createGUI() {
        JFrame frame = createFrame();
        frame.getContentPane().add(createChessPanel());
        frame.pack();
        frame.setVisible(true);
    }

    protected abstract JFrame createFrame();

    protected abstract JPanel createChessPanel();
}
