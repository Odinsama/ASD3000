package usecases.shogi.pieces;

import usecases.shogi.logic.FuHyouLogic;

/**
 * Created by Odin on 4/2/2017.
 * Unless it is poorly made, then it must
 * have been someone else.
 */
public class FuHyou extends ShogiPiece {
    public FuHyou(Boolean isNorth) {
        super(isNorth, "歩兵");
        moveLogicList.add(new FuHyouLogic(this));
    }
}
