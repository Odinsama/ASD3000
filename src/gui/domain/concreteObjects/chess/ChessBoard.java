package gui.domain.concreteObjects.chess;

import gui.domain.abstractObjects.Board;
import gui.domain.abstractObjects.Piece;
import gui.domain.abstractObjects.Tile;

import java.awt.*;
import java.util.List;

/**
 * Created by Odin on 2/13/2017.
 */
public class ChessBoard extends Board {
    public ChessBoard(Dimension boardSize) {
        super(boardSize, new Color(57, 67, 68), Color.white);
    }

    @Override
    protected Tile generateTile(Color tileColor) {
        return new ChessTile(tileColor);
    }

    @Override
    @SuppressWarnings("Duplicates")
    public void generatePieces() {
        ChessSet chessSet = new ChessSet();
        List<Piece> pieces = chessSet.getPieces();
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
