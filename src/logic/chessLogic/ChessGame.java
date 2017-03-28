package logic.chessLogic;

import gui.domain.abstractObjects.Board;
import gui.domain.concreteObjects.Chess.ChessBoard;
import logic.Game;


import java.awt.*;

/**
 * Created by Odin on 2/14/2017.
 */
public class ChessGame extends Game {
    @Override
    public Board generateBoard() {
        return new ChessBoard(new Dimension(8,8));
    }
}
