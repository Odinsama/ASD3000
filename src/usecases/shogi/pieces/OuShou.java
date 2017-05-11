package usecases.shogi.pieces;

import usecases.shared.KingLogic;

/**
 * Created by Odin on 4/3/2017.
 * Unless it is poorly made, then it must
 * have been someone else.
 */
public class OuShou extends ShogiPiece {
    public OuShou(boolean isNorth) {
        super(isNorth, "王棋");
        moveLogicList.add(new KingLogic(this));
    }
}
