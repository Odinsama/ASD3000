package usecases.shogi.pieces;

import usecases.shogi.logic.KeiMaLogic;

/**
 * Created by Odin on 4/3/2017.
 * Unless it is poorly made, then it must
 * have been someone else.
 */
public class KeiMa extends ShogiPiece {
    public KeiMa(boolean isNorth) {
        super(isNorth, "桂馬");
        moveLogicList.add(new KeiMaLogic(this));
    }
}
