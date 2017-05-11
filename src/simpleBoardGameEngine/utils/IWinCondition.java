package simpleBoardGameEngine.utils;

import simpleBoardGameEngine.controller.GameController;

/**
 * Created by odins on 5/11/2017.
 * Unless it is poorly made, then it must
 * have been someone else.
 */

public interface IWinCondition {
    //the default method applies when there is only one win condition,
    // if there are more you must override this.
    default void checkWinConditions(boolean northWon){
        GameController.gameOver(northWon);
    }
}
