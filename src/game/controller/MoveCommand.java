package game.controller;

import gui.domain.abstractObjects.Board;
import gui.domain.abstractObjects.Piece;
import gui.domain.concreteObjects.Tile;

/**
 * Created by Odin on 2/27/2017.
 */
public class MoveCommand implements Command {

    private final Board board;
    private final Piece movingPiece;
    private final Tile target;
    private final Tile origin;

    public MoveCommand(Board board, Piece movingPiece, Tile target){
        this.board = board;
        this.movingPiece = movingPiece;
        origin = (Tile) movingPiece.getParent();
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
