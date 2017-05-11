package usecases.shogi.logic;

import simpleBoardGameEngine.moves.MoveLogic;
import usecases.shogi.pieces.KeiMa;

/**
 * Created by Odin on 4/3/2017.
 * Unless it is poorly made, then it must
 * have been someone else.
 */
public class KeiMaLogic extends MoveLogic {
    public KeiMaLogic(KeiMa keiMa) {
        super(keiMa);
    }

    @Override
    public void setValidMoves() {
        setPosition();
        sortMoveOrCaptureSafely(LEFT, DIR*2);
        sortMoveOrCaptureSafely(RIGHT, DIR*2);
    }
}
