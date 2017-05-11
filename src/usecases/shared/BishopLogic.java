package usecases.shared;

import simpleBoardGameEngine.moves.MoveLogic;
import simpleBoardGameEngine.coreComponents.Piece;

/**
 * Created by Odin on 3/29/2017.
 * Unless it is poorly made, then it must
 * have been someone else.
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
