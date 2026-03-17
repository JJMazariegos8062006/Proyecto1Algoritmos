package opcodes;

import java.util.Deque;

public class OpBoolAnd implements BasicOpCode {

    @Override
    public boolean execute(Deque<String> stack) {

        if (stack.size() < 2) {
            return false;
        }

        int a = Integer.parseInt(stack.pop());
        int b = Integer.parseInt(stack.pop());

        if (a != 0 && b != 0) {
            stack.push("1");
        } else {
            stack.push("0");
        }

        return true;
    }
}