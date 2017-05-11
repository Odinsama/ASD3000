package usecases.chess.logic;

import usecases.chess.Pieces.Queen;
import simpleBoardGameEngine.moves.MoveLogic;

/**
 * Created by Odin on 3/29/2017.
 * Unless it is poorly made, then it must
 * have been someone else.
 */
public class QueenLogic extends MoveLogic {
    public QueenLogic(Queen queen) {
        super(queen);
    }

    @Override
    public void setValidMoves() {
        setPosition();
        setIncrementalDirectionalMovesSafely(NONE, UP);
        setIncrementalDirectionalMovesSafely(NONE, DOWN);
        setIncrementalDirectionalMovesSafely(LEFT, NONE);
        setIncrementalDirectionalMovesSafely(RIGHT, NONE);
        setIncrementalDirectionalMovesSafely(LEFT, UP);
        setIncrementalDirectionalMovesSafely(RIGHT, DOWN);
        setIncrementalDirectionalMovesSafely(LEFT, DOWN);
        setIncrementalDirectionalMovesSafely(RIGHT, UP);
    }
}
