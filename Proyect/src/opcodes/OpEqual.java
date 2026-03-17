package opcodes;

import java.util.Deque;

public class OpEqual implements BasicOpCode {

    @Override
    public boolean execute(Deque<String> stack) {

        if (stack.size() < 2) {
            return false;
        }

        String a = stack.pop();
        String b = stack.pop();

        if (a.equals(b)) {
            stack.push("1");
        } else {
            stack.push("0");
        }

        return true;
    }
}
