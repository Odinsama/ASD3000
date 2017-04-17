package gui.domain.utils;

import gui.domain.abstractObjects.Board;
import gui.domain.abstractObjects.Piece;
import gui.domain.abstractObjects.Tile;

import java.util.List;

/**
 * Created by odins on 4/17/2017.
 */
public class BoardUtils {
    private BoardUtils(){}

    public static void addPieceSetToBoard(Board board, List<Piece> pieces, int COLUMNS, int ROWS){
        Tile[][] TILES = board.getTiles();
        int i = 0;
        for (int y = 0; y < COLUMNS; y++) {
            for (int x = 0; x < ROWS; x++){
                if (pieces.get(i)!=null) {
                    TILES[x][y].setPiece(pieces.get(i));
                    TILES[x][y].add(pieces.get(i));
                }
                i++;
            }
        }
    }
}
