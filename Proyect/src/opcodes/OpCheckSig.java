package opcodes;

import model.ScriptStack;
import crypto.MockCrypto;
/**
 * Operación OP_CHECKSIG.
 * Verifica si una firma corresponde a una clave pública
 * usando la clase MockCrypto.
 */
public class OpCheckSig implements OpCode {

    @Override
    public void execute(ScriptStack stack) {
        String pubKey = stack.pop();
        String sig = stack.pop();

        stack.push(MockCrypto.checkSig(sig, pubKey) ? "1" : "0");
    }
}