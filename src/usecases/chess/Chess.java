package usecases.chess;

import simpleBoardGameEngine.controller.Game;
import simpleBoardGameEngine.coreComponents.Board;


import java.awt.*;

/**
 * Created by Odin on 2/14/2017.
 * Unless it is poorly made, then it must
 * have been someone else.
 */
public class Chess extends Game {
    @Override
    public Board generateBoard() {
        return new ChessBoard(new Dimension(8,8));
    }

}
