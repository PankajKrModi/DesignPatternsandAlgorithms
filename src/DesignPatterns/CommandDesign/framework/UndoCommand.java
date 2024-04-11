package DesignPatterns.CommandDesign.framework;

public class UndoCommand implements Command{
    History history;

    public UndoCommand(History history) {
        this.history = history;
    }

    @Override
    public void execute() {
        if(!history.isEmpty()){
            history.pop().undo();
        }

    }
}
