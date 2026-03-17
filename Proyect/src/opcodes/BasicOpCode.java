package opcodes;

import java.util.Deque;

public interface BasicOpCode {

    boolean execute(Deque<String> stack);

}
