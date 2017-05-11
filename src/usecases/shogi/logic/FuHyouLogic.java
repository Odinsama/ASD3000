package usecases.shogi.logic;

import simpleBoardGameEngine.moves.MoveLogic;
import simpleBoardGameEngine.coreComponents.Piece;

/**
 * Created by Odin on 4/2/2017.
 * Unless it is poorly made, then it must
 * have been someone else.
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
