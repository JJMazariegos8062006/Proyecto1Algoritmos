package opcodes;

import model.ScriptStack;

public class OpEqualVerify implements OpCode {

    @Override
    public void execute(ScriptStack stack) {
        String a = stack.pop();
        String b = stack.pop();

        if (!a.equals(b)) {
            throw new RuntimeException("OP_EQUALVERIFY falló");
        }
    }
}