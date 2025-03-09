package Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DeqeueDemo {

    public static void main(String[] args) {
        //This is special type of queue.
        //In this queue we can add and delete element from both the end

        Deque<Integer> dq = new ArrayDeque<>(); //this is better. Faster Iteration .Low Memory
        dq.addFirst(45);
        dq.addLast(50);
        dq.offerFirst(23);
        dq.offerLast(34);

        System.out.println(dq);
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());
        System.out.println(dq.pollLast());
        System.out.println(dq.remove());


        Deque<Integer> dqq = new LinkedList<>(); //for quick insertion only this is best


    }
}
