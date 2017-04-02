package gui.controller;

import game.controller.GameController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Odin on 3/30/2017.
 */
class ShortCuts {

    private Map<String, Runnable> shortcuts = new HashMap<>();

    ShortCuts(){
        shortcuts.put("undo" , GameController::undoMove);
        shortcuts.put("redo", GameController::redoMove);
    }

    Runnable getShortcut(String key) {
        return shortcuts.get(key);
    }
}
