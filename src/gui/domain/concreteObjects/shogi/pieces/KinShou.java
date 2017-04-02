package gui.domain.concreteObjects.shogi.pieces;

import game.logic.shogi.KinShouLogic;
import gui.domain.abstractObjects.Piece;

/**
 * Created by Odin on 4/3/2017.
 */
public class KinShou extends ShogiPiece {
    public KinShou(boolean isNorth) {
        super(isNorth, "金棋");
        moveLogic = new KinShouLogic(this);
    }
}
