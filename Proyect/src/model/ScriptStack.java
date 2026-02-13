package model;

import java.util.ArrayDeque;
import java.util.Deque;

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

