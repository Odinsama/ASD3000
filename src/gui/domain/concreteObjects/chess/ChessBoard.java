package gui.domain.concreteObjects.chess;

import gui.domain.abstractObjects.Board;
import gui.domain.abstractObjects.Tile;
import gui.domain.utils.BoardUtils;

import java.awt.*;

/**
 * Created by Odin on 2/13/2017.
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
}
