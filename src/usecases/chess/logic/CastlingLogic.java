package usecases.chess.logic;

import simpleBoardGameEngine.moves.DoubleMove;
import simpleBoardGameEngine.moves.MoveLogic;
import simpleBoardGameEngine.coreComponents.Piece;
import usecases.chess.Pieces.Rook;

/**
 * Created by Odin on 3/29/2017.
 * Unless it is poorly made, then it must
 * have been someone else.
 */
public class CastlingLogic extends MoveLogic {
    public CastlingLogic(Piece king) {
        super(king);
    }

    @Override
    public void setValidMoves() {
        setPosition();
        if (PIECE.getMovesMade() != 0)return;
        if (!TILES[x-DIR][y].isOccupied() && !TILES[x-DIR*2][y].isOccupied() && TILES[x-DIR*3][y].getPiece() instanceof Rook){
            new DoubleMove(TILES[x-DIR*2][y],TILES[x-DIR][y],TILES[x-DIR*3][y].getPiece());
        }
        if (!TILES[x+DIR][y].isOccupied() && !TILES[x+DIR*2][y].isOccupied() && !TILES[x+DIR*3][y].isOccupied() && TILES[x+DIR*4][y].getPiece() instanceof Rook){
            new DoubleMove(TILES[x+DIR*2][y],TILES[x+DIR][y],TILES[x+DIR*4][y].getPiece());
        }
    }
}
