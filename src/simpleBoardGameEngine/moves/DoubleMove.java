package simpleBoardGameEngine.moves;

import simpleBoardGameEngine.controller.GameController;
import simpleBoardGameEngine.coreComponents.Piece;
import simpleBoardGameEngine.coreComponents.Tile;

import java.awt.*;

/**
 * Created by Odin on 4/7/2017.
 * Unless it is poorly made, then it must
 * have been someone else.
 */
public class DoubleMove extends Move {
    private final Tile secondTarget;
    private final Piece secondPiece;

    public DoubleMove(Tile target, Tile secondTarget, Piece secondPiece) {
        super(target);
        this.secondTarget = secondTarget;
        this.secondPiece = secondPiece;
    }

    @Override
    public void execute() {
        GameController.doubleMove(target, secondPiece, secondTarget);
    }

    @Override
    protected void highlightTarget() {
        target.highlight(Color.blue);
    }
}
