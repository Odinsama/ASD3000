package usecases.shogi;

import simpleBoardGameEngine.controller.Game;
import simpleBoardGameEngine.coreComponents.Board;

import java.awt.*;

/**
 * Created by Odin on 4/2/2017.
 * Unless it is poorly made, then it must
 * have been someone else.
 */
public class Shogi extends Game {
    @Override
    protected Board generateBoard() {
        Color wooden = new Color(202,195,142);
        return new ShogiBoard(new Dimension(9,9), wooden, wooden);
    }

}
