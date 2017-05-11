package simpleBoardGameEngine.controller;


import simpleBoardGameEngine.coreComponents.Piece;
import simpleBoardGameEngine.coreComponents.Tile;

import java.awt.*;
import java.util.Stack;

/**
 * Created by Odin on 4/7/2017.
 * Unless it is poorly made, then it must
 * have been someone else.
 */

//this class keeps track of the state of the game
class GameState {

    private final Stack<Command> commands = new Stack<>();
    private final Stack<Command> undoneCommands = new Stack<>();
    private Piece movingPiece;
    private Boolean isNorthsTurn = false;

    GameState() {
    }

    void undoMove() {
        if (commands.isEmpty())return;
        Command undoCommand = commands.pop();
        undoCommand.undo();
        undoneCommands.add(undoCommand);
        GameController.endTurn();
    }

    void redoMove() {
        if (undoneCommands.isEmpty())return;
        Command command = undoneCommands.pop();
        commands.add(command);
        command.execute();
        GameController.endTurn();
    }

    void resetBoard(){
        while (!commands.isEmpty()){
            undoMove();
        }
    }

    void setMovingPiece(Piece movingPiece) {
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

    boolean isYourTurn(Boolean isNorth) {
        return isNorth == isNorthsTurn;
    }

    void endTurn() {
        isNorthsTurn = !isNorthsTurn;
    }
}
