package game.logic.chess;

import game.logic.shared.moves.DoubleMove;
import game.logic.shared.moves.MoveLogic;
import gui.domain.abstractObjects.Piece;
import gui.domain.concreteObjects.chess.Pieces.Rook;

/**
 * Created by Odin on 3/29/2017.
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
