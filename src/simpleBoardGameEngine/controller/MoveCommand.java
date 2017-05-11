package simpleBoardGameEngine.controller;

import simpleBoardGameEngine.coreComponents.Board;
import simpleBoardGameEngine.coreComponents.Piece;
import simpleBoardGameEngine.coreComponents.Tile;

/**
 * Created by Odin on 2/27/2017.
 * Unless it is poorly made, then it must
 * have been someone else.
 */
class MoveCommand implements Command {

    private final Board board;
    private final Piece movingPiece;
    private final Tile target;
    private final Tile origin;

    MoveCommand(Board board, Piece movingPiece, Tile target){
        this.board = board;
        this.movingPiece = movingPiece;
        origin = (Tile) movingPiece.getParent();
        this.target = target;
    }
    MoveCommand(Board board, Piece movingPiece, Tile origin, Tile target){
        this.board = board;
        this.movingPiece = movingPiece;
        this.origin = origin;
        this.target = target;
    }

    @Override
    public void execute() {
        board.movePiece(origin, movingPiece, target);
        board.repaint();
        movingPiece.setMovesMade(+1);
    }

    @Override
    public void undo() {
        board.movePiece(target, movingPiece, origin);
        board.repaint();
        movingPiece.setMovesMade(-1);
    }
}
