package gui.domain.concreteObjects.shogi.pieces;

import game.logic.shared.RookLogic;

/**
 * Created by Odin on 4/3/2017.
 */
public class HiSha extends ShogiPiece {
    public HiSha(boolean isNorth) {
        super(isNorth, "飛車");
        moveLogicList.add(new RookLogic(this));
    }
}
