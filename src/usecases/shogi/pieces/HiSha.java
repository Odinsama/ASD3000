package usecases.shogi.pieces;

import usecases.shared.RookLogic;

/**
 * Created by Odin on 4/3/2017.
 * Unless it is poorly made, then it must
 * have been someone else.
 */
public class HiSha extends ShogiPiece {
    public HiSha(boolean isNorth) {
        super(isNorth, "飛車");
        moveLogicList.add(new RookLogic(this));
    }
}
