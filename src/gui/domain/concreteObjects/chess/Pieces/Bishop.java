package gui.domain.concreteObjects.chess.Pieces;

import gui.domain.abstractObjects.Piece;
import game.logic.shared.BishopLogic;

import javax.imageio.ImageIO;
import java.io.IOException;
import java.net.URL;

/**
 * Created by Odin on 2/16/2017.
 */
public class Bishop extends Piece {
    public Bishop(boolean isNorth) {
        super(isNorth);
        try {

            if (isNorth) {
                image = ImageIO.read(new URL("http://evalanche.me/sjakkfigurer/svartl.png"));
            } else {
                image = ImageIO.read(new URL("http://evalanche.me/sjakkfigurer/hvitl.png"));
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        moveLogicList.add(new BishopLogic(this));
    }
}
