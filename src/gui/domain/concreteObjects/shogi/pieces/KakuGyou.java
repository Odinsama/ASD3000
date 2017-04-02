package gui.domain.concreteObjects.shogi.pieces;

import game.logic.shared.BishopLogic;
import gui.domain.abstractObjects.Piece;

/**
 * Created by Odin on 4/3/2017.
 */
public class KakuGyou extends ShogiPiece {
    public KakuGyou(boolean isNorth) {
        super(isNorth, "角行");
        moveLogic = new BishopLogic(this);
    }
}
