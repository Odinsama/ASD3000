package gui.domain.concreteObjects.shogi.pieces;

import game.logic.shogi.GinShouLogic;
import gui.domain.abstractObjects.Piece;

/**
 * Created by Odin on 4/3/2017.
 */
public class GinShou extends ShogiPiece {
    public GinShou(boolean isNorth) {
        super(isNorth, "銀棋");
        moveLogic = new GinShouLogic(this);
    }
}
