package game.logic.shogi;

import game.logic.MoveLogic;
import gui.domain.concreteObjects.shogi.pieces.GinShou;

/**
 * Created by Odin on 4/3/2017.
 */
public class GinShouLogic extends MoveLogic {
    public GinShouLogic(GinShou ginShou) {
        super(ginShou);
    }

    @Override
    public void setValidMoves() {
        setPosition();
        sortMoveOrCaptureSafely(NONE, DIR);
        sortMoveOrCaptureSafely(LEFT, DIR);
        sortMoveOrCaptureSafely(RIGHT, DIR);
        sortMoveOrCaptureSafely(LEFT, -DIR);
        sortMoveOrCaptureSafely(RIGHT, -DIR);
        highlightValidMoves();
    }
}
