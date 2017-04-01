package gui;

import game.GameController;
import game.ChessGame;
import gui.controller.GUIController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Odin on 2/14/2017.
 */
class NorthPane extends JMenuBar{

    NorthPane(){
        JMenu actions = new JMenu("Actions");
        JMenu games = new JMenu("Games");
        JMenuItem chess = new JMenuItem("Chess");
        chess.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUIController.setGame(new ChessGame());
            }
        });
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
        actions.add(undo);
        actions.add(redo);
        add(actions);
        games.add(chess);
        add(games);
        setVisible(true);
    }

}
