package interpreter;

import java.util.*;

import opcodes.*;

public class ScriptInterpreter {

    private Deque<String> stack = new ArrayDeque<>();
    private boolean trace;

    public ScriptInterpreter(boolean trace) {
        this.trace = trace;
    }

    public boolean execute(List<Object> script) {

        for (Object element : script) {

            if (element instanceof String) {

                stack.push((String) element);

            } else if (element instanceof BasicOpCode) {

                BasicOpCode op = (BasicOpCode) element;

                boolean result = op.execute(stack);

                if (!result) {
                    return false;
                }
            }

            if (trace) {
                System.out.println("Stack: " + stack);
            }
        }

        if (stack.isEmpty()) {
            return false;
        }

        return !stack.peek().equals("0");
    }
}