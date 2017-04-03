package game.logic.chess;

import gui.domain.concreteObjects.chess.Pieces.Pawn;
import game.logic.MoveLogic;
import gui.domain.abstractObjects.Tile;


/**
 * Created by Odin on 3/7/2017.
 */
public class PawnLogic extends MoveLogic {

    public PawnLogic(Pawn pawn) {
        super(pawn);
    }

    @Override
    public void setValidMoves() {
        setPosition();
        addMoveSafely(NONE , DIR);
        if (PIECE.getMovesMade() == 0 && !TILES[x][y + DIR].isOccupied()) {
            addMoveSafely(0,DIR*2);
        }
        addCaptureSafely(LEFT, DIR);
        addCaptureSafely(RIGHT, DIR);
        addUnPassantSafely(LEFT, DIR);
        addUnPassantSafely(RIGHT, DIR);
        highlightValidMoves();
    }

    private void addUnPassantSafely(int left, int dir) {
        if (PIECE.isNorth() && y == 3 || !PIECE.isNorth() && y == 4){}
    }

    @Override
    protected void highlightValidMoves() {
        moves.stream()
                .filter(tile -> !tile.isOccupied())
                .forEach(this::highlightMove);
        captures.stream()
                .filter(Tile::isOccupied)
                .forEach(this::highlightCapture);
        moves.clear();
        captures.clear();
    }
}
