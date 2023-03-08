package com.example.chessgame.modelo.pieces;
import com.example.chessgame.modelo.board.ChessGameBoard;
import com.example.chessgame.modelo.game.ChessGamePiece;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PawnTest {
    @Test
    public void testCalculatePossibleMoves() {
        ChessGameBoard board = new ChessGameBoard();
        Pawn whitePawn = new Pawn(board, 6, 3, ChessGamePiece.WHITE);
        ArrayList<String> expectedMoves = new ArrayList<>();
        expectedMoves.add("5,3");
        expectedMoves.add("4,3");
        assertEquals(expectedMoves, whitePawn.calculatePossibleMoves(board));

        Pawn blackPawn = new Pawn(board, 1, 3, ChessGamePiece.BLACK);
        expectedMoves.clear();
        expectedMoves.add("2,3");
        expectedMoves.add("3,3");
        assertEquals(expectedMoves, blackPawn.calculatePossibleMoves(board));
    }
}