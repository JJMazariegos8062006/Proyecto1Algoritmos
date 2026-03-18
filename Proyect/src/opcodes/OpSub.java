package opcodes;

import java.util.Deque;
/**
 * Operación aritmética sobre la pila.
 * Toma los valores superiores, realiza la operación
 * y guarda el resultado en la pila.
 */
public class OpSub implements BasicOpCode {

    @Override
    public boolean execute(Deque<String> stack) {

        if (stack.size() < 2) {
            return false;
        }

        int a = Integer.parseInt(stack.pop());
        int b = Integer.parseInt(stack.pop());

        stack.push(String.valueOf(b - a));

        return true;
    }
}
