package game.logic.shared.moves;

import gui.domain.abstractObjects.Tile;

import java.awt.*;

/**
 * Created by Odin on 4/7/2017.
 */
public class DoubleMove extends Move {
    DoubleMove(Tile target) {
        super(target);
    }

    @Override
    public void execute() {

    }

    @Override
    protected void highlightTarget() {
        target.highlight(Color.blue);
    }
}
