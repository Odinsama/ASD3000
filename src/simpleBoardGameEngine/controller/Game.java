package simpleBoardGameEngine.controller;
import simpleBoardGameEngine.coreComponents.Board;
import simpleBoardGameEngine.coreComponents.Piece;
import simpleBoardGameEngine.coreComponents.Tile;

import javax.swing.*;

/**
 * Created by Odin on 1/31/2017.
 * Unless it is poorly made, then it must
 * have been someone else.
 */

//this class is a composite of all the objects needed to run a simple board game
public abstract class Game {

    private Board board;
    private GameState gameState;
    private CommandCenter commandCenter;
    private boolean hasBegun = false;


    private Board startGame(){
        hasBegun = true;
        board = generateBoard();
        board.generatePieces();
        board.setPromotionTiles();
        gameState = new GameState();
        commandCenter = new CommandCenter(gameState, board);
        return board;
    }

    public Board openGame() {
        return hasBegun ? resumeGame() : startGame();
    }

    private Board resumeGame() {
        return board;
    }

    protected abstract Board generateBoard();

    void movePiece(Tile target){
        commandCenter.movePiece(target);
    }

    void capture(Piece target) {
        commandCenter.capture(target);
    }

    void skipCapture(Tile target, Piece enemyPiece) {
        commandCenter.skipCapture(target, enemyPiece);
    }

    void undoMove() {
        gameState.undoMove();
    }

    void redoMove() {
        gameState.redoMove();
    }

    void resetBoard(){
        gameState.resetBoard();
    }

    void setMovingPiece(Piece movingPiece) {
        gameState.setMovingPiece(movingPiece);
    }

    public void clearHighlights() {
        board.clearHighlights();
    }

    public Tile[][] getTiles() {
        return board.getTiles();
    }


    void doubleMove(Tile target, Piece secondPiece, Tile secondTarget) {
        commandCenter.doubleMove(target,secondPiece,secondTarget);
    }

    boolean isYourTurn(Boolean isNorth) {
        return gameState.isYourTurn(isNorth);
    }

    void endTurn() {
        gameState.endTurn();
    }

    Piece getMovingPiece() {
        return gameState.getMovingPiece();
    }

    void northWon(boolean northWon) {
        String gameOverText;
        if (northWon){
            gameOverText = "North won!";
        }else {
            gameOverText = "South won!";
        }
        JOptionPane.showMessageDialog(null, gameOverText);
        resetBoard();

    }
}
