package datastructure.stack;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

public class StackImplTest {

    @Test
    void push_테스트() {
        // given
        StackImpl stack = new StackImpl();

        // when
        stack.push(1);
        stack.push(2);
        List<Integer> stackList = new ArrayList<>(stack.stack());

        // then
        assertEquals(stackList.get(0), 1);
        assertEquals(stackList.get(1), 2);
    }

    @Test
    void pop_테스트() {
        // given
        StackImpl stack = new StackImpl();

        // when1

        // then1
        assertThrows(NullPointerException.class, stack::pop);

        // when2
        stack.push(1);

        // then2
        assertEquals(stack.pop(), 1);
    }

    @Test
    void peek_테스트() {
        // given
        StackImpl stack = new StackImpl();

        // when1

        // then1
        assertThrows(NullPointerException.class, stack::peek);

        // when2
        stack.push(1);
        stack.push(2);
        List<Integer> stackList = new ArrayList<>(stack.stack());

        // then2
        assertEquals(stackList.get(1), stack.peek());
    }
}
