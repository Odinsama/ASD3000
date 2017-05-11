package usecases.chess.Pieces;

import simpleBoardGameEngine.utils.IWinCondition;
import usecases.chess.logic.CastlingLogic;
import usecases.shared.KingLogic;
import simpleBoardGameEngine.coreComponents.Piece;

import javax.imageio.ImageIO;
import java.io.IOException;
import java.net.URL;

/**
 * Created by Odin on 2/16/2017.
 * Unless it is poorly made, then it must
 * have been someone else.
 */
public class King extends Piece implements IWinCondition{
    public King(boolean isNorth) {
        super(isNorth);
        try {

            if (isNorth) {
                pieceImage = ImageIO.read(new URL("http://evalanche.me/sjakkfigurer/svartk.png"));
            } else {
                pieceImage = ImageIO.read(new URL("http://evalanche.me/sjakkfigurer/hvitk.png"));
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        moveLogicList.add(new KingLogic(this));
        //castling is a special move only the king can do, it is separated from "KingLogic" because
        //KingLogic can be used by other pieces in other games like Shogi but those kings can't castle
        moveLogicList.add(new CastlingLogic(this));
    }

}
