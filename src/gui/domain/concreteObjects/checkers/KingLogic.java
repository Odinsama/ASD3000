package gui.domain.concreteObjects.checkers;

import game.logic.MoveLogic;

/**
 * Created by Odin on 4/2/2017.
 */
public class KingLogic extends MoveLogic {
    public KingLogic(Men men) {
        super(men);
    }

    @Override
    public void setValidMoves() {
        setPosition();
        addMoveSafely(+1,+1);
        addMoveSafely(+1,-1);
        addMoveSafely(-1,-1);
        addMoveSafely(-1,+1);
    }
}
