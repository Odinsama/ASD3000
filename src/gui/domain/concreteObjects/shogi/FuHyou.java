package gui.domain.concreteObjects.shogi;

import game.logic.shogi.FuHyouLogic;

/**
 * Created by Odin on 4/2/2017.
 */
public class FuHyou extends ShogiPiece {
    public FuHyou(Boolean isNorth, String pieceName) {
        super(isNorth, pieceName);
        moveLogic = new FuHyouLogic(this);
    }
}
