package gui;

import controller.GameController;
import game.Game;
import usecases.chess.logic.ChessGame;
import simpleBoardGameEngine.coreComponents.Board;

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
