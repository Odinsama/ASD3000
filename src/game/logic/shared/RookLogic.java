package game.logic.shared;

import gui.domain.abstractObjects.Piece;
import gui.domain.concreteObjects.chess.Pieces.Rook;
import game.logic.MoveLogic;

/**
 * Created by Odin on 3/26/2NONE17.
 */
public class RookLogic extends MoveLogic {
    public RookLogic(Piece rook) {
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
