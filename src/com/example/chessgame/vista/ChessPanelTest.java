package com.example.chessgame.vista;

import com.example.chessgame.controlador.ChessGameLog;
import com.example.chessgame.modelo.board.ChessGameBoard;
import com.example.chessgame.modelo.game.ChessGameEngine;
import com.example.chessgame.modelo.game.ChessGraveyard;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ChessPanelTest extends TestCase {

    private ChessPanel panel;
    @Test
    protected void setUp(){
        panel = new ChessPanel();
    }

    public void testGetGameLog(){

        assertNotNull(panel.getGameLog());
    }


    public void testGetGameBoard(){

        assertNotNull(panel.getGameBoard());
    }


    public void testGetGameEngine(){

        assertNotNull(panel.getGameEngine());
    }


    public void testGetGraveyard(){
        assertNotNull(panel.getGraveyard(1));
        assertNotNull(panel.getGraveyard(2));
        assertNull(panel.getGraveyard(3));
    }
}