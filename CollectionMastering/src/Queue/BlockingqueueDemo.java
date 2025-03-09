package Queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingqueueDemo {
    public static void main(String[] args) {
        //Thread safe
        // Wait for queue to become non-empty / wait for safe.
//        Thread-safe: It handles synchronization internally.
//        Blocking operations: The take() method waits if the queue is empty, and the put() method waits if the queue is full.
//        Supports multiple implementations: Such as ArrayBlockingQueue, LinkedBlockingQueue, PriorityBlockingQueue, etc.



        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(3);


    }
}
