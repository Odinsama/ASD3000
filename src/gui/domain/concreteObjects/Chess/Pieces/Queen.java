package gui.domain.concreteObjects.Chess.Pieces;

import gui.domain.abstractObjects.Piece;
import logic.chessLogic.QueenLogic;
import names.PieceType;

import javax.imageio.ImageIO;
import java.io.IOException;
import java.net.URL;

/**
 * Created by Odin on 2/16/2017.
 */
public class Queen extends Piece{
    public Queen(boolean isNorth) {
        super(isNorth);
        try {

            if (isNorth) {
                image = ImageIO.read(new URL("http://evalanche.me/sjakkfigurer/svartd.png"));
            } else {
                image = ImageIO.read(new URL("http://evalanche.me/sjakkfigurer/hvitd.png"));
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        setPieceType(PieceType.QUEEN);
        moveLogic = new QueenLogic(this);
    }
}
