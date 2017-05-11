package usecases.shogi.pieces;

import usecases.shogi.logic.KinShouLogic;

/**
 * Created by Odin on 4/3/2017.
 * Unless it is poorly made, then it must
 * have been someone else.
 */
public class KinShou extends ShogiPiece {
    public KinShou(boolean isNorth) {
        super(isNorth, "金棋");
        moveLogicList.add(new KinShouLogic(this));
    }
}
