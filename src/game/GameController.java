package game;

import gui.domain.abstractObjects.Piece;
import gui.domain.concreteObjects.Tile;

/**
 * Created by Odin on 3/13/2017.
 */
public class GameController {
    
    private static Game game;
    
    public static void setOrigin(Piece origin){
        game.setOrigin(origin);
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
        return isNorth == game.isNorthsTurn();
    }

    public static void capture(Piece piece) {
        game.capture(piece);
    }

    public static Tile[][] getTiles() {
        return game.getTiles();
    }
}
