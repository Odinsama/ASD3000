package usecases.chess.Pieces;

import usecases.chess.logic.KnightLogic;
import simpleBoardGameEngine.coreComponents.Piece;

import javax.imageio.ImageIO;
import java.io.IOException;
import java.net.URL;

/**
 * Created by Odin on 2/16/2017.
 * Unless it is poorly made, then it must
 * have been someone else.
 */
public class Knight extends Piece{
    public Knight(boolean isNorth) {
        super(isNorth);
        try {

            if (isNorth) {
                pieceImage = ImageIO.read(new URL("http://evalanche.me/sjakkfigurer/svarth.png"));
            } else {
                pieceImage = ImageIO.read(new URL("http://evalanche.me/sjakkfigurer/hvith.png"));
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        moveLogicList.add(new KnightLogic(this));
    }
}
