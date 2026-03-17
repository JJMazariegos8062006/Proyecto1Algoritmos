package opcodes;

import model.ScriptStack;
import crypto.MockCrypto;

public class OpHash160 implements OpCode {

    @Override
    public void execute(ScriptStack stack) {
        String value = stack.pop();
        stack.push(MockCrypto.hash160(value));
    }
}