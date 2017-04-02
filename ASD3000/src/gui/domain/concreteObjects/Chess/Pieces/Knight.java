package gui.domain.concreteObjects.chess.Pieces;

import game.logic.chess.KnightLogic;
import gui.domain.abstractObjects.Piece;
import names.PieceType;

import javax.imageio.ImageIO;
import java.io.IOException;
import java.net.URL;

/**
 * Created by Odin on 2/16/2017.
 */
public class Knight extends Piece{
    public Knight(boolean isNorth) {
        super(isNorth);
        try {

            if (isNorth) {
                image = ImageIO.read(new URL("http://evalanche.me/sjakkfigurer/svarth.png"));
            } else {
                image = ImageIO.read(new URL("http://evalanche.me/sjakkfigurer/hvith.png"));
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        setPieceType(PieceType.KNIGHT);
        moveLogic = new KnightLogic(this);
    }
}
