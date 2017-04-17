package gui.domain.concreteObjects.checkers;

import game.logic.checkers.MenLogic;
import gui.domain.abstractObjects.Piece;
import gui.domain.utils.IPromotable;

import java.awt.*;

/**
 * Created by Odin on 4/1/2017.
 */
public class Men extends Piece implements IPromotable {

    private boolean isKing = false;

    Men(boolean isNorth) {
        super(isNorth);
        moveLogicList.add(new MenLogic(this));

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.black);
        g.fillOval(getWidth()/8,getHeight()/100+getHeight()/10,6*getWidth()/8,getHeight()*9/10);
        g.setColor(isNorth() ? (isKing ? new Color(255,215,0) : Color.red)
                : (isKing ? new Color(192,192,192) : Color.white));
        g.fillOval(getWidth()/8,getHeight()/100,6*getWidth()/8,getHeight()*9/10);
    }

    public void promote(){
        isKing = true;
        repaint();
    }

    public boolean isKing() {
        return isKing;
    }
}
