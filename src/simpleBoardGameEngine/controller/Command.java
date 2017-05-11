package simpleBoardGameEngine.controller;

/**
 * Created by Odin on 3/1/2017.
 * Unless it is poorly made, then it must
 * have been someone else.
 */
interface Command {
    void execute();
    void undo();
}
