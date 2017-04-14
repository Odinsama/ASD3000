package game.collection;

import game.controller.*;
import gui.domain.abstractObjects.Board;
import gui.domain.abstractObjects.Piece;
import gui.domain.abstractObjects.Tile;
import gui.domain.utils.IPromotable;

import java.awt.*;
import java.util.Stack;

/**
 * Created by Odin on 1/31/2017.
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

    public void movePiece(Tile target){
        commandCenter.movePiece(target);
    }

    public void capture(Piece target) {
        commandCenter.capture(target);
    }

    public void skipCapture(Tile target, Piece enemyPiece) {
        commandCenter.skipCapture(target, enemyPiece);
    }

    public void undoMove() {
        gameState.undoMove();
    }

    public void redoMove() {
        gameState.redoMove();
    }

    public void resetBoard(){
        gameState.resetBoard();
    }

    public void setMovingPiece(Piece movingPiece) {
        gameState.setMovingPiece(movingPiece);
    }

    public void clearHighlights() {
        board.clearHighlights();
    }

    public Tile[][] getTiles() {
        return board.getTiles();
    }

    public abstract void promote(IPromotable piece);

    public void doubleMove(Tile target, Piece secondPiece, Tile secondTarget) {
        commandCenter.doubleMove(target,secondPiece,secondTarget);
    }

    public boolean isYourTurn(Boolean isNorth) {
        return gameState.isYourTurn(isNorth);
    }

    public void endTurn() {
        gameState.endTurn();
    }
}
