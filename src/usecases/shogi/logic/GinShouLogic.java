package usecases.shogi.logic;

import simpleBoardGameEngine.moves.MoveLogic;
import usecases.shogi.pieces.GinShou;

/**
 * Created by Odin on 4/3/2017.
 * Unless it is poorly made, then it must
 * have been someone else.
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
    }
}
