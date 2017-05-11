package usecases.checkers;

import simpleBoardGameEngine.controller.Game;
import simpleBoardGameEngine.coreComponents.Board;

import java.awt.*;

/**
 * Created by Odin on 4/1/2017.
 * Unless it is poorly made, then it must
 * have been someone else.
 */
public class Checkers extends Game {
    @Override
    protected Board generateBoard() {
        return new CheckersBoard(new Dimension(8,8));
    }

}
