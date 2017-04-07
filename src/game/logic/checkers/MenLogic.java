package game.logic.checkers;

import gui.domain.abstractObjects.Piece;
import gui.domain.concreteObjects.checkers.Men;
import game.logic.shared.moves.MoveLogic;

/**
 * Created by Odin on 4/1/2017.
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
