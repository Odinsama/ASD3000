package game.logic;

import game.controller.GameController;
import gui.domain.abstractObjects.Tile;

import java.awt.*;

/**
 * Created by Odin on 4/7/2017.
 */
public class CaptureMove extends Move {
    CaptureMove(Tile target) {
        super(target);
    }

    @Override
    public void execute() {
        GameController.capture(target.getPiece());
    }

    @Override
    protected void highlightTarget() {
        target.highlight(Color.orange);
    }
}
