package opcodes;

import model.ScriptStack;

public class PushData implements OpCode {

    private String value;

    public PushData(String value) {
        this.value = value;
    }

    @Override
    public void execute(ScriptStack stack) {
        stack.push(value);
    }
}