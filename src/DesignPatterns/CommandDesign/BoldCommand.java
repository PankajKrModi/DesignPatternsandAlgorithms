package DesignPatterns.CommandDesign;

import DesignPatterns.CommandDesign.framework.History;
import DesignPatterns.CommandDesign.framework.UnDoableCommand;

public class BoldCommand implements UnDoableCommand {
    Document document;
    String prevData;
    History history;

    public BoldCommand(Document document, History history) {
        this.document = document;
        this.history = history;
    }

    @Override
    public void execute() {
        prevData = document.getData();
        document.makeBold();
        history.push(this);
    }

    @Override
    public void undo() {
        document.setData(prevData);
    }
}
