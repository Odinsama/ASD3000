package gui.domain.concreteObjects.shogi;

import gui.domain.abstractObjects.Board;
import gui.domain.abstractObjects.Piece;

import java.awt.*;
import java.util.List;

/**
 * Created by Odin on 4/2/2017.
 */
public class ShogiBoard extends Board {
    public ShogiBoard(Dimension boardSize, Color tileColor1, Color tileColor2) {
        super(boardSize, tileColor1, tileColor2);
    }

    @Override
    @SuppressWarnings("Duplicates")
    public void generatePieces() {
        ShogiSet shogiSet = new ShogiSet();
        final List<Piece> pieces = shogiSet.getPieces();
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
