package opcodes;

import java.util.Deque;

public class OpSwap implements BasicOpCode {

    @Override
    public boolean execute(Deque<String> stack) {

        if (stack.size() < 2) {
            return false;
        }

        String first = stack.pop();
        String second = stack.pop();

        stack.push(first);
        stack.push(second);

        return true;
    }
}
