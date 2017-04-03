package gui.domain.concreteObjects.checkers;

import game.controller.GameController;
import gui.domain.abstractObjects.Tile;

import java.awt.*;

/**
 * Created by Odin on 4/3/2017.
 */
public class CheckersTile extends Tile {
    public CheckersTile(Color tileColor) {
        super(tileColor);
    }

    @Override
    protected void specialCapture(Tile tile) {
        GameController.skipCapture(tile);
    }

    @Override
    protected void specialMove(Tile tile) {

    }

    @Override
    protected void normalMove(Tile tile) {
        GameController.movePiece(tile);
    }
}
