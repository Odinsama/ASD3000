package simpleBoardGameEngine.coreComponents;

import simpleBoardGameEngine.controller.GameController;
import simpleBoardGameEngine.moves.Move;
import simpleBoardGameEngine.moves.SkipCaptureMove;
import simpleBoardGameEngine.utils.IPromotable;
import simpleBoardGameEngine.utils.IWinCondition;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Odin on 1/31/2017.
 * Unless it is poorly made, then it must
 * have been someone else.
 */
public class Tile extends JPanel {

    private Piece piece;
    private boolean isHighlighted = false, isPromotionTile = false;
    private Dimension tilePos;
    private Color highlightColor;
    private Move possibleMove;
    private boolean isNorth;

    public Tile(Color bg){
        setLayout(new BorderLayout());
        setBackground(bg);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                if (possibleMove == null) return;
                    possibleMove.execute();
                    if (possibleMove instanceof SkipCaptureMove){
                        Piece enemy = ((SkipCaptureMove) possibleMove).getEnemyPiece();
                        if (enemy instanceof IWinCondition){
                            ((IWinCondition) enemy).checkWinConditions(!enemy.isNorth());
                        }
                    }
                if (isPromotionTile && GameController.getMovingPiece() instanceof IPromotable){
                    Piece piece = GameController.getMovingPiece();
                    if (piece.isNorth() == isNorth){
                        return;
                    }else if (piece.isPromoted()){
                        return;
                    }else {
                        ((IPromotable) piece).promote();
                    }
                    }
                    GameController.clearHighlights();
            }
        });
    }

    public void setPossibleMove(Move possibleMove) {
        this.possibleMove = possibleMove;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
        if (piece != null) {
            add(piece);
            revalidate();
            repaint();
        }
    }

    public Piece getPiece() {
        return piece;
    }

    public void highlight(Color color){
        isHighlighted = true;
        highlightColor = color;
        repaint();
    }

    public void setPromotionTile(boolean isNorth) {
        this.isPromotionTile = true;
        this.isNorth = isNorth;
    }

    void removeHighlight(){
        isHighlighted = false;
        possibleMove = null;
        repaint();
    }

    public Dimension getPos() {
        return tilePos;
    }

    void setPos(int x, int y) {
        this.tilePos = new Dimension(x,y);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        if (isHighlighted) {
            g.setColor(highlightColor);
            ((Graphics2D) g).setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.30f));
            g.fillRect(0, 0, getWidth(), getHeight());
        }
        g.setColor(Color.black);
        g.drawRect(0,0,getWidth()-1,getHeight()-1);
    }

    boolean isHighlighted() {
        return isHighlighted;
    }

    public boolean isOccupied() {
        return piece != null;
    }


}
