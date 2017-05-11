package usecases.chess.Pieces;

import usecases.chess.logic.QueenLogic;
import simpleBoardGameEngine.coreComponents.Piece;

import javax.imageio.ImageIO;
import java.io.IOException;
import java.net.URL;

/**
 * Created by Odin on 2/16/2017.
 * Unless it is poorly made, then it must
 * have been someone else.
 */
public class Queen extends Piece{
    public Queen(boolean isNorth) {
        super(isNorth);
        try {

            if (isNorth) {
                pieceImage = ImageIO.read(new URL("http://evalanche.me/sjakkfigurer/svartd.png"));
            } else {
                pieceImage = ImageIO.read(new URL("http://evalanche.me/sjakkfigurer/hvitd.png"));
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        moveLogicList.add(new QueenLogic(this));    }
}
