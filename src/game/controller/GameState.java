package game.controller;


import gui.domain.abstractObjects.Piece;
import gui.domain.abstractObjects.Tile;

import java.awt.*;
import java.util.Stack;

/**
 * Created by Odin on 4/7/2017.
 */

//this class keeps track of the state of the game
public class GameState {

    private final Stack<Command> commands = new Stack<>();
    private final Stack<Command> undoneCommands = new Stack<>();
    private Piece movingPiece;
    private Boolean isNorthsTurn = false;

    public GameState() {
    }

    public void undoMove() {
        if (commands.isEmpty())return;
        Command undoCommand = commands.pop();
        undoCommand.undo();
        undoneCommands.add(undoCommand);
        GameController.endTurn();
    }

    public void redoMove() {
        if (undoneCommands.isEmpty())return;
        Command command = undoneCommands.pop();
        commands.add(command);
        command.execute();
        GameController.endTurn();
    }

    public void resetBoard(){
        while (!commands.isEmpty()){
            undoMove();
        }
    }

    public void setMovingPiece(Piece movingPiece) {
        this.movingPiece = movingPiece;
        Tile originTile = (Tile) movingPiece.getParent();
        originTile.highlight(Color.yellow);
    }

    void addCommand(Command command){
        commands.add(command);
    }
    void clearUndoneCommands(){
        undoneCommands.clear();
    }

    Piece getMovingPiece() {
        return movingPiece;
    }

    public boolean isYourTurn(Boolean isNorth) {
        return isNorth == isNorthsTurn;
    }

    public void endTurn() {
        isNorthsTurn = !isNorthsTurn;
    }
}
