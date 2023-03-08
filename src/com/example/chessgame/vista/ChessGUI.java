package com.example.chessgame.vista;

import javax.swing.*;

public class ChessGUI extends AbstractChessGUI {

    @Override
    protected JFrame createFrame() {
        JFrame frame = new JFrame("YetAnotherChessGame 1.0");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        return frame;
    }

    @Override
    protected JPanel createChessPanel() {
        return ChessPanel.getInstance();
    }
}
