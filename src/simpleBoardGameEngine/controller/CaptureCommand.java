package simpleBoardGameEngine.controller;

import simpleBoardGameEngine.coreComponents.Board;
import simpleBoardGameEngine.coreComponents.Piece;
import simpleBoardGameEngine.coreComponents.Tile;

/**
 * Created by Odin on 3/12/2017.
 * Unless it is poorly made, then it must
 * have been someone else.
 */
class CaptureCommand implements Command {
    private final Piece captured;
    private final Piece movingPiece;
    private final Board board;
    private final Tile target;
    private final Tile origin;

    CaptureCommand(Board board, Piece movingPiece, Piece captured) {
        this.board = board;
        this.movingPiece = movingPiece;
        this.captured = captured;
        this.target = (Tile)captured.getParent();
        this.origin = (Tile)movingPiece.getParent();
    }

    @Override
    public void execute() {
        board.capturePiece(origin,captured, movingPiece, target);
        board.repaint();
        movingPiece.setMovesMade(+1);
    }

    @Override
    public void undo() {
        board.undoCapture(target, movingPiece, captured, origin);
        board.repaint();
        movingPiece.setMovesMade(-1);
    }
}
