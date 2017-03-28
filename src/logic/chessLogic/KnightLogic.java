package logic.chessLogic;

import gui.domain.concreteObjects.Chess.Pieces.Knight;
import logic.MoveLogic;

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
        if (x- DIR <8 && x- DIR >=0 && y+ DIR *2<8 && y+ DIR *2>=0){
            moves.add(TILES[x- DIR][y+ DIR *2]);
        }
        if (x+ DIR <8 && x+ DIR >=0 && y+ DIR *2<8 && y+ DIR *2>=0){
            moves.add(TILES[x+ DIR][y+ DIR *2]);
        }
        if (x- DIR <8 && x- DIR >=0 && y- DIR *2<8 && y- DIR *2>=0){
            moves.add(TILES[x- DIR][y- DIR *2]);
        }
        if (x+ DIR <8 && x+ DIR >=0 && y- DIR *2<8 && y- DIR *2>=0){
            moves.add(TILES[x+ DIR][y- DIR *2]);
        }
        if (x- DIR *2 <8 && x- DIR *2>=0 && y+ DIR <8 && y+ DIR >=0){
            moves.add(TILES[x- DIR *2][y+ DIR]);
        }
        if (x+ DIR *2 <8 && x+ DIR *2 >=0 && y+ DIR <8 && y+ DIR >=0){
            moves.add(TILES[x+ DIR *2][y+ DIR]);
        }
        if (x- DIR *2 <8 && x- DIR *2 >=0 && y- DIR <8 && y- DIR >=0){
            moves.add(TILES[x- DIR *2][y- DIR]);
        }
        if (x+ DIR *2 <8 && x+ DIR *2>=0 && y- DIR <8 && y- DIR >=0){
            moves.add(TILES[x+ DIR *2][y- DIR]);
        }

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

}
