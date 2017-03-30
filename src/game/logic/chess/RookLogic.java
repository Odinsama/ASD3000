package game.logic.chess;

import gui.domain.concreteObjects.Chess.Pieces.Rook;
import game.logic.MoveLogic;

/**
 * Created by Odin on 3/26/2017.
 */
public class RookLogic extends MoveLogic {
    public RookLogic(Rook rook) {
        super(rook);
    }

    @Override
    public void setValidMoves() {
        setPosition();
        //moves going up the board
        getValidDirectionalMovesSafely(0, -1);
        //down
        getValidDirectionalMovesSafely(0, +1);
        //left
        getValidDirectionalMovesSafely(-1, 0);
        //right
        getValidDirectionalMovesSafely(+1, 0);
        highlightValidMoves();
    }
}
