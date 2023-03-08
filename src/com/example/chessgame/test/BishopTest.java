package com.example.chessgame.test;

import com.example.chessgame.modelo.board.ChessGameBoard;
import com.example.chessgame.modelo.game.ChessGamePiece;
import com.example.chessgame.modelo.pieces.Bishop;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

public class BishopTest {

    @Test
    void calculatePossibleMoves() {
        ChessGameBoard board = new ChessGameBoard();
        Bishop bishop = new Bishop(board, 3, 3, ChessGamePiece.WHITE);

        ArrayList<String> expectedMoves = new ArrayList<>();
        expectedMoves.add("2,2");
        expectedMoves.add("1,1");
        expectedMoves.add("4,2");
        expectedMoves.add("5,1");
        expectedMoves.add("4,4");
        expectedMoves.add("5,5");
        expectedMoves.add("2,4");
        expectedMoves.add("1,5");


        ArrayList<String> actualMoves = bishop.calculatePossibleMoves(board);

        // ordenar las listas antes de compararlas
        Collections.sort(expectedMoves);
        Collections.sort(actualMoves);

        assertEquals(expectedMoves, actualMoves);
    }

    @Test
    void createImageByPieceType() {
        ChessGameBoard board = new ChessGameBoard();
        Bishop whiteBishop = new Bishop(board, 0, 0, ChessGamePiece.WHITE);
        Bishop blackBishop = new Bishop(board, 0, 0, ChessGamePiece.BLACK);

        assertNotNull(whiteBishop.createImageByPieceType());
        assertNotNull(blackBishop.createImageByPieceType());
    }
}
