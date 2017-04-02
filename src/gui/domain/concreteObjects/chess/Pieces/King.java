package gui.domain.concreteObjects.chess.Pieces;

import game.logic.chess.KingLogic;
import gui.domain.abstractObjects.Piece;

import javax.imageio.ImageIO;
import java.io.IOException;
import java.net.URL;

/**
 * Created by Odin on 2/16/2017.
 */
public class King extends Piece{
    public King(boolean isNorth) {
        super(isNorth);
        try {

            if (isNorth) {
                image = ImageIO.read(new URL("http://evalanche.me/sjakkfigurer/svartk.png"));
            } else {
                image = ImageIO.read(new URL("http://evalanche.me/sjakkfigurer/hvitk.png"));
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        moveLogic = new KingLogic(this);
    }

}