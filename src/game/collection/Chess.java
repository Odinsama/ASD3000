package game.collection;

import gui.domain.abstractObjects.Board;
import gui.domain.concreteObjects.chess.ChessBoard;
import gui.domain.utils.IPromotable;


import java.awt.*;

/**
 * Created by Odin on 2/14/2017.
 */
public class Chess extends Game {
    @Override
    public Board generateBoard() {
        return new ChessBoard(new Dimension(8,8));
    }

    @Override
    public void promote(IPromotable piece) {

    }
}
