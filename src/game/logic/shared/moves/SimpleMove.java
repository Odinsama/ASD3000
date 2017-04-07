package game.logic.shared.moves;

import game.controller.GameController;
import gui.domain.abstractObjects.Tile;

import java.awt.*;

/**
 * Created by Odin on 4/7/2017.
 */
public class SimpleMove extends Move {
    SimpleMove(Tile target) {
        super(target);
    }

    @Override
    public void execute() {
        GameController.movePiece(target);
    }

    @Override
    protected void highlightTarget() {
        target.highlight(Color.cyan);
    }
}
