package opcodes;

import model.ScriptStack;
/**
 * Operación OP_DUP.
 * Duplica el elemento que está en la cima de la pila.
 */
public class OpDup implements OpCode {

    @Override
    public void execute(ScriptStack stack) {
        stack.push(stack.peek());
    }
}