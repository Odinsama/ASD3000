package usecases.shogi.logic;

import simpleBoardGameEngine.moves.MoveLogic;
import usecases.shogi.pieces.KinShou;

/**
 * Created by Odin on 4/3/2017.
 * Unless it is poorly made, then it must
 * have been someone else.
 */
public class KinShouLogic extends MoveLogic {
    public KinShouLogic(KinShou kinShou) {
        super(kinShou);
    }

    @Override
    public void setValidMoves() {
        setPosition();
        sortMoveOrCaptureSafely(NONE, DIR);
        sortMoveOrCaptureSafely(LEFT, DIR);
        sortMoveOrCaptureSafely(RIGHT, DIR);
        sortMoveOrCaptureSafely(LEFT, NONE);
        sortMoveOrCaptureSafely(RIGHT, NONE);
        sortMoveOrCaptureSafely(NONE, -DIR);
    }
}
