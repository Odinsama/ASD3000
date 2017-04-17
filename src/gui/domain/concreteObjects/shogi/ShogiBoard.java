package gui.domain.concreteObjects.shogi;

import gui.domain.abstractObjects.Board;
import gui.domain.abstractObjects.Piece;
import gui.domain.abstractObjects.Tile;
import gui.domain.utils.BoardUtils;

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
    protected Tile generateTile(Color tileColor) {
        return new Tile(tileColor);
    }

    @Override
    public void generatePieces() {
        BoardUtils.addPieceSetToBoard(
                this, new ShogiSet().getPieces(), COLUMNS, ROWS
        );
    }
}
