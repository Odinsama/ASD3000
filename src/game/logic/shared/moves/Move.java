package game.logic.shared.moves;

import gui.domain.abstractObjects.Tile;

/**
 * Created by Odin on 4/7/2017.
 */
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
