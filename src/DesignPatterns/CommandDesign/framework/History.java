package DesignPatterns.CommandDesign.framework;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {
    Deque<UnDoableCommand> commands = new ArrayDeque<>();
    public void push(UnDoableCommand cmd){
        commands.push(cmd);
    }

    public UnDoableCommand pop(){
       return commands.pop();
    }

    public boolean isEmpty(){
        return commands.size()==0;
    }
}
