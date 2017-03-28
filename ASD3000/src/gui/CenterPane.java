package gui;

import gui.domain.abstractObjects.Piece;
import gui.domain.concreteObjects.Tile;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Odin on 2/14/2017.
 */
public class CenterPane extends JPanel{

    private DomainView domainView;

    CenterPane(){
        setLayout(new BorderLayout());
        add(domainView = new DomainView());
        setBorder(BorderFactory.createTitledBorder("CenterPane"));
        domainView.setVisible(true);
        setVisible(true);
    }

}

