package usecases.shogi;

import simpleBoardGameEngine.coreComponents.PieceSet;
import usecases.shogi.pieces.*;

/**
 * Created by Odin on 4/2/2017.
 * Unless it is poorly made, then it must
 * have been someone else.
 */
class ShogiSet extends PieceSet{

    //Collection of pieces needed to play logic in the order of the starting position.
    ShogiSet() {

        //North side pieces
        pieces.add(new KyouSha(true)); pieces.add(new KeiMa(true)); pieces.add(new GinShou(true)); pieces.add(new KinShou(true)); pieces.add(new OuShou(true)); pieces.add(new KinShou(true)); pieces.add(new GinShou(true)); pieces.add(new KeiMa(true)); pieces.add(new KyouSha(true));
        pieces.add(null); pieces.add(new KakuGyou(true));  pieces.add(null); pieces.add(null); pieces.add(null); pieces.add(null); pieces.add(null); pieces.add(new HiSha(true)); pieces.add(null);
        pieces.add(new FuHyou(true)); pieces.add(new FuHyou(true)); pieces.add(new FuHyou(true));pieces.add(new FuHyou(true)); pieces.add(new FuHyou(true)); pieces.add(new FuHyou(true));pieces.add(new FuHyou(true)); pieces.add(new FuHyou(true)); pieces.add(new FuHyou(true));
        //empty middle tiles
        pieces.add(null);pieces.add(null);pieces.add(null);pieces.add(null);pieces.add(null);pieces.add(null);pieces.add(null);pieces.add(null);pieces.add(null);
        pieces.add(null);pieces.add(null);pieces.add(null);pieces.add(null);pieces.add(null);pieces.add(null);pieces.add(null);pieces.add(null);pieces.add(null);
        pieces.add(null);pieces.add(null);pieces.add(null);pieces.add(null);pieces.add(null);pieces.add(null);pieces.add(null);pieces.add(null);pieces.add(null);
        //South side pieces
        pieces.add(new FuHyou(false)); pieces.add(new FuHyou(false)); pieces.add(new FuHyou(false));pieces.add(new FuHyou(false)); pieces.add(new FuHyou(false)); pieces.add(new FuHyou(false));pieces.add(new FuHyou(false)); pieces.add(new FuHyou(false)); pieces.add(new FuHyou(false));
        pieces.add(null); pieces.add(new KakuGyou(false));  pieces.add(null); pieces.add(null); pieces.add(null); pieces.add(null); pieces.add(null); pieces.add(new HiSha(false)); pieces.add(null);
        pieces.add(new KyouSha(false)); pieces.add(new KeiMa(false)); pieces.add(new GinShou(false)); pieces.add(new KinShou(false)); pieces.add(new OuShou(false)); pieces.add(new KinShou(false)); pieces.add(new GinShou(false)); pieces.add(new KeiMa(false)); pieces.add(new KyouSha(false));

    }
}
