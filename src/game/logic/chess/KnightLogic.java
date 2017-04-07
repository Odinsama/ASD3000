package game.logic.chess;

import gui.domain.concreteObjects.chess.Pieces.Knight;
import game.logic.shared.moves.MoveLogic;

/**
 * Created by Odin on 3/11/2017.
 */
public class KnightLogic extends MoveLogic {
    public KnightLogic(Knight knight) {
        super(knight);
    }

    @Override
    public void setValidMoves() {
        setPosition();
        sortMoveOrCaptureSafely(LEFT, DOWN*2);
        sortMoveOrCaptureSafely(RIGHT, DOWN*2);
        sortMoveOrCaptureSafely(LEFT, UP*2);
        sortMoveOrCaptureSafely(RIGHT, UP*2);
        sortMoveOrCaptureSafely(LEFT*2, DOWN);
        sortMoveOrCaptureSafely(RIGHT*2, DOWN);
        sortMoveOrCaptureSafely(LEFT*2, UP);
        sortMoveOrCaptureSafely(RIGHT*2, UP);
    }

}
