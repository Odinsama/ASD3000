package game.controller;

/**
 * Created by Odin on 4/3/2017.
 */
public class SkipCaptureCommand implements Command {

    private final MoveCommand moveCommand;
    private final CaptureCommand captureCommand;

    public SkipCaptureCommand(MoveCommand moveCommand, CaptureCommand captureCommand){
        this.moveCommand = moveCommand;
        this.captureCommand = captureCommand;
    }

    @Override
    public void execute() {
        captureCommand.execute();
        moveCommand.execute();
    }

    @Override
    public void undo() {
        moveCommand.undo();
        captureCommand.undo();
    }
}
