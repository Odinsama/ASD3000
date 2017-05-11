package usecases.shogi.pieces;

import usecases.shogi.logic.GinShouLogic;

/**
 * Created by Odin on 4/3/2017.
 * Unless it is poorly made, then it must
 * have been someone else.
 */
public class GinShou extends ShogiPiece {
    public GinShou(boolean isNorth) {
        super(isNorth, "銀棋");
        moveLogicList.add(new GinShouLogic(this));
    }
}
