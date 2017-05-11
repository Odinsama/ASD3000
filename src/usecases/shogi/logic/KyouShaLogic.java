package usecases.shogi.logic;

import simpleBoardGameEngine.moves.MoveLogic;
import usecases.shogi.pieces.KyouSha;

/**
 * Created by Odin on 4/3/2017.
 * Unless it is poorly made, then it must
 * have been someone else.
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
