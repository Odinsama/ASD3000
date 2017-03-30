package game;

/**
 * Created by Odin on 3/1/2017.
 */
public interface Command {
    void execute();
    void undo();
}
