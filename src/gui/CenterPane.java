package gui;

import game.Game;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Odin on 2/14/2017.
 */
class CenterPane extends JPanel{

    private DomainView domainView;

    CenterPane(){
        setLayout(new BorderLayout());
        add(domainView = new DomainView());
        setBorder(BorderFactory.createTitledBorder("CenterPane"));
        domainView.setVisible(true);
        setVisible(true);
    }

    public void setGame(String game) {
        domainView.setGame(game);
    }
}

