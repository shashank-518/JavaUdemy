package Vector;

import java.util.Vector;

public class Test {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(5 , 4);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        System.out.println(vector.capacity());

        vector.add(1);
        System.out.println(vector.capacity());



    }
}


/*

It is similar to that of array list but the only thing is it is synchronized
It has all the similar method such as add remove get

It has the capacity method which will display the initial capacity of a Vector
We can pass two arguments while creating a vector that is initialCapacity and CapacityIncrement

In Array List we saw that once the initialCapacity is full it increment by 1.5 times But in Vector it doubles by
Default.

By default, the capacity is 10


 */