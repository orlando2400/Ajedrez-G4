package com.example.chessgame.vista;
import com.example.chessgame.controlador.ChessGameLog;
import com.example.chessgame.modelo.board.ChessGameBoard;
import com.example.chessgame.modelo.game.ChessGameEngine;
import com.example.chessgame.modelo.game.ChessGraveyard;

import java.awt.*;
import javax.swing.*;

public class ChessPanel extends JPanel{
    private static ChessPanel instance = null;
    private ChessMenuBar menuBar;
    private ChessGameBoard gameBoard;
    private ChessGameLog gameLog;
    private ChessGraveyard playerOneGraveyard;
    private ChessGraveyard playerTwoGraveyard;
    private ChessGameEngine gameEngine;

    private ChessPanel() {
        this.setLayout(new BorderLayout());
        menuBar = new ChessMenuBar();
        gameBoard = new ChessGameBoard();
        gameLog = new ChessGameLog();
        playerOneGraveyard = new ChessGraveyard("Player 1's graveyard");
        playerTwoGraveyard = new ChessGraveyard("Player 2's graveyard");
        this.add(menuBar, BorderLayout.NORTH);
        this.add(gameBoard, BorderLayout.CENTER);
        this.add(gameLog, BorderLayout.SOUTH);
        this.add(playerOneGraveyard, BorderLayout.WEST);
        this.add(playerTwoGraveyard, BorderLayout.EAST);
        this.setPreferredSize(new Dimension(800, 600));
        gameEngine = new ChessGameEngine(gameBoard); // start the game
    }
//Prueba de comentario
    public static ChessPanel getInstance() {
        if (instance == null) {
            instance = new ChessPanel();
        }
        return instance;
    }

    public ChessGameLog getGameLog() {
        return gameLog;
    }

    public ChessGameBoard getGameBoard() {
        return gameBoard;
    }

    public ChessGameEngine getGameEngine() {
        return gameEngine;
    }

    public ChessGraveyard getGraveyard(int whichPlayer) {
        if (whichPlayer == 1) {
            return playerOneGraveyard;
        } else if (whichPlayer == 2) {
            return playerTwoGraveyard;
        } else {
            return null;
        }
    }
}