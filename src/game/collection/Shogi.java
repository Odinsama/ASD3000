package game.collection;

import gui.domain.abstractObjects.Board;
import gui.domain.concreteObjects.shogi.ShogiBoard;
import gui.domain.utils.Promotable;

import java.awt.*;

/**
 * Created by Odin on 4/2/2017.
 */
public class Shogi extends Game {
    @Override
    protected Board generateBoard() {
        Color wooden = new Color(202,195,142);
        return new ShogiBoard(new Dimension(9,9), wooden, wooden);
    }

    @Override
    public void promote(Promotable piece) {
    }
}
