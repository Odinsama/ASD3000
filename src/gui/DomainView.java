package gui;

import controller.GameController;
import gui.domain.abstractObjects.Board;
import logic.Game;
import logic.chessLogic.ChessGame;

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
