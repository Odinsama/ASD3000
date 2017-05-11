package usecases.shogi.pieces;

import usecases.shared.BishopLogic;

/**
 * Created by Odin on 4/3/2017.
 * Unless it is poorly made, then it must
 * have been someone else.
 */
public class KakuGyou extends ShogiPiece {
    public KakuGyou(boolean isNorth) {
        super(isNorth, "角行");
        moveLogicList.add(new BishopLogic(this));
    }
}
