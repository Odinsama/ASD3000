package usecases.chess.Pieces;

import simpleBoardGameEngine.coreComponents.Piece;
import simpleBoardGameEngine.coreComponents.Tile;
import simpleBoardGameEngine.utils.IPromotable;
import usecases.chess.logic.PawnLogic;

import javax.imageio.ImageIO;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;

/**
 * Created by Odin on 2/12/2017.
 * Unless it is poorly made, then it must
 * have been someone else.
 */
public class Pawn extends Piece implements IPromotable {


    public Pawn(Boolean isNorth) {
        super(isNorth);
        try {

            if (isNorth) {
                pieceImage = ImageIO.read(new URL("http://evalanche.me/sjakkfigurer/svartb.png"));
            } else {
                pieceImage = ImageIO.read(new URL("http://evalanche.me/sjakkfigurer/hvitb.png"));
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        moveLogicList.add(new PawnLogic(this));

    }

    @Override
    public void promote() {

        Class promotionChoice = new ChessPromotionDialog().getPromotionChoice();

        try {
            Piece newPiece = (Piece) (promotionChoice.getDeclaredConstructor(boolean.class).newInstance(isNorth()));
            System.out.println(newPiece.toString());
            Tile parent = (Tile) getParent();
            parent.remove(this);
            parent.setPiece(newPiece);

        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
        repaint();
    }
}
