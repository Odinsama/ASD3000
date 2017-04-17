package gui.domain.concreteObjects.chess.Pieces;

import game.logic.chess.CastlingLogic;
import game.logic.shared.KingLogic;
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
        moveLogicList.add(new KingLogic(this));
        //castling is a special move only the chess king can do, it is separated from "KingLogic" because
        //KingLogic can be used by other pieces in other games like Shogi but those kings can't castle
        moveLogicList.add(new CastlingLogic(this));
    }

}
