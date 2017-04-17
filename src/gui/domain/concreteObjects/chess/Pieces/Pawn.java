package gui.domain.concreteObjects.chess.Pieces;

import game.controller.GameController;
import game.logic.chess.PawnLogic;
import gui.domain.abstractObjects.Piece;
import gui.domain.utils.IPromotable;

import javax.imageio.ImageIO;
import java.io.IOException;
import java.net.URL;

/**
 * Created by Odin on 2/12/2017.
 */
public class Pawn extends Piece implements IPromotable {


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
        moveLogicList.add(new PawnLogic(this));

    }

    @Override
    public void promote() {
        GameController.promote(this);
    }
}
