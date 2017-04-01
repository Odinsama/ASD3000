package gui.domain.concreteObjects.checkers;

import game.logic.checkers.MenLogic;
import gui.domain.abstractObjects.Piece;

import java.awt.*;

/**
 * Created by Odin on 4/1/2017.
 */
class Men extends Piece {
    Men(boolean isNorth) {
        super(isNorth);
        moveLogic = new MenLogic(this);

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.black);
        g.fillOval(getWidth()/8,getHeight()/100+getHeight()/10,6*getWidth()/8,getHeight()*9/10);
        g.setColor(isNorth() ? Color.red : Color.white);
        g.fillOval(getWidth()/8,getHeight()/100,6*getWidth()/8,getHeight()*9/10);
    }
}
