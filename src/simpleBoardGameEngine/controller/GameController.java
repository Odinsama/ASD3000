package simpleBoardGameEngine.controller;

import simpleBoardGameEngine.coreComponents.Piece;
import simpleBoardGameEngine.coreComponents.Tile;

/**
 * Created by Odin on 3/13/2017.
 * Unless it is poorly made, then it must
 * have been someone else.
 */
public class GameController {

    private GameController(){}

    private static Game game;

    public static void setOrigin(Piece origin){
        game.setMovingPiece(origin);
    }

    public static void movePiece(Tile target) {
        game.movePiece(target);
    }

    public static void undoMove() {
        game.undoMove();
    }

    public static void redoMove() {
        game.redoMove();
    }

    public static void clearHighlights() {
        game.clearHighlights();
    }

    public static void initGame(Game game) {
        GameController.game = game;
    }

    public static boolean isYourTurn(Boolean isNorth) {
        return game.isYourTurn(isNorth);
    }

    public static void capture(Piece piece) {
        game.capture(piece);
    }

    public static Tile[][] getTiles() {
        return game.getTiles();
    }

    public static void resetBoard() {
        game.resetBoard();
    }

    public static void skipCapture(Tile tile, Piece enemyPiece) {
        game.skipCapture(tile, enemyPiece);
    }

    static void endTurn() {
        game.endTurn();
    }

    public static void doubleMove(Tile target, Piece secondPiece, Tile secondTarget) {
        game.doubleMove(target, secondPiece, secondTarget);
    }

    public static Piece getMovingPiece() {
        return game.getMovingPiece();
    }

    public static void gameOver(boolean northWon) {
        game.northWon(northWon);
    }
}
