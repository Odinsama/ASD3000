package game.logic.shared;

import game.logic.shared.moves.MoveLogic;
import gui.domain.abstractObjects.Piece;

/**
 * Created by Odin on 3/29/2017.
 */
//used in both Chess and Shogi!
public class KingLogic extends MoveLogic {
    public KingLogic(Piece king) {
        super(king);
    }

    @Override
    public void setValidMoves() {
        setPosition();
        sortMoveOrCaptureSafely(RIGHT,DOWN);
        sortMoveOrCaptureSafely(RIGHT,UP);
        sortMoveOrCaptureSafely(LEFT,DOWN);
        sortMoveOrCaptureSafely(LEFT,UP);
        sortMoveOrCaptureSafely(RIGHT,NONE);
        sortMoveOrCaptureSafely(NONE,DOWN);
        sortMoveOrCaptureSafely(LEFT,NONE);
        sortMoveOrCaptureSafely(NONE,UP);
    }
}
