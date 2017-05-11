package usecases.chess.logic;

import game.MoveLogic;
import usecases.chess.Pieces.Knight;

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


        //filters captures from tempMoves
        moves.stream()
                .filter(e-> !checkIfEmpty(e))
                .forEach(e-> captures.add(e));
        //highlights tempMoves
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
            TILES[x + xIncrement][y + yIncrement]);
        }catch (ArrayIndexOutOfBoundsException ignored){}
    }


}
