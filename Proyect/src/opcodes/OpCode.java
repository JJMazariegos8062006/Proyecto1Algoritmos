package opcodes;

import model.ScriptStack;

public interface OpCode {
    void execute(ScriptStack stack);
}