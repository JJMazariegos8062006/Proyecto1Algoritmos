package opcodes;

import model.ScriptStack;

public class OpDup implements OpCode {

    @Override
    public void execute(ScriptStack stack) {
        stack.push(stack.peek());
    }
}