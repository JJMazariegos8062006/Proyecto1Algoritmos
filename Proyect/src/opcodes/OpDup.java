package opcodes;

import java.util.Deque;

public class OpDup implements BasicOpCode {

    @Override
    public boolean execute(Deque<String> stack) {

        if (stack.isEmpty()) {
            return false;
        }

        String top = stack.peek();
        stack.push(top);

        return true;
    }
}
