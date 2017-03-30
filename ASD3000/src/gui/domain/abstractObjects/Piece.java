package gui.domain.abstractObjects;

import controller.GameController;
import game.MoveLogic;
import gui.domain.concreteObjects.Tile;
import names.PieceType;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Odin on 1/31/2017.
 */
public abstract class Piece extends JComponent {

    private final Boolean isNorth;
    protected Image image;
    private PieceType pieceType;
    public boolean hasMoved = false;
    protected MoveLogic moveLogic;

    //within the anonymous mousePressed event
    // "this" refers to the mouseListener not the PIECE
    private Piece piece = this;

    public Piece(Boolean isNorth) {
        this.isNorth = isNorth;
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e){
                super.mousePressed(e);
                if (GameController.isYourTurn(isNorth)) {
                    GameController.clearHighlights();
                    moveLogic.getValidMoves();
                    GameController.setOrigin(piece);
                }
                else if (captureIsValid()){
                    GameController.capture(piece);
                    GameController.clearHighlights();
                }
            }
        });
    }

    private boolean captureIsValid() {
        Tile parentTile = (Tile) getParent();
        return parentTile.isHighlighted();
    }


    public PieceType getPieceType(){
        return pieceType;
    }

    protected void setPieceType(PieceType piecetype){
        this.pieceType = piecetype;
    }

    public boolean isNorth() {
        return isNorth;
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(image,0,0, getWidth(),getHeight(),null);

    }

    void setHasMoved(){
        hasMoved = true;
    }

    protected boolean hasMoved(){
        return hasMoved;
    }
}
