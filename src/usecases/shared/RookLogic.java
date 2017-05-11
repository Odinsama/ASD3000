package usecases.shared;

import simpleBoardGameEngine.coreComponents.Piece;
import simpleBoardGameEngine.moves.MoveLogic;

/**
 * Created by Odin on 3/26/2NONE17.
 * Unless it is poorly made, then it must
 * have been someone else.
 */
//used in both Chess and Shogi!
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
    }
}
