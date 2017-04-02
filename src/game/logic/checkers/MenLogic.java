package game.logic.checkers;

import gui.domain.abstractObjects.Piece;
import game.logic.MoveLogic;

/**
 * Created by Odin on 4/1/2017.
 */
public class MenLogic extends MoveLogic {
    public MenLogic(Piece piece) {
        super(piece);
    }

    @Override
    public void setValidMoves() {
        setPosition();
        addMoveSafely(LEFT, UP);
        addMoveSafely(RIGHT, DOWN);
        addMoveSafely(LEFT, DOWN);
        addMoveSafely(RIGHT, UP);
        addSkipCaptureSafely(LEFT, UP);
        addSkipCaptureSafely(RIGHT, DOWN);
        addSkipCaptureSafely(LEFT, DOWN);
        addSkipCaptureSafely(RIGHT, UP);
        highlightValidMoves();
    }
}
