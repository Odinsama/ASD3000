package usecases.checkers;

import simpleBoardGameEngine.coreComponents.Board;
import simpleBoardGameEngine.coreComponents.Piece;
import simpleBoardGameEngine.coreComponents.Tile;
import simpleBoardGameEngine.utils.BoardUtils;

import java.awt.*;

/**
 * Created by Odin on 4/1/2017.
 * Unless it is poorly made, then it must
 * have been someone else.
 */
public class CheckersBoard extends Board {
    CheckersBoard(Dimension dimension) {
        super(dimension, new Color(170, 247, 153), new Color(66, 134, 244));
    }

    @Override
    protected Tile generateTile(Color tileColor) {
        return new Tile(tileColor);
    }

    @Override
    public void generatePieces() {
        for (int y = 0; y < COLUMNS; y++) {
            for (int x = 0; x < ROWS; x++) {
                Piece piece;
                //fills the dark tiles in the first three rows with red pieces
                if(y <= 2 && (x + y) % 2 != 0){
                    TILES[x][y].add(piece = new Men(true));
                    TILES[x][y].setPiece(piece);
                }

                //fills the dark tiles in the last three rows with white pieces
                if(y >= 5 && (x + y) % 2 != 0){
                    TILES[x][y].add(piece = new Men(false));
                    TILES[x][y].setPiece(piece);
                }
            }
        }
    }

    @Override
    public void setPromotionTiles() {
        BoardUtils.setPromotionRows(this, true, 0);
        BoardUtils.setPromotionRows(this, false, 7);
    }
}
