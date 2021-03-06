package usecases.chess;

import simpleBoardGameEngine.coreComponents.Board;
import simpleBoardGameEngine.coreComponents.Piece;

import java.awt.*;

/**
 * Created by Odin on 2/13/2017.
 */
public class ChessBoard extends Board {
    public ChessBoard(Dimension boardSize) {
        super(boardSize);
    }

    @Override
    public void generatePieces() {
        ChessSet chessSet = new ChessSet();
        int i = 0;
        for (int y = 0; y < COLUMNS; y++) {
            for (int x = 0; x < ROWS; x++){
                if (chessSet.get(i)!=null) {
                    tiles[x][y].setPiece((Piece) chessSet.get(i));
                    tiles[x][y].add((Piece) chessSet.get(i));
                }
                i++;
            }
        }
    }
}
