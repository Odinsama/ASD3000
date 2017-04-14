package gui.domain.concreteObjects.shogi.pieces;

import game.logic.shogi.OuShouLogic;

/**
 * Created by Odin on 4/3/2017.
 */
public class OuShou extends ShogiPiece {
    public OuShou(boolean isNorth) {
        super(isNorth, "王棋");
        moveLogic = new OuShouLogic(this);
    }
}
