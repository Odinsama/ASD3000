package gui;

import game.GameController;
import gui.domain.abstractObjects.Board;
import game.Game;
import game.logic.chess.ChessGame;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Odin on 2/14/2017.
 */
class DomainView extends JPanel {
    private final Game game;

    DomainView() {
        game = new ChessGame();
        GameController.initGame(game);
        Board chessBoard = game.startGame();
        chessBoard.generatePieces();
        setBorder(BorderFactory.createTitledBorder("Domain"));
        setLayout(new BorderLayout());
        add(chessBoard);
    }
}
