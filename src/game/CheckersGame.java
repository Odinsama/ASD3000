package game;

import gui.domain.abstractObjects.Board;
import gui.domain.concreteObjects.checkers.CheckersBoard;

import java.awt.*;

/**
 * Created by Odin on 4/1/2017.
 */
public class CheckersGame extends Game{
    @Override
    protected Board generateBoard() {
        return new CheckersBoard(new Dimension(8,8));
    }
}
