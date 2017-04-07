package game.logic.shogi;

import game.logic.MoveLogic;
import gui.domain.abstractObjects.Piece;

/**
 * Created by Odin on 4/2/2017.
 */
public class FuHyouLogic extends MoveLogic {
    public FuHyouLogic(Piece piece) {
        super(piece);
    }

    @Override
    public void setValidMoves() {
        setPosition();
        sortMoveOrCaptureSafely(NONE,DIR);
    }
}
