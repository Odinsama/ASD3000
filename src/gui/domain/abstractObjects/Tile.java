package gui.domain.abstractObjects;

import game.controller.GameController;
import game.logic.Move;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Odin on 1/31/2017.
 */
public class Tile extends JPanel {

    private Piece piece;
    private Boolean isHighlighted = false;
    private Dimension tilePos;
    private Color highlightColor;
    private Move possibleMove;

    public Tile(Color bg){
        setLayout(new BorderLayout());
        setBackground(bg);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                if (possibleMove == null) return;
                    possibleMove.execute();
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
