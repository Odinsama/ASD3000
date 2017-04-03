package gui.domain.abstractObjects;

import game.controller.GameController;
import game.logic.MoveLogic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Odin on 1/31/2017.
 */
public abstract class Piece extends JComponent {

    private final Boolean isNorth;
    protected Image image;
    public int movesMade = 0;
    protected MoveLogic moveLogic;

    //within the anonymous mousePressed event
    // "this" refers to the mouseListener not the PIECE
    private Piece piece = this;

    protected Piece(Boolean isNorth) {
        this.isNorth = isNorth;
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e){
                super.mousePressed(e);
                if (GameController.isYourTurn(isNorth)) {
                    GameController.clearHighlights();
                    moveLogic.setValidMoves();
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

    public boolean isNorth() {
        return isNorth;
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(image,0,0, getWidth(),getHeight(),null);

    }

    public void setMovesMade(int increment){
        movesMade+=increment;
    }

    public int getMovesMade(){
        return movesMade;
    }
}
