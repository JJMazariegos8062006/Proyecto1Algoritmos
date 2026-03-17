package opcodes;

import java.util.Deque;

public class OpEqualVerify implements BasicOpCode {

    @Override
    public boolean execute(Deque<String> stack) {

        if (stack.size() < 2) {
            return false;
        }

        String a = stack.pop();
        String b = stack.pop();

        if (!a.equals(b)) {
            return false;
        }

        return true;
    }
}
