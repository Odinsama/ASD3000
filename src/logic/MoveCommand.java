package logic;

import gui.domain.abstractObjects.Board;
import gui.domain.abstractObjects.Piece;
import gui.domain.concreteObjects.Tile;

/**
 * Created by Odin on 2/27/2017.
 */
public class MoveCommand implements Command {

    private final Board board;
    private final Piece origin;
    private final Tile target;
    private final Tile oldTile;

    public MoveCommand(Board board, Piece origin, Tile target){
        this.board = board;
        this.origin = origin;
        oldTile = (Tile) origin.getParent();
        this.target = target;
    }

    @Override
    public void execute() {
        board.movePiece(target, origin, oldTile);
        board.repaint();
    }

    @Override
    public void undo() {
        board.movePiece(oldTile, origin, oldTile);
        board.repaint();
    }
}
