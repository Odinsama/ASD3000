package usecases.shared;

import simpleBoardGameEngine.moves.MoveLogic;
import simpleBoardGameEngine.coreComponents.Piece;

/**
 * Created by Odin on 3/29/2017.
 * Unless it is poorly made, then it must
 * have been someone else.
 */
//used in chess and shogi!
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
