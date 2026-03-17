package opcodes;

import java.util.Deque;

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
