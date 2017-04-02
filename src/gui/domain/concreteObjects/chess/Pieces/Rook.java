package gui.domain.concreteObjects.chess.Pieces;

import game.logic.chess.RookLogic;
import gui.domain.abstractObjects.Piece;

import javax.imageio.ImageIO;
import java.io.IOException;
import java.net.URL;

/**
 * Created by Odin on 2/16/2017.
 */
public class Rook extends Piece {
    public Rook(boolean isNorth) {
        super(isNorth);
        try {

            if (isNorth) {
                image = ImageIO.read(new URL("http://evalanche.me/sjakkfigurer/svartt.png"));
            } else {
                image = ImageIO.read(new URL("http://evalanche.me/sjakkfigurer/hvitt.png"));
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        moveLogic = new RookLogic(this);
    }
}