package simpleBoardGameEngine.moves;

import simpleBoardGameEngine.coreComponents.Piece;
import simpleBoardGameEngine.controller.GameController;
import simpleBoardGameEngine.coreComponents.Tile;

import java.awt.*;

/**
 * Created by Odin on 4/7/2017.
 * Unless it is poorly made, then it must
 * have been someone else.
 */
public class CaptureMove extends Move{
    private Piece enemyPiece;

    CaptureMove(Tile target) {
        super(target);
        enemyPiece = target.getPiece();
    }

    @Override
    public void execute() {
        GameController.capture(enemyPiece);
    }

    @Override
    protected void highlightTarget() {
        target.highlight(Color.orange);
    }

}
