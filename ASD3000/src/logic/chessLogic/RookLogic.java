package game.logic.chess;

import game.MoveLogic;
import gui.domain.concreteObjects.chess.Pieces.Rook;

/**
 * Created by Odin on 3/26/2017.
 */
public class RookLogic extends MoveLogic {
    public RookLogic(Rook rook) {
        super(rook);
    }

    @Override
    public void getValidMoves() {
        setPosition();
        //moves going up the board
        getValidMovesSafely(0, -1);
        //down
        getValidMovesSafely(0, +1);
        //left
        getValidMovesSafely(-1, 0);
        //right
        getValidMovesSafely(+1, 0);
        moves.forEach(this::highlightMove);
        moves.clear();
        captures.forEach(this::highlightCapture);
        captures.clear();
    }

    //if this safe method hits an array exception the
    // program will just move on to the next direction
    private void getValidMovesSafely(int xIncrement, int yIncrement) {
        try{
            //start the sequence one tile away from the
            // origin so it does not check itself as a valid move
            x += xIncrement;
            y += yIncrement;
            while (TILES[x][y].getPiece() == null) {
                TILES[x][y]);
                x += xIncrement;
                y += yIncrement;
            }
        }catch (ArrayIndexOutOfBoundsException ignored){}
        finally {
            try{
                if (TILES[x][y].getPiece() != null){
                    captures.add(TILES[x][y]);
                }
            }catch (ArrayIndexOutOfBoundsException ignored){}
            //reset x and y to the original position
            setPosition();
        }
    }
}
