package game.controller;

import gui.domain.abstractObjects.Board;
import gui.domain.abstractObjects.Piece;
import gui.domain.abstractObjects.Tile;

/**
 * Created by Odin on 4/7/2017.
 */

//this class is responsible for instantiating all kinds of game commands
public class CommandCenter {

    private final GameState gameState;
    private final Board board;

    public CommandCenter(GameState gameState, Board board) {
        this.gameState = gameState;
        this.board = board;
    }

    public void movePiece(Tile target){
        MoveCommand moveCommand = new MoveCommand(board, gameState.getMovingPiece(), target);
        gameState.addCommand(moveCommand);
        gameState.clearUndoneCommands();
        moveCommand.execute();
        GameController.endTurn();
    }

    public void capture(Piece target) {
        CaptureCommand captureCommand = new CaptureCommand(board, gameState.getMovingPiece(), target);
        gameState.addCommand(captureCommand);
        gameState.clearUndoneCommands();
        captureCommand.execute();
        GameController.endTurn();
    }

    public void skipCapture(Tile target, Piece enemyPiece) {
        CaptureCommand captureCommand = new CaptureCommand(board, gameState.getMovingPiece(), enemyPiece);
        Tile capturedTile = (Tile) enemyPiece.getParent();
        MoveCommand moveCommand = new MoveCommand(board, gameState.getMovingPiece(), capturedTile, target);
        SkipCaptureCommand skipCaptureCommand = new SkipCaptureCommand(moveCommand, captureCommand);
        gameState.addCommand(skipCaptureCommand);
        gameState.clearUndoneCommands();
        skipCaptureCommand.execute();
        GameController.endTurn();
    }

    public void doubleMove(Tile target, Piece secondPiece, Tile secondTarget) {
        DoubleMoveCommand doubleMoveCommand = new DoubleMoveCommand(board, target, gameState.getMovingPiece(), secondPiece, secondTarget);
        gameState.addCommand(doubleMoveCommand);
        gameState.clearUndoneCommands();
        doubleMoveCommand.execute();
        GameController.endTurn();
    }
}
