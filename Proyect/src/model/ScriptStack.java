package model;

import java.util.ArrayDeque;
import java.util.Deque;
/**
 * Representa la pila utilizada por el intérprete.
 *
 * Esta clase encapsula una estructura tipo stack usando ArrayDeque,
 * permitiendo operaciones como push, pop y peek.
 *
 * Es la estructura principal donde se almacenan los datos durante
 * la ejecución del script.
 */
public class ScriptStack {

    private Deque<String> stack = new ArrayDeque<>();

    public void push(String value) {
        stack.push(value);
    }

    public String pop() {
        if (stack.isEmpty()) {
            throw new RuntimeException("Stack vacío");
        }
        return stack.pop();
    }

    public String peek() {
        if (stack.isEmpty()) {
            throw new RuntimeException("Stack vacío");
        }
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void printStack() {
        System.out.println("Stack: " + stack);
    }
}

