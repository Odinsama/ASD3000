package game.logic.shogi;

import game.logic.shared.moves.MoveLogic;
import gui.domain.concreteObjects.shogi.pieces.KyouSha;

/**
 * Created by Odin on 4/3/2017.
 */
public class KyouShaLogic extends MoveLogic {
    public KyouShaLogic(KyouSha kyouSha) {
        super(kyouSha);
    }

    @Override
    public void setValidMoves() {
        setPosition();
        setIncrementalDirectionalMovesSafely(NONE, DIR);
    }
}
