package gui.domain.concreteObjects.Chess.Pieces;

import gui.domain.abstractObjects.Piece;
import logic.MoveLogic;
import logic.chessLogic.PawnLogic;
import names.PieceType;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;
import java.net.URL;

/**
 * Created by Odin on 2/12/2017.
 */
public class Pawn extends Piece {


    public Pawn(Boolean isNorth) {
        super(isNorth);
        try {

            if (isNorth) {
                image = ImageIO.read(new URL("http://evalanche.me/sjakkfigurer/svartb.png"));
            } else {
                image = ImageIO.read(new URL("http://evalanche.me/sjakkfigurer/hvitb.png"));
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        setPieceType(PieceType.PAWN);
        moveLogic = new PawnLogic(this);

    }

}
