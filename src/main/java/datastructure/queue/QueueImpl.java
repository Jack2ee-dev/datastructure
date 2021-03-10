package datastructure.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueImpl {

    private final Queue<Integer> queue = new LinkedList<>();

    public QueueImpl() {
    }

    public boolean enqueue(int intValue) {
        return this.queue.offer(intValue);
    }

    public int dequeue() throws NullPointerException {
        if (this.queue.isEmpty()) {
            throw new NullPointerException("dequeue할 데이터가 없습니다.");
        }
        return this.queue.poll();
    }

    public int peek() throws NullPointerException {
        if (this.queue.isEmpty()) {
            throw new NullPointerException("큐가 비었습니다.");
        }
        return this.queue.peek();
    }

    public Queue<Integer> queue() {
        return this.queue;
    }

    public int length() {
        return this.queue.size();
    }
}
