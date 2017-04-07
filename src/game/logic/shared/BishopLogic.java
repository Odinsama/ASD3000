package game.logic.shared;

import game.logic.shared.moves.MoveLogic;
import gui.domain.abstractObjects.Piece;

/**
 * Created by Odin on 3/29/2017.
 */
//used in both Chess and Shogi!
public class BishopLogic extends MoveLogic {
    public BishopLogic(Piece bishop) {
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
    }
}
