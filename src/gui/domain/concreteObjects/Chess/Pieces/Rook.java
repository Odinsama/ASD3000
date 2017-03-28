package gui.domain.concreteObjects.Chess.Pieces;

import gui.domain.abstractObjects.Piece;
import logic.chessLogic.RookLogic;
import names.PieceType;

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
        setPieceType(PieceType.ROOK);
        moveLogic = new RookLogic(this);
        RookLogic rookLogic = new RookLogic(this);
    }
}
