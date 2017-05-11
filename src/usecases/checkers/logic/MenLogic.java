package usecases.checkers.logic;

import simpleBoardGameEngine.coreComponents.Piece;
import usecases.checkers.Men;
import simpleBoardGameEngine.moves.MoveLogic;

/**
 * Created by Odin on 4/1/2017.
 * Unless it is poorly made, then it must
 * have been someone else.
 */
public class MenLogic extends MoveLogic {
    private final Men men;

    public MenLogic(Piece piece) {
        super(piece);
        men = (Men) piece;
    }

    @Override
    public void setValidMoves() {
        setPosition();
        addMoveSafely(LEFT, DIR);
        addMoveSafely(RIGHT, DIR);
        addSkipCaptureSafely(LEFT, DIR);
        addSkipCaptureSafely(RIGHT, DIR);
        if (men.isKing()){
            addMoveSafely(LEFT, -DIR);
            addMoveSafely(RIGHT, -DIR);
            addSkipCaptureSafely(LEFT, -DIR);
            addSkipCaptureSafely(RIGHT, -DIR);
        }
    }
}
