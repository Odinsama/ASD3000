package game.logic.chess;

import game.controller.GameController;
import game.logic.SkipCaptureMove;
import gui.domain.concreteObjects.chess.Pieces.Pawn;
import game.logic.MoveLogic;
import gui.domain.abstractObjects.Tile;

import java.awt.*;


/**
 * Created by Odin on 3/7/2017.
 */
public class PawnLogic extends MoveLogic {

    public PawnLogic(Pawn pawn) {
        super(pawn);
    }

    @Override
    public void setValidMoves() {
        setPosition();
        addMoveSafely(NONE , DIR);
        if (PIECE.getMovesMade() == 0 && !TILES[x][y + DIR].isOccupied()) {
            addMoveSafely(0,DIR*2);
        }
        addCaptureSafely(LEFT, DIR);
        addCaptureSafely(RIGHT, DIR);
        addUnPassantSafely(LEFT);
        addUnPassantSafely(RIGHT);
    }

    private void addUnPassantSafely(int xIncrement) {
        try {
            //is the piece on it's proper row?
            if (PIECE.isNorth() && y == 4 || !PIECE.isNorth() && y == 3) {
                //is the tile next to it occupied?
                if (TILES[x+xIncrement][y].isOccupied()){
                    //is it a pawn?
                    if (TILES[x+xIncrement][y].getPiece().getClass() == Pawn.class){
                        Pawn enemyPawn = (Pawn) TILES[x+xIncrement][y].getPiece();
                        //is it an enemy?
                        if (enemyPawn.isNorth() != PIECE.isNorth()){
                            //did it do a double move to get there?
                            if (enemyPawn.getMovesMade()==1){
                                new SkipCaptureMove(TILES[x+xIncrement][y+DIR], enemyPawn);
                            }
                        }
                    }
                }
            }
        }catch (ArrayIndexOutOfBoundsException ignored){}
    }
}
