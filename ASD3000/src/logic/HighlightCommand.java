package game;

import gui.domain.concreteObjects.Tile;

/**
 * Created by Odin on 3/3/2017.
 */
public class HighlightCommand implements Command {

    private final Tile tile;

    public HighlightCommand(Tile tile){
        this.tile = tile;
    }

    @Override
    public void execute() {
        tile.highlight(Color.CYAN);
    }

    @Override
    public void undo() {
        tile.removeHighlight();
    }
}
