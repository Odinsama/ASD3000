package logic.chessLogic;

import gui.domain.concreteObjects.Chess.Pieces.King;
import logic.MoveLogic;

/**
 * Created by Odin on 3/29/2017.
 */
public class KingLogic extends MoveLogic {
    public KingLogic(King king) {
        super(king);
    }

    @Override
    public void getValidMoves() {
        setPosition();
        sortMoveOrCaptureSafely(RIGHT,DOWN);
        sortMoveOrCaptureSafely(RIGHT,UP);
        sortMoveOrCaptureSafely(LEFT,DOWN);
        sortMoveOrCaptureSafely(LEFT,UP);
        sortMoveOrCaptureSafely(RIGHT,NONE);
        sortMoveOrCaptureSafely(NONE,DOWN);
        sortMoveOrCaptureSafely(LEFT,NONE);
        sortMoveOrCaptureSafely(NONE,UP);
        highlightValidMoves();
    }
}
