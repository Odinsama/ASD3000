package logic;

import controller.GameController;
import gui.domain.abstractObjects.Piece;
import gui.domain.concreteObjects.Tile;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Odin on 2/16/2017.
 */
public abstract class MoveLogic {

    protected final Piece PIECE;
    protected final int DIR;
    protected final int COLUMNS, ROWS;
    protected final Tile[][] TILES;
    protected int x,y;
    protected List<Tile> moves = new ArrayList<>();
    protected List<Tile> captures = new ArrayList<>();

    protected MoveLogic(Piece piece){
        this.PIECE = piece;
        DIR = piece.isNorth() ? 1 : -1;
        TILES = GameController.getTiles();
        COLUMNS = TILES.length;
        ROWS = TILES[0].length;
    }

    protected void setPosition(){
        x = ((Tile) PIECE.getParent()).getPos().width;
        y = ((Tile) PIECE.getParent()).getPos().height;
    }

    public abstract void getValidMoves();


    protected boolean checkIfEmpty(Tile tile) {
        return tile.getPiece()==null;
    }

    protected void highlightMove(Tile tile){
        tile.highlight(Color.cyan);
    }

    protected void highlightCapture(Tile tile){
        tile.highlight(Color.orange);
    }

}
