package datastructure.stack;

import java.util.Stack;

public class StackImpl {
    private final Stack<Integer> stack = new Stack<>();

    public Stack<Integer> stack() {
        return this.stack;
    }

    public int push(int intValue) {
        return this.stack.push(intValue);
    }

    public int pop() throws NullPointerException {
        if (this.stack.isEmpty()) {
            throw new NullPointerException("스택이 비어서 pop을 실행할 수 없습니다.");
        }
        return this.stack.pop();
    }

    public int peek() throws NullPointerException {
        if (this.stack.isEmpty()) {
            throw new NullPointerException("스택이 비어서 peek을 실행할 수 없습니다.");
        }
        return this.stack.peek();
    }

    public int length() {
        return this.stack.size();
    }
}
