package DesignPatterns.CommandDesign;

import DesignPatterns.CommandDesign.framework.History;
import DesignPatterns.CommandDesign.framework.UndoCommand;

public class Main {
    public static void main(String[] args) {
        Document document = new Document();
        document.setData("Hello World");
        History history = new History();
        BoldCommand cmd = new BoldCommand(document, history);
        cmd.execute();
        System.out.println(document.getData());

        UndoCommand undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(document.getData());
//        cmd.undo();
//        System.out.println(document.getData());
    }


}
