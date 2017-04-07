package game.logic.shared.moves;

import game.controller.GameController;
import gui.domain.abstractObjects.Piece;
import gui.domain.abstractObjects.Tile;

/**
 * Created by Odin on 2/16/2017.
 */
public abstract class MoveLogic {

    protected final Piece PIECE;
    protected final int DIR;
    protected final int DOWN = 1, UP = -1, RIGHT = 1, LEFT = -1, NONE = 0;
    protected final Tile[][] TILES;
    protected int x,y;


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

    //if this safe method hits an array exception the
    // program will just move on to the next direction
    protected void setIncrementalDirectionalMovesSafely(int xIncrement, int yIncrement) {
        try{
            //start the sequence one tile away from the
            // origin so it does not check itself as a valid move
            x += xIncrement;
            y += yIncrement;
            while (!TILES[x][y].isOccupied()) {
                new SimpleMove(TILES[x][y]);
                x += xIncrement;
                y += yIncrement;
            }
        }catch (ArrayIndexOutOfBoundsException ignored){}
        finally {
            try{
                if (TILES[x][y].isOccupied()){
                    if (TILES[x][y].getPiece().isNorth() != PIECE.isNorth()) {
                        new CaptureMove(TILES[x][y]);
                    }
                }
            }catch (ArrayIndexOutOfBoundsException ignored){}
            //reset x and y to the original position
            setPosition();
        }
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
                new SimpleMove(TILES[x + xIncrement][y + yIncrement]);
            }
        }catch (ArrayIndexOutOfBoundsException ignored){
        }
    }

    protected void addCaptureSafely(int xIncrement, int yIncrement) {
        try{
            if (TILES[x + xIncrement][y + yIncrement].getPiece() != null)
                if (TILES[x + xIncrement][y + yIncrement].getPiece().isNorth() != PIECE.isNorth()) {
                    new CaptureMove(TILES[x + xIncrement][y + yIncrement]);
                }
        }catch (ArrayIndexOutOfBoundsException ignored){}
    }

    protected void addSkipCaptureSafely(int xIncrement, int yIncrement){
        try{
            if (TILES[x + xIncrement][y + yIncrement].isOccupied() && !TILES[x + xIncrement*2][y + yIncrement*2].isOccupied())
                if (TILES[x + xIncrement][y + yIncrement].getPiece().isNorth() != PIECE.isNorth()){
                new SkipCaptureMove(TILES[x + xIncrement*2][y + yIncrement*2], TILES[x + xIncrement][y + yIncrement].getPiece());
                }
        }catch (ArrayIndexOutOfBoundsException ignored){}
    }


}
