package gui.controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by Odin on 3/30/2017.
 */
public class ShortcutListener implements KeyListener {

    private ShortCuts shortcuts = new ShortCuts();

    @Override
    public void keyTyped(KeyEvent e) {/*not used*/}

    @Override
    public void keyPressed(KeyEvent e) {
        //CTRL+Z
        if (e.isControlDown() && !e.isShiftDown() && e.getKeyCode() == KeyEvent.VK_Z) {
                shortcuts.getShortcut("undo").run();
        }
        //CTRL+SHIFT+Z
        if (e.isControlDown() && e.isShiftDown() && e.getKeyCode() == KeyEvent.VK_Z) {
                shortcuts.getShortcut("redo").run();
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {/*not used*/}
}
