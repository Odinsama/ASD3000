package usecaseGUI.controller;

import simpleBoardGameEngine.controller.GameController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Odin on 3/30/2017.
 * Unless it is poorly made, then it must
 * have been someone else.
 */
class ShortCuts {

    private final Map<String, Runnable> shortcuts = new HashMap<>();

    ShortCuts(){
        shortcuts.put("undo" , GameController::undoMove);
        shortcuts.put("redo", GameController::redoMove);
    }

    Runnable getShortcut(String key) {
        return shortcuts.get(key);
    }
}
