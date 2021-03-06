package simpleBoardGameEngine.coreComponents;

import simpleBoardGameEngine.controller.GameController;
import simpleBoardGameEngine.moves.MoveLogic;
import simpleBoardGameEngine.utils.IPromotable;
import simpleBoardGameEngine.utils.IWinCondition;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Odin on 1/31/2017.
 * Unless it is poorly made, then it must
 * have been someone else.
 */
public abstract class Piece extends JComponent {

    private final Boolean isNorth;
    protected Image pieceImage;
    private int movesMade = 0;
    protected final List<MoveLogic> moveLogicList = new ArrayList<>();

    //within the anonymous mousePressed event
    // "this" refers to the mouseListener not the PIECE
    private final Piece piece = this;

    protected Piece(Boolean isNorth) {
        this.isNorth = isNorth;
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e){
                super.mousePressed(e);
                if (GameController.isYourTurn(isNorth)) {
                    GameController.clearHighlights();
                    GameController.setOrigin(piece);
                    moveLogicList.forEach(MoveLogic::setValidMoves);
                }
                else if (captureIsValid()){
                    GameController.capture(piece);
                    if (piece instanceof IWinCondition){
                        ((IWinCondition) piece).checkWinConditions(!piece.isNorth());
                    }
                    Piece movingPiece = GameController.getMovingPiece();
                    if (movingPiece instanceof IPromotable){
                        Tile parent = (Tile) piece.getParent();
                        if (parent.isPromotionTile() && parent.isNorth() != movingPiece.isNorth()){
                            ((IPromotable) movingPiece).promote();
                        }
                    }
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
        g.drawImage(pieceImage,0,0, getWidth(),getHeight(),null);

    }

    public void setMovesMade(int increment){
        movesMade+=increment;
    }

    public int getMovesMade(){
        return movesMade;
    }

}
