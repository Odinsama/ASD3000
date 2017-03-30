package game;

import gui.domain.abstractObjects.Board;
import gui.domain.abstractObjects.Piece;
import gui.domain.concreteObjects.Tile;

import java.util.Stack;

/**
 * Created by Odin on 1/31/2017.
 */
public abstract class Game {

    private Board board;
    private Stack<Command> commands = new Stack<>();
    private Stack<Command> undoneCommands = new Stack<>();
    private Piece origin;
    private boolean northsTurn = false;

    public Board startGame(){
        return board = generateBoard();
    }

    public abstract Board generateBoard();

    public void finishGame(){

    }

    public void movePiece(Tile target){
        MoveCommand moveCommand = new MoveCommand(board, origin, target);
        commands.add(moveCommand);
        undoneCommands.clear();
        moveCommand.execute();
        northsTurn = !northsTurn;
    }

    public void undoMove() {
        if (commands.isEmpty())return;
        Command undoCommand = commands.pop();
        undoCommand.undo();
        undoneCommands.add(undoCommand);
        northsTurn = !northsTurn;
    }

    public void redoMove() {
        if (undoneCommands.isEmpty())return;
        Command command = undoneCommands.pop();
        commands.add(command);
        command.execute();
        northsTurn = !northsTurn;
    }

    public void setOrigin(Piece origin) {
        this.origin = origin;
        Tile originTile = (Tile) origin.getParent();
        originTile.highlight(Color.yellow);
    }

    public boolean isNorthsTurn() {
        return northsTurn;
    }

    public void capture(Piece target) {
        CaptureCommand captureCommand = new CaptureCommand(board, origin, target);
        commands.add(captureCommand);
        undoneCommands.clear();
        captureCommand.execute();
        northsTurn = !northsTurn;
    }

    public void clearHighlights() {
        board.clearHighlights();
    }

    public Tile[][] getTiles() {
        return board.getTiles();
    }
}
