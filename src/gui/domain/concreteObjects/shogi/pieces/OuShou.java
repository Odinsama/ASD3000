package gui.domain.concreteObjects.shogi.pieces;

import game.logic.shared.KingLogic;

/**
 * Created by Odin on 4/3/2017.
 */
public class OuShou extends ShogiPiece {
    public OuShou(boolean isNorth) {
        super(isNorth, "王棋");
        moveLogicList.add(new KingLogic(this));
    }
}
