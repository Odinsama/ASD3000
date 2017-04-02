package game.logic.chess;

import gui.domain.concreteObjects.chess.Pieces.Queen;
import game.logic.MoveLogic;

/**
 * Created by Odin on 3/29/2017.
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
        highlightValidMoves();
    }
}
