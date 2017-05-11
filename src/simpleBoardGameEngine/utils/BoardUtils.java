package simpleBoardGameEngine.utils;

import simpleBoardGameEngine.coreComponents.Board;
import simpleBoardGameEngine.coreComponents.Piece;
import simpleBoardGameEngine.coreComponents.Tile;

import java.util.List;

/**
 * Created by Odin on 4/17/2017.
 * Unless it is poorly made, then it must
 * have been someone else.
 */
public class BoardUtils {

    private BoardUtils(){}

    public static void addPieceSetToBoard(Board board, List<Piece> pieces, int COLUMNS, int ROWS){
        Tile[][] tiles = board.getTiles();
        int i = 0;
        for (int y = 0; y < COLUMNS; y++) {
            for (int x = 0; x < ROWS; x++){
                if (pieces.get(i)!=null) {
                    tiles[x][y].setPiece(pieces.get(i));
                }
                i++;
            }
        }
    }

    public static void setPromotionRows(Board board, boolean isNorth, int... ROWS) {
        Tile[][] tiles = board.getTiles();
        for (int row:ROWS) {
            for (Tile[] tileArray:tiles) {
               tileArray[row].setPromotionTile(isNorth);
            }
        }
    }
}
