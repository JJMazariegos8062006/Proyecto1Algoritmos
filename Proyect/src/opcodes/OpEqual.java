package opcodes;

import model.ScriptStack;
/**
 * Operación OP_EQUAL.
 * Compara los dos elementos superiores de la pila.
 * Si son iguales empuja true, si no empuja false.
 */
public class OpEqual implements OpCode {

    @Override
    public void execute(ScriptStack stack) {
        String a = stack.pop();
        String b = stack.pop();
        stack.push(a.equals(b) ? "1" : "0");
    }
}
