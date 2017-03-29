package logic.chessLogic;

import gui.domain.concreteObjects.Chess.Pieces.Rook;
import logic.MoveLogic;

/**
 * Created by Odin on 3/26/2017.
 */
public class RookLogic extends MoveLogic {
    public RookLogic(Rook rook) {
        super(rook);
    }

    @Override
    public void getValidMoves() {
        setPosition();
        //moves going up the board
        getValidMovesSafely(0, -1);
        //down
        getValidMovesSafely(0, +1);
        //left
        getValidMovesSafely(-1, 0);
        //right
        getValidMovesSafely(+1, 0);
        highlightValidMoves();
    }
}
