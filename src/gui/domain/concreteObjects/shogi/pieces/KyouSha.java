package gui.domain.concreteObjects.shogi.pieces;

import game.logic.shogi.KyouShaLogic;

/**
 * Created by Odin on 4/3/2017.
 */
public class KyouSha extends ShogiPiece {
    public KyouSha(boolean isNorth) {
        super(isNorth, "香車");
        moveLogic = new KyouShaLogic(this);
    }
}
