package gui.domain.concreteObjects.shogi.pieces;

import game.logic.shogi.FuHyouLogic;

/**
 * Created by Odin on 4/2/2017.
 */
public class FuHyou extends ShogiPiece {
    public FuHyou(Boolean isNorth) {
        super(isNorth, "歩兵");
        moveLogicList.add(new FuHyouLogic(this));
    }
}
