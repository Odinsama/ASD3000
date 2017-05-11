package simpleBoardGameEngine.moves;

import simpleBoardGameEngine.controller.GameController;
import simpleBoardGameEngine.coreComponents.Tile;

import java.awt.*;

/**
 * Created by Odin on 4/7/2017.
 * Unless it is poorly made, then it must
 * have been someone else.
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
