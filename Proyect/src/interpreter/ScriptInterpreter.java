package interpreter;

import model.ScriptStack;

import java.util.List;
import opcodes.OpCode;

public class ScriptInterpreter {

    private ScriptStack stack = new ScriptStack();

    public boolean execute(List<OpCode> script) {

        try {
            for (OpCode op : script) {
                op.execute(stack);
                stack.printStack();
            }

            return !stack.isEmpty() && !stack.pop().equals("0");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
}
