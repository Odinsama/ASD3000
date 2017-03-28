package gui.domain.concreteObjects;

import controller.GameController;
import gui.domain.abstractObjects.Piece;

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
    private Tile tile = this;
    private Color highlightColor;

    public Tile(Color bg){
        setLayout(new BorderLayout());
        setBackground(bg);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                System.out.println(getPos());
                if (isHighlighted){
                    GameController.movePiece(tile);
                    GameController.clearHighlights();
                }
            }
        });
    }

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

    public void removeHighlight(){
        isHighlighted = false;
        repaint();
    }

    public Dimension getPos() {
        return tilePos;
    }

    public void setPos(int x, int y) {
        this.tilePos = new Dimension(x,y);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        if (isHighlighted) {
            g.setColor(highlightColor);
            ((Graphics2D) g).setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.20f));
            g.fillRect(0, 0, getWidth(), getHeight());
        }
    }

    public boolean isHighlighted() {
        return isHighlighted;
    }
}
