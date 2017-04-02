package game.logic;

import game.GameController;
import gui.domain.abstractObjects.Piece;
import gui.domain.concreteObjects.Tile;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Odin on 2/16/2017.
 */
public abstract class MoveLogic {

    protected final Piece PIECE;
    protected final int DIR;
    protected final int DOWN = 1, UP = -1, RIGHT = 1, LEFT = -1, NONE = 0;
    protected final Tile[][] TILES;
    protected int x,y;
    protected List<Tile> moves = new ArrayList<>();
    protected List<Tile> captures = new ArrayList<>();

    protected MoveLogic(Piece piece){
        this.PIECE = piece;
        DIR = piece.isNorth() ? DOWN : UP;
        TILES = GameController.getTiles();
    }

    protected void setPosition(){
        x = ((Tile) PIECE.getParent()).getPos().width;
        y = ((Tile) PIECE.getParent()).getPos().height;
    }

    public abstract void setValidMoves();

    protected void highlightMove(Tile tile){
        tile.highlight(Color.cyan);
    }

    protected void highlightCapture(Tile tile){
        Piece highlightPiece = tile.getPiece();
        if (highlightPiece.isNorth() != PIECE.isNorth()) {
            tile.highlight(Color.orange);
        }
    }

    //if this safe method hits an array exception the
    // program will just move on to the next direction
    protected void setIncrementalDirectionalMovesSafely(int xIncrement, int yIncrement) {
        try{
            //start the sequence one tile away from the
            // origin so it does not check itself as a valid move
            x += xIncrement;
            y += yIncrement;
            while (!TILES[x][y].isOccupied()) {
                moves.add(TILES[x][y]);
                x += xIncrement;
                y += yIncrement;
            }
        }catch (ArrayIndexOutOfBoundsException ignored){}
        finally {
            try{
                if (TILES[x][y].isOccupied()){
                    captures.add(TILES[x][y]);
                }
            }catch (ArrayIndexOutOfBoundsException ignored){}
            //reset x and y to the original position
            setPosition();
        }
    }

    protected void highlightValidMoves() {
        moves.forEach(this::highlightMove);
        moves.clear();
        captures.forEach(this::highlightCapture);
        captures.clear();
    }
    protected void sortMoveOrCaptureSafely(int xIncrement, int yIncrement){
        try {
            if (!TILES[x + xIncrement][y + yIncrement].isOccupied()) {
                addMoveSafely(xIncrement, yIncrement);
            } else addCaptureSafely(xIncrement, yIncrement);
        }catch (ArrayIndexOutOfBoundsException ignored){}
    }

    protected void addMoveSafely(int xIncrement, int yIncrement) {
        try{
            if (!TILES[x + xIncrement][y + yIncrement].isOccupied()) {
                moves.add(TILES[x + xIncrement][y + yIncrement]);
            }
        }catch (ArrayIndexOutOfBoundsException ignored){
        }
    }

    protected void addCaptureSafely(int xIncrement, int yIncrement) {
        try{
            if (TILES[x + xIncrement][y + yIncrement].getPiece() != null)
            captures.add(TILES[x + xIncrement][y + yIncrement]);
        }catch (ArrayIndexOutOfBoundsException ignored){}
    }


}
