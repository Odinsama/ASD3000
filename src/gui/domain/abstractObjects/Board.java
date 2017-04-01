package gui.domain.abstractObjects;

import gui.domain.concreteObjects.Tile;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Odin on 1/31/2017.
 */
public abstract class Board extends JPanel{

    protected final Tile[][] TILES;
    protected final int COLUMNS, ROWS;

    protected Board(Dimension boardSize){
        COLUMNS = boardSize.width;
        ROWS = boardSize.height;
        TILES = new Tile[COLUMNS][ROWS];
        setLayout(new GridLayout(ROWS, COLUMNS));
        for (int y = 0; y<COLUMNS; y++){
            for (int x = 0; x<ROWS; x++){
                if ((y%2==0 && x%2==0) || y%2==x%2){
                    Tile tile = new Tile(Color.getColor("#e8eff9"));
                    add(tile);
                    tile.setPos(x, y);
                    TILES[x][y]=tile;
                }else {Tile tile = new Tile(Color.LIGHT_GRAY);
                    add(tile);
                    tile.setPos(x,y);
                    TILES[x][y]=tile;
                }
            }
        }


    }

    public abstract void generatePieces();


    public void movePiece(Tile target, Piece origin, Tile oldTile){
        //removing the pointer to the Piece for future validation purposes
        //otherwise a check to see if the tile has a PIECE will not return null
        oldTile.setPiece(null);
        target.setPiece(origin);
        origin.setHasMoved();
    }

    public void capturePiece(Tile target, Piece captured, Piece origin, Tile oldTile){
        oldTile.setPiece(null);
        target.remove(captured);
        target.setPiece(origin);
        origin.setHasMoved();
    }

    public void undoCapture(Tile target, Piece captured, Tile oldTile, Piece origin) {
        target.add(captured);
        System.out.println(oldTile.getPos());
        oldTile.add(origin);
    }

    public void clearHighlights() {
        for (Tile[] tileArray: TILES) {
            for (Tile tile:tileArray) {
                tile.removeHighlight();
            }
        }
    }

    public Tile[][] getTiles() {
        return TILES;
    }
}
