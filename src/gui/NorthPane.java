package gui;

import game.GameController;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Odin on 2/14/2017.
 */
public class NorthPane extends JMenuBar{

    NorthPane(){
        JMenu jmenu = new JMenu("Actions");
        JMenuItem undo = new JMenuItem("Undo Move");
        undo.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                GameController.undoMove();
            }
        });
        JMenuItem redo = new JMenuItem("Redo Move");
        redo.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                GameController.redoMove();
            }
        });
        jmenu.add(undo);
        jmenu.add(redo);
        add(jmenu);
        setVisible(true);
    }

}
