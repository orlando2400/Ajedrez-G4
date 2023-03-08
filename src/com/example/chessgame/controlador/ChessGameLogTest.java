package com.example.chessgame.controlador;

import junit.framework.TestCase;

public class ChessGameLogTest extends TestCase{

    private ChessGameLog log;

    @Override
    public void setUp(){
        log = new ChessGameLog();
    }

    public void testAddToLog() {
        log.addToLog("Mensaje Test");
        String lastLog = log.getLastLog();
        assertTrue(lastLog.contains("Mensaje Test"));
    }
    public void testClearLog() {
        log.addToLog("");
        log.clearLog();
        String lastLog = log.getLastLog();
        assertEquals("", lastLog);
    }

    public void testGetLastLog() {
        log.addToLog("Mensaje test 1");
        log.addToLog("Mensaje test 2");
        log.addToLog("Mensaje test 3");
        String lastLog = log.getLastLog();
        assertEquals("Mensaje test 3", lastLog.substring(lastLog.indexOf("-") + 2));
    }
}

