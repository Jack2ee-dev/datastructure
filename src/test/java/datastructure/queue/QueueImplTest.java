package datastructure.queue;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class QueueImplTest {

    @Test
    void enque_테스트() {
        // given
        QueueImpl queue = new QueueImpl();

        // when
        queue.enqueue(1);
        List<Integer> listQueue = new ArrayList<>(queue.queue());

        // then
        assertEquals(listQueue.get(0), 1);
    }

    @Test
    void deque_테스트() {
        // given
        QueueImpl queue = new QueueImpl();

        // when1

        // then1
        assertThrows(NullPointerException.class, queue::dequeue);

        // when2
        queue.enqueue(1);

        // then2
        assertEquals(queue.dequeue(), 1);
    }

    @Test
    void peek_테스트() {
        // given
        QueueImpl queue = new QueueImpl();

        // when1

        // then1
        assertThrows(NullPointerException.class, queue::peek);

        // when2
        queue.enqueue(1);

        // then2
        assertEquals(queue.peek(), 1);
        assertEquals(queue.length(), 1);
    }
}
