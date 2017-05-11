package simpleBoardGameEngine.moves;

import simpleBoardGameEngine.coreComponents.Tile;

/**
 * Created by Odin on 4/7/2017.
 * Unless it is poorly made, then it must
 * have been someone else.
 */

//Moves highlight a tile, marking it is a legal move and readies
// the logic that would fire if the highlighted tile is clicked on.
public abstract class Move {


    final Tile target;

    Move(Tile target){
        this.target = target;
        highlightTarget();
        target.setPossibleMove(this);
    }

    public abstract void execute();

    protected abstract void highlightTarget();
}
