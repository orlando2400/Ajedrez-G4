package com.example.chessgame.vista;

import junit.framework.TestCase;

public class ChessPanelTest extends TestCase {
    private ChessPanel panel;

    protected void setUp() {
        panel = new ChessPanel();
    }

    public void testGetGameLog() {
        assertNotNull(panel.getGameLog());
    }

    public void testGetGameBoard() {
        assertNotNull(panel.getGameBoard());
    }

    public void testGetGameEngine() {
        assertNotNull(panel.getGameEngine());
    }

    public void testGetGraveyard() {
        assertNotNull(panel.getGraveyard(1));
        assertNotNull(panel.getGraveyard(2));
        assertNull(panel.getGraveyard(3));
    }
}




