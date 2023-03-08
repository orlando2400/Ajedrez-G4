package com.example.chessgame.test;
import com.example.chessgame.controlador.ChessGameLog;
import junit.framework.TestCase;

public class ChessGameLogTest extends TestCase{

    private ChessGameLog log;
    private static final String TEST_LOG_MESSAGE = "test log message";


    @Override
    public void setUp(){
        log = new ChessGameLog();
    }

    public void testAddToLog() {
        log.addToLog(TEST_LOG_MESSAGE);
        String lastLog = log.getLastLog();
        assertTrue(lastLog.contains(TEST_LOG_MESSAGE));
    }

    public void testClearLog() {
        log.addToLog(TEST_LOG_MESSAGE);
        log.clearLog();
        String lastLog = log.getLastLog();
        assertEquals("", lastLog);
    }
}