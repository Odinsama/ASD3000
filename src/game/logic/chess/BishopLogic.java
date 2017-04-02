package game.logic.chess;

import gui.domain.concreteObjects.chess.Pieces.Bishop;
import game.logic.MoveLogic;

/**
 * Created by Odin on 3/29/2017.
 */
public class BishopLogic extends MoveLogic {
    public BishopLogic(Bishop bishop) {
        super(bishop);
    }

    @Override
    @SuppressWarnings("Duplicates")
    public void setValidMoves() {
        setPosition();
        setIncrementalDirectionalMovesSafely(LEFT, UP);
        setIncrementalDirectionalMovesSafely(RIGHT, DOWN);
        setIncrementalDirectionalMovesSafely(LEFT, DOWN);
        setIncrementalDirectionalMovesSafely(RIGHT, UP);
        highlightValidMoves();
    }
}
