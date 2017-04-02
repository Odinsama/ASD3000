package game.logic.chess;

import game.Game;
import gui.domain.abstractObjects.Board;
import gui.domain.concreteObjects.chess.ChessBoard;

/**
 * Created by Odin on 2/14/2017.
 */
public class ChessGame extends Game {
    @Override
    public Board generateBoard() {
        return new ChessBoard(new Dimension(8,8));
    }
}
