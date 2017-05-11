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

public class SkipCaptureMove extends Move {
    private final Piece enemyPiece;

    public SkipCaptureMove(Tile target, Piece enemyPiece) {
        super(target);
        this.enemyPiece = enemyPiece;
    }

    @Override
    public void execute() {
        GameController.skipCapture(target, enemyPiece);
    }

    @Override
    protected void highlightTarget() {
        target.highlight(Color.orange);
    }

    public Piece getEnemyPiece() {
        return enemyPiece;
    }
}
