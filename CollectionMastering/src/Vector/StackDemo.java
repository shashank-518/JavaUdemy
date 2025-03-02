package Vector;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();

        s1.add(1);
        s1.add(2);
        s1.add(3);
        s1.add(4);
        s1.add(5);
        System.out.println(s1);
        s1.pop();

        int peek = s1.peek();
        System.out.println(peek);
        System.out.println(s1);

        System.out.println(s1.contains(3));
        System.out.println(s1.isEmpty());


//        LinkedList as Stack

        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.addFirst(2);
        ll.getLast();
        ll.getFirst();



//        ArrayList as Stack

        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(34);
        l2.add(56);
        l2.addFirst(56);
        l2.getLast();
        l2.get(l2.size()-1);





    }

}


/*

Stack Extends the method of vector so it is synchronized
Stack Follows LIFO that is Last in First Out

It Uses method like push pop and peek
Push is used for pushing the element in to the stack
Pop is used for popping the last element from the stack
peek is used to access or look the top element of the stack

We also have all the vector method like add get set as it extends the vector method




 */