package usecases.chess.Pieces;

import simpleBoardGameEngine.coreComponents.Piece;
import usecases.shared.BishopLogic;

import javax.imageio.ImageIO;
import java.io.IOException;
import java.net.URL;

/**
 * Created by Odin on 2/16/2017.
 * Unless it is poorly made, then it must
 * have been someone else.
 */
public class Bishop extends Piece {
    public Bishop(boolean isNorth) {
        super(isNorth);
        try {

            if (isNorth) {
                pieceImage = ImageIO.read(new URL("http://evalanche.me/sjakkfigurer/svartl.png"));
            } else {
                pieceImage = ImageIO.read(new URL("http://evalanche.me/sjakkfigurer/hvitl.png"));
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        moveLogicList.add(new BishopLogic(this));
    }
}
