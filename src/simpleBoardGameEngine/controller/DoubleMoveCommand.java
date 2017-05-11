package simpleBoardGameEngine.controller;

import simpleBoardGameEngine.coreComponents.Board;
import simpleBoardGameEngine.coreComponents.Piece;
import simpleBoardGameEngine.coreComponents.Tile;

/**
 * Created by Odin on 4/14/2017.
 * Unless it is poorly made, then it must
 * have been someone else.
 */
class DoubleMoveCommand implements Command {

    private final MoveCommand moveCommand1;
    private final MoveCommand moveCommand2;

    DoubleMoveCommand(Board board, Tile target, Piece movingPiece, Piece secondPiece, Tile secondTarget) {
        moveCommand1 = new MoveCommand(board, movingPiece, target);
        moveCommand2 = new MoveCommand(board, secondPiece, secondTarget);
    }


    @Override
    public void execute() {
        moveCommand1.execute();
        moveCommand2.execute();
    }

    @Override
    public void undo() {
        moveCommand1.undo();
        moveCommand2.undo();
    }
}
