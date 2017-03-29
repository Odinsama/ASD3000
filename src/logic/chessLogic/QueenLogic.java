package logic.chessLogic;

import gui.domain.concreteObjects.Chess.Pieces.Queen;
import logic.MoveLogic;

/**
 * Created by Odin on 3/29/2017.
 */
public class QueenLogic extends MoveLogic {
    public QueenLogic(Queen queen) {
        super(queen);
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
