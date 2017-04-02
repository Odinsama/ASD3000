package game.logic.shogi;

import game.logic.MoveLogic;
import gui.domain.concreteObjects.shogi.pieces.KeiMa;

/**
 * Created by Odin on 4/3/2017.
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
        highlightValidMoves();
    }
}
