package gui.domain.abstractObjects;

import game.controller.GameController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Odin on 1/31/2017.
 */
public abstract class Tile extends JPanel {

    private Piece piece;
    private Boolean isHighlighted = false;
    private Dimension tilePos;
    private Tile tile = this;
    private Color highlightColor;
    private boolean hasSpecialHighlight;
    private boolean hasSpecialCaptureHighlight;

    public Tile(Color bg){
        setLayout(new BorderLayout());
        setBackground(bg);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                if (isHighlighted){
                    normalMove(tile);
                }
                if (hasSpecialHighlight){
                    specialMove(tile);
                }
                if (hasSpecialCaptureHighlight){
                    specialCapture(tile);
                }
                GameController.clearHighlights();

            }
        });
    }

    protected abstract void specialCapture(Tile tile);

    protected abstract void specialMove(Tile tile);

    protected abstract void normalMove(Tile tile);

    public void setPiece(Piece piece) {
        this.piece = piece;
        if (piece!= null){
            add(piece);
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
    public void specialHighlight(Color color) {
        hasSpecialHighlight = true;
        highlightColor = color;
        repaint();
    }

    public void specialCaptureHighlight(Color color) {
        hasSpecialCaptureHighlight = true;
        highlightColor = color;
        repaint();
    }

    void removeHighlight(){
        hasSpecialCaptureHighlight = false;
        hasSpecialHighlight = false;
        isHighlighted = false;
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
        if (isHighlighted || hasSpecialHighlight || hasSpecialCaptureHighlight) {
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
