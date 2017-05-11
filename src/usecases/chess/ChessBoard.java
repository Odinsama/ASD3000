package usecases.chess;

import simpleBoardGameEngine.coreComponents.Board;
import simpleBoardGameEngine.coreComponents.Tile;
import simpleBoardGameEngine.utils.BoardUtils;

import java.awt.*;

/**
 * Created by Odin on 2/13/2017.
 * Unless it is poorly made, then it must
 * have been someone else.
 */
public class ChessBoard extends Board {
    public ChessBoard(Dimension boardSize) {
        super(boardSize, new Color(57, 67, 68), Color.white);
    }

    @Override
    protected Tile generateTile(Color tileColor) {
        return new Tile(tileColor);
    }

    @Override
    public void generatePieces() {
        BoardUtils.addPieceSetToBoard(this, new ChessSet().getPieces(), COLUMNS, ROWS);
    }

    @Override
    public void setPromotionTiles() {
        BoardUtils.setPromotionRows(this, true, 0);
        BoardUtils.setPromotionRows(this, false, 7);
    }
}
