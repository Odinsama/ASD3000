package gui.domain.concreteObjects.shogi;

import gui.domain.abstractObjects.Board;

import java.awt.*;

/**
 * Created by Odin on 4/2/2017.
 */
public class ShogiBoard extends Board {
    public ShogiBoard(Dimension boardSize, Color tileColor1, Color tileColor2) {
        super(boardSize, tileColor1, tileColor2);
    }

    @Override
    public void generatePieces() {

    }
}
