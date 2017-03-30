package game.logic.chess;

import game.MoveLogic;
import gui.domain.concreteObjects.Chess.Pieces.Knight;

/**
 * Created by Odin on 3/11/2017.
 */
public class KnightLogic extends MoveLogic {
    public KnightLogic(Knight knight) {
        super(knight);
    }

    @Override
    public void getValidMoves() {
        setPosition();
        addMoveSafely(-1, +2);
        addMoveSafely(+1, +2);
        addMoveSafely(-1, -2);
        addMoveSafely(+1, -2);
        addMoveSafely(-2, +1);
        addMoveSafely(+2, +1);
        addMoveSafely(-2, -1);
        addMoveSafely(+2, -1);


        //filters captures from moves
        moves.stream()
                .filter(e-> !checkIfEmpty(e))
                .forEach(e-> captures.add(e));
        //highlights moves
        moves.stream()
                .filter(this::checkIfEmpty)
                .forEach(this::highlightMove);
        moves.clear();
        //highlights captures
        captures.forEach(this::highlightCapture);
        captures.clear();

    }

    private void addMoveSafely(int xIncrement, int yIncrement) {
        try{
            moves.add(TILES[x + xIncrement][y + yIncrement]);
        }catch (ArrayIndexOutOfBoundsException ignored){}
    }


}
