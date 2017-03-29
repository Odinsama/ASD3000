package logic.chessLogic;

import gui.domain.concreteObjects.Chess.Pieces.Bishop;
import logic.MoveLogic;

/**
 * Created by Odin on 3/29/2017.
 */
public class BishopLogic extends MoveLogic {
    public BishopLogic(Bishop bishop) {
        super(bishop);
    }

    @Override
    public void getValidMoves() {
        setPosition();
        //moves going up and left the board
        getValidMovesSafely(-1, -1);
        //down and right
        getValidMovesSafely(+1, +1);
        //down and left
        getValidMovesSafely(-1, +1);
        //up and right
        getValidMovesSafely(+1, -1);
        highlightValidMoves();
    }
}
