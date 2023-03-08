package com.example.chessgame.controlador;

import junit.framework.TestCase;

import static org.junit.jupiter.api.Assertions.*;

public class ChessGameLogTest  extends TestCase {

    private ChessGameLog log;
    @Override
    protected void setUp() {
        log = new ChessGameLog();
    }

    public void testAddLog(){
        log.addToLog("PRUEBA TEST");
        String lastLog = log.getLastLog();
        assertTrue(lastLog.contains("PRUEBA TEST"));
    }
    public void testClearLog(){
        log.addToLog("");
        log.clearLog();
        String lastLog = log.getLastLog();
        assertEquals("",lastLog);
    }

    public void testGetLastLog(){
        log.addToLog("PRUEBA Nº1");
        log.addToLog("PRUEBA Nº2");
        log.addToLog("PRUEBA Nº3");
        String lastLog = log.getLastLog();
        assertEquals("PRUEBA Nº3",lastLog.substring(lastLog.indexOf("-")+2));
    }
}