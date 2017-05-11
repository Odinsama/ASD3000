package simpleBoardGameEngine.controller;

/**
 * Created by Odin on 4/3/2017.
 * Unless it is poorly made, then it must
 * have been someone else.
 */
class SkipCaptureCommand implements Command {

    private final MoveCommand moveCommand;
    private final CaptureCommand captureCommand;

    SkipCaptureCommand(MoveCommand moveCommand, CaptureCommand captureCommand){
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
