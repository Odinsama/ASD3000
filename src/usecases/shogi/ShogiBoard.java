package usecases.shogi;

import simpleBoardGameEngine.coreComponents.Board;
import simpleBoardGameEngine.coreComponents.Tile;
import simpleBoardGameEngine.utils.BoardUtils;

import java.awt.*;

/**
 * Created by Odin on 4/2/2017.
 * Unless it is poorly made, then it must
 * have been someone else.
 */
public class ShogiBoard extends Board {
    public ShogiBoard(Dimension boardSize, Color tileColor1, Color tileColor2) {
        super(boardSize, tileColor1, tileColor2);
    }

    @Override
    protected Tile generateTile(Color tileColor) {
        return new Tile(tileColor);
    }

    @Override
    public void generatePieces() {
        BoardUtils.addPieceSetToBoard(
                this, new ShogiSet().getPieces(), COLUMNS, ROWS
        );
    }

    @Override
    public void setPromotionTiles() {
        BoardUtils.setPromotionRows(this, true, 0, 1, 2);
        BoardUtils.setPromotionRows(this, false, 6, 7, 8);
    }
}
