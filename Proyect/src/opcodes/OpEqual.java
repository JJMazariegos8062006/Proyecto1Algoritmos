package opcodes;

import model.ScriptStack;

public class OpEqual implements OpCode {

    @Override
    public void execute(ScriptStack stack) {
        String a = stack.pop();
        String b = stack.pop();
        stack.push(a.equals(b) ? "1" : "0");
    }
}
