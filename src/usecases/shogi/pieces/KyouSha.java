package usecases.shogi.pieces;

import usecases.shogi.logic.KyouShaLogic;

/**
 * Created by Odin on 4/3/2017.
 * Unless it is poorly made, then it must
 * have been someone else.
 */
public class KyouSha extends ShogiPiece {
    public KyouSha(boolean isNorth) {
        super(isNorth, "香車");
        moveLogicList.add(new KyouShaLogic(this));
    }
}
