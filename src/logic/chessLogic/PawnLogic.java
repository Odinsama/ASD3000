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
        moves.add(TILES[x][y + DIR]);
        if (!PIECE.hasMoved) {
            moves.add(TILES[x][y + 2* DIR]);
        }
        if (x+ DIR !=-1 && x+ DIR !=8){
            captures.add(TILES[x+ DIR][y+ DIR]);
        }
        if (x- DIR !=-1 && x- DIR !=8) {
            captures.add(TILES[x - DIR][y + DIR]);
        }
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
