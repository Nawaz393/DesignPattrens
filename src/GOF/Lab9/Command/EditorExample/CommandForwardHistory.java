package GOF.Lab9.Command.EditorExample;

import java.util.Stack;

public class CommandForwardHistory {

    CommandHistory commandHistory;
    public CommandForwardHistory(CommandHistory commandHistory) {
        this.commandHistory = commandHistory;

    }

    private Stack<Command> history = new Stack<>();

    public void push(Command c) {
        
        history.push(c);
    }

    public Command pop() {
        return history.pop();
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }

}
