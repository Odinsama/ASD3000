package usecaseGUI;

import simpleBoardGameEngine.controller.GameController;
import usecaseGUI.controller.GUIController;

import javax.swing.*;

/**
 * Created by Odin on 2/14/2017.
 * Unless it is poorly made, then it must
 * have been someone else.
 */
class NorthPane extends JMenuBar{

    NorthPane(){

        JMenu actions = new JMenu("Actions");
        JMenuItem undo = new JMenuItem("Undo Move");
        JMenuItem redo = new JMenuItem("Redo Move");
        JMenuItem reset = new JMenuItem("Reset Board");
        undo.addActionListener(e -> GameController.undoMove());
        redo.addActionListener(e -> GameController.redoMove());
        reset.addActionListener(e -> GameController.resetBoard());
        actions.add(undo);
        actions.add(redo);
        actions.add(reset);
        add(actions);

        JMenu games = new JMenu("Games");
        JMenuItem checkers = new JMenuItem("Checkers");
        JMenuItem chess = new JMenuItem("Chess");
        JMenuItem shogi = new JMenuItem("Shogi");
        chess.addActionListener(e -> GUIController.setGame("chess"));
        checkers.addActionListener(e -> GUIController.setGame("checkers"));
        shogi.addActionListener(e -> GUIController.setGame("logic"));
        games.add(chess);
        games.add(checkers);
        games.add(shogi);
        add(games);

        setVisible(true);
    }

}
