package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

//        Node node1 = new Node();
//        Node node2 = new Node();
//
//        node1.value = 1;
//        node1.next = node2;
//        node2.value = 2;
//        node2.next = null;


        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.remove(); //removes first inserted element
        ll.add(4);
        ll.addFirst(1);
        ll.addLast(5);
        int ans = ll.get(2);
        System.out.println(ans);
        System.out.println(ll);


    }

}


//No necessary of doing this as java as special class called Linked List

//class Node{
//
//    public int value;
//
//    public Node next;
//
//}
