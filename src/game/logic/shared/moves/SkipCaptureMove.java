package game.logic.shared.moves;

import game.controller.GameController;
import gui.domain.abstractObjects.Piece;
import gui.domain.abstractObjects.Tile;

import java.awt.*;

/**
 * Created by Odin on 4/7/2017.
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
}
