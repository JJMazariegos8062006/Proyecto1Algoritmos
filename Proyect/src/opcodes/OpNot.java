package opcodes;

import java.util.Deque;

public class OpNot implements BasicOpCode {

    @Override
    public boolean execute(Deque<String> stack) {

        if (stack.isEmpty()) {
            return false;
        }

        String value = stack.pop();

        if (value.equals("0")) {
            stack.push("1");
        } else {
            stack.push("0");
        }

        return true;
    }
}
