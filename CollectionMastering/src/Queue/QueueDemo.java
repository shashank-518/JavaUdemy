package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {


        //Linked List as queue
        LinkedList<Integer> queue = new LinkedList<>();

        queue.addLast(1);
        queue.addLast(2);
        queue.addLast(3);
        queue.addLast(4);

        System.out.println(queue);

        queue.removeFirst();
        queue.removeFirst();

        System.out.println(queue);

        Queue<Integer> q = new LinkedList<>();

        q.add(90);
        q.add(91);
        q.add(92); //enqueue
        q.add(93);

        System.out.println(q);

        q.remove(); //dequeue

        System.out.println(q) ;



    }

}


/*

    Queue ----> FIFO [First In First Out]
    Stack ----> LIFO [Last In First Out]

    In Java, we can use LinkedList as stack as well as Queue.

    In Queue we have following method :

    enqueue --->  adding into queue . offer method is same as enqueue
    dequeue ----> removing element from queue . poll method is same as dequeue.
    peek -----> it is used to see top element in queue. Element is also method as peek



 */