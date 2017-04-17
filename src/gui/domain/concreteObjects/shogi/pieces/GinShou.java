package gui.domain.concreteObjects.shogi.pieces;

import game.logic.shogi.GinShouLogic;

/**
 * Created by Odin on 4/3/2017.
 */
public class GinShou extends ShogiPiece {
    public GinShou(boolean isNorth) {
        super(isNorth, "銀棋");
        moveLogicList.add(new GinShouLogic(this));
    }
}
