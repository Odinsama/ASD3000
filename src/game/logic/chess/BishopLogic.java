package game.logic.chess;

import gui.domain.concreteObjects.Chess.Pieces.Bishop;
import game.logic.MoveLogic;

/**
 * Created by Odin on 3/29/2017.
 */
public class BishopLogic extends MoveLogic {
    public BishopLogic(Bishop bishop) {
        super(bishop);
    }

    @Override
    public void setValidMoves() {
        setPosition();
        getValidDirectionalMovesSafely(LEFT, UP);
        getValidDirectionalMovesSafely(RIGHT, DOWN);
        getValidDirectionalMovesSafely(LEFT, DOWN);
        getValidDirectionalMovesSafely(RIGHT, UP);
        highlightValidMoves();
    }
}
