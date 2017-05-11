package simpleBoardGameEngine.controller;

import simpleBoardGameEngine.coreComponents.Board;
import simpleBoardGameEngine.coreComponents.Piece;
import simpleBoardGameEngine.coreComponents.Tile;

/**
 * Created by Odin on 4/7/2017.
 * Unless it is poorly made, then it must
 * have been someone else.
 */

//this class is responsible for instantiating all kinds of game commands
class CommandCenter {

    private final GameState gameState;
    private final Board board;

    CommandCenter(GameState gameState, Board board) {
        this.gameState = gameState;
        this.board = board;
    }

    void movePiece(Tile target){
        MoveCommand moveCommand = new MoveCommand(board, gameState.getMovingPiece(), target);
        gameState.addCommand(moveCommand);
        gameState.clearUndoneCommands();
        moveCommand.execute();
        GameController.endTurn();
    }

    void capture(Piece target) {
        CaptureCommand captureCommand = new CaptureCommand(board, gameState.getMovingPiece(), target);
        gameState.addCommand(captureCommand);
        gameState.clearUndoneCommands();
        captureCommand.execute();
        GameController.endTurn();
    }

    void skipCapture(Tile target, Piece enemyPiece) {
        CaptureCommand captureCommand = new CaptureCommand(board, gameState.getMovingPiece(), enemyPiece);
        Tile capturedTile = (Tile) enemyPiece.getParent();
        MoveCommand moveCommand = new MoveCommand(board, gameState.getMovingPiece(), capturedTile, target);
        SkipCaptureCommand skipCaptureCommand = new SkipCaptureCommand(moveCommand, captureCommand);
        gameState.addCommand(skipCaptureCommand);
        gameState.clearUndoneCommands();
        skipCaptureCommand.execute();
        GameController.endTurn();
    }

    void doubleMove(Tile target, Piece secondPiece, Tile secondTarget) {
        DoubleMoveCommand doubleMoveCommand = new DoubleMoveCommand(board, target, gameState.getMovingPiece(), secondPiece, secondTarget);
        gameState.addCommand(doubleMoveCommand);
        gameState.clearUndoneCommands();
        doubleMoveCommand.execute();
        GameController.endTurn();
    }
}
