package gui.domain.concreteObjects.shogi;

import game.controller.GameController;
import gui.domain.abstractObjects.Tile;

import java.awt.*;

/**
 * Created by Odin on 4/3/2017.
 */
public class ShogiTile extends Tile {
    public ShogiTile(Color tileColor) {
        super(tileColor);
    }

    @Override
    protected void specialCapture(Tile tile) {

    }

    @Override
    protected void specialMove(Tile tile) {

    }

    @Override
    protected void normalMove(Tile tile) {
        GameController.movePiece(tile);
    }
}
