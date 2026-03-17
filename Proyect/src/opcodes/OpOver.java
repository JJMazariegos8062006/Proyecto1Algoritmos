package opcodes;

import java.util.Deque;
import java.util.Iterator;

public class OpOver implements BasicOpCode {

    @Override
    public boolean execute(Deque<String> stack) {

        if (stack.size() < 2) {
            return false;
        }

        Iterator<String> it = stack.iterator();
        String first = it.next();
        String second = it.next();

        stack.push(second);

        return true;
    }
}
