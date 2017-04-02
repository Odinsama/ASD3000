package gui.domain.concreteObjects.shogi;

import gui.domain.abstractObjects.Piece;

import java.awt.*;

/**
 * Created by Odin on 4/2/2017.
 */
public abstract class ShogiPiece extends Piece {
    private final char[] chars;
    protected ShogiPiece(Boolean isNorth, String pieceName) {
        super(isNorth);
        chars = pieceName.toCharArray();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.black);
        if (!isNorth()) {
            int[] xPoints = {getWidth() / 8, getWidth() / 8 * 2, getWidth() / 2, getWidth() / 8 * 6, getWidth() / 8 * 7};
            int[] yPoints = {getHeight() / 8 * 7, getHeight() / 10 * 3, getHeight() / 10, getHeight() / 10 * 3, getHeight() / 8 * 7};
            g.drawPolygon(xPoints, yPoints, 5);
            g.drawChars(chars, 0, 1, getWidth() / 2 - 5, getHeight() / 3);
            g.drawChars(chars, 1, 1, getWidth() / 2 - 5, getHeight() / 5 * 3);
        }else {
            int[] xPoints = {getWidth()/8*7, getWidth() / 8 * 6, getWidth() / 2, getWidth() / 8 * 2, getWidth() / 8};
            int[] yPoints = {getHeight() / 8, getHeight() / 10 * 7, getHeight() / 10*9, getHeight() / 10 * 7, getHeight() / 8};
            g.drawPolygon(xPoints, yPoints, 5);
            g.drawChars(chars, 0, 1, getWidth() / 2 - 5, getHeight() / 3);
            g.drawChars(chars, 1, 1, getWidth() / 2 - 5, getHeight() / 5 * 3);
        }



    }
}
