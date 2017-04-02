package game;

import gui.domain.abstractObjects.Board;
import gui.domain.abstractObjects.Piece;
import gui.domain.concreteObjects.Tile;

import java.awt.*;
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
    private boolean hasBegun = false;

    private Board startGame(){
        hasBegun = true;
        board = generateBoard();
        board.generatePieces();
        return board;
    }

    public Board openGame() {
        return hasBegun ? resumeGame() : startGame();
    }

    private Board resumeGame() {
        return board;
    }

    protected abstract Board generateBoard();

    public void movePiece(Tile target){
        MoveCommand moveCommand = new MoveCommand(board, origin, target);
        commands.add(moveCommand);
        undoneCommands.clear();
        moveCommand.execute();
        northsTurn = !northsTurn;
    }

    void undoMove() {
        if (commands.isEmpty())return;
        Command undoCommand = commands.pop();
        undoCommand.undo();
        undoneCommands.add(undoCommand);
        northsTurn = !northsTurn;
    }

    void redoMove() {
        if (undoneCommands.isEmpty())return;
        Command command = undoneCommands.pop();
        commands.add(command);
        command.execute();
        northsTurn = !northsTurn;
    }

    void resetBoard(){
        while (!commands.isEmpty()){
            undoMove();
        }
    }

    public void setOrigin(Piece origin) {
        this.origin = origin;
        Tile originTile = (Tile) origin.getParent();
        originTile.highlight(Color.yellow);
    }

    boolean isNorthsTurn() {
        return northsTurn;
    }

    void capture(Piece target) {
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
