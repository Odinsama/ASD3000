package game.logic.chess;

import gui.domain.concreteObjects.Chess.Pieces.Queen;
import game.logic.MoveLogic;

/**
 * Created by Odin on 3/29/2017.
 */
public class QueenLogic extends MoveLogic {
    public QueenLogic(Queen queen) {
        super(queen);
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
        //moves going up and left the board
        getValidDirectionalMovesSafely(-1, -1);
        //down and right
        getValidDirectionalMovesSafely(+1, +1);
        //down and left
        getValidDirectionalMovesSafely(-1, +1);
        //up and right
        getValidDirectionalMovesSafely(+1, -1);
        highlightValidMoves();
    }
}
