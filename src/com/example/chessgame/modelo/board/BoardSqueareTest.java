package com.example.chessgame.modelo.board;


import com.example.chessgame.modelo.game.ChessGamePiece;
import junit.framework.TestCase;

public class BoardSqueareTest extends TestCase {
    private BoardSquare boardSquare;
    private ChessGamePiece piece;

    @Override
    public void setUp() {
        boardSquare = new BoardSquare(0, 0, piece);
    }
    public void testGetRow() {
        assertEquals(0, boardSquare.getRow());
    }
    public void testGetColumn() {
        assertEquals(0, boardSquare.getColumn());
    }
    public void testGetPieceOnSquare() {
        assertNull(boardSquare.getPieceOnSquare());
        boardSquare.setPieceOnSquare(piece);
        assertEquals(piece, boardSquare.getPieceOnSquare());
    }
    public void testSetPieceOnSquare() {
        boardSquare.setPieceOnSquare(piece);
        assertEquals(piece, boardSquare.getPieceOnSquare());
    }
    public void testClearSquare() {
        boardSquare.setPieceOnSquare(piece);
        boardSquare.clearSquare();
        assertNull(boardSquare.getPieceOnSquare());
    }
}

