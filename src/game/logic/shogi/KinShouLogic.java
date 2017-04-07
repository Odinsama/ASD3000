package game.logic.shogi;

import game.logic.MoveLogic;
import gui.domain.concreteObjects.shogi.pieces.KinShou;

/**
 * Created by Odin on 4/3/2017.
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
