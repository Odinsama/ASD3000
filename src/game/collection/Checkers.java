package game.collection;

import gui.domain.abstractObjects.Board;
import gui.domain.concreteObjects.checkers.CheckersBoard;
import gui.domain.utils.Promotable;

import java.awt.*;

/**
 * Created by Odin on 4/1/2017.
 */
public class Checkers extends Game {
    @Override
    protected Board generateBoard() {
        return new CheckersBoard(new Dimension(8,8));
    }

    @Override
    public void promote(Promotable piece) {

    }
}
