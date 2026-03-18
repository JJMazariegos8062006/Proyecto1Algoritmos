package opcodes;

import model.ScriptStack;
import crypto.MockCrypto;
/**
 * Operación OP_HASH160.
 * Aplica una función hash al elemento superior de la pila.
 */
public class OpHash160 implements OpCode {

    @Override
    public void execute(ScriptStack stack) {
        String value = stack.pop();
        stack.push(MockCrypto.hash160(value));
    }
}