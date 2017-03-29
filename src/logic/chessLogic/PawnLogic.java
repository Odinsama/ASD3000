package logic.chessLogic;

import gui.domain.concreteObjects.Chess.Pieces.Pawn;
import logic.MoveLogic;


/**
 * Created by Odin on 3/7/2017.
 */
public class PawnLogic extends MoveLogic {

    public PawnLogic(Pawn pawn) {
        super(pawn);
    }

    @Override
    public void getValidMoves() {
        setPosition();
        addMoveSafely(0 , DIR);

        //first move checking if it can move two steps forward
        if (!PIECE.hasMoved && TILES[x][y + DIR].getPiece()==null && TILES[x][y + 2 * DIR].getPiece()==null) {
            moves.add(TILES[x][y + 2* DIR]);
        }
        addCaptureSafely(DIR, DIR);
        addCaptureSafely(-DIR, DIR);
        highlightValidMoves();
    }

    @Override
    protected void highlightValidMoves() {
        moves.stream()
                .filter(this::checkIfEmpty)
                .forEach(this::highlightMove);
        captures.stream()
                .filter(tile-> !checkIfEmpty(tile))
                .forEach(this::highlightCapture);
        moves.clear();
        captures.clear();
    }
}
