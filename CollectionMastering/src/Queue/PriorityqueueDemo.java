package Queue;

import java.util.PriorityQueue;

public class PriorityqueueDemo {
    public static void main(String[] args) {
        //This queue implements the queue interface
        //This orders element based on their natural ordering(ascending by default)
        //We can use custom comparator for customized ordering
        //does not allow null element


        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(15);
        pq.add(30);
        pq.add(23);
        pq.add(5);

        while(!pq.isEmpty()){
          System.out.println(pq.poll());
        }

        /*

        Internal Working Of PriorityQueue

        It is implemented as min-heap by default.

        Min-heap is a kind of binary tree where the smallest element is the root node
        The Time Complexity is log(n)


         */

    }
}
