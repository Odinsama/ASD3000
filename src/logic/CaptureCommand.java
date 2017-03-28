package logic;

import gui.domain.abstractObjects.Board;
import gui.domain.abstractObjects.Piece;
import gui.domain.concreteObjects.Tile;

/**
 * Created by Odin on 3/12/2017.
 */
public class CaptureCommand implements Command {
    private final Piece captured;
    private final Piece origin;
    private final Board board;
    private final Tile target;
    private final Tile oldTile;

    CaptureCommand(Board board, Piece origin, Piece captured) {
        this.board = board;
        this.origin = origin;
        this.captured = captured;
        this.target = (Tile)captured.getParent();
        this.oldTile = (Tile)origin.getParent();
    }

    @Override
    public void execute() {
        board.capturePiece(target,captured,origin,oldTile);
        board.repaint();
    }

    @Override
    public void undo() {
        board.undoCapture(target,captured,oldTile, origin);
        board.repaint();
    }
}
