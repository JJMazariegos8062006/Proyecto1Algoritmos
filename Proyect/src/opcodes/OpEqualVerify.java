package opcodes;

import model.ScriptStack;
/**
 * Operación OP_EQUALVERIFY.
 * Compara los dos elementos superiores de la pila.
 * Si no son iguales, la ejecución falla.
 */
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