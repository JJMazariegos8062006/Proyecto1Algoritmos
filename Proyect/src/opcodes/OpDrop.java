package opcodes;

import java.util.Deque;
/**
 * Elimina el elemento superior de la pila.
 */
public class OpDrop implements BasicOpCode {

    @Override
    public boolean execute(Deque<String> stack) {

        if (stack.isEmpty()) {
            return false;
        }

        stack.pop();
        return true;
    }
}
