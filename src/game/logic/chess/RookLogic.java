package game.logic.chess;

import gui.domain.concreteObjects.Chess.Pieces.Rook;
import game.logic.MoveLogic;

/**
 * Created by Odin on 3/26/2NONE17.
 */
public class RookLogic extends MoveLogic {
    public RookLogic(Rook rook) {
        super(rook);
    }

    @Override
    @SuppressWarnings("Duplicates")
    public void setValidMoves() {
        setPosition();
        setIncrementalDirectionalMovesSafely(NONE, UP);
        setIncrementalDirectionalMovesSafely(NONE, DOWN);
        setIncrementalDirectionalMovesSafely(LEFT, NONE);
        setIncrementalDirectionalMovesSafely(RIGHT, NONE);
        highlightValidMoves();
    }
}
