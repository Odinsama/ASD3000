package gui.domain.concreteObjects.shogi.pieces;

import game.logic.shogi.KeiMaLogic;

/**
 * Created by Odin on 4/3/2017.
 */
public class KeiMa extends ShogiPiece {
    public KeiMa(boolean isNorth) {
        super(isNorth, "桂馬");
        moveLogicList.add(new KeiMaLogic(this));
    }
}
