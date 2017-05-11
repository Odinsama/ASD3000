package usecases.chess.logic;

import game.Game;
import simpleBoardGameEngine.coreComponents.Board;
import usecases.chess.ChessBoard;

/**
 * Created by Odin on 2/14/2017.
 */
public class ChessGame extends Game {
    @Override
    public Board generateBoard() {
        return new ChessBoard(new Dimension(8,8));
    }
}
