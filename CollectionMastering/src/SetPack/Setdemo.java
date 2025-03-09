package SetPack;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Setdemo {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(109);
        set.add(159);
        set.add(169);
        set.add(179);
        set.add(189);
        set.add(56);
        set.add(23);
//        set.add(56);


        Set<Integer> set2 = new LinkedHashSet<>();
        set2.add(1);
        set2.add(109);
        set2.add(159);
        set2.add(169);
        set2.add(179);
        set2.add(189);
        set2.add(56);
        set2.add(23);

        System.out.println(set2);


        Set<Integer> set3 = new TreeSet<>();
        set3.add(1);
        set3.add(109);
        set3.add(159);
        set3.add(169);
        set3.add(179);
        set3.add(189);
        set3.add(56);
        set3.add(23);

        System.out.println(set3);

    }

}

/*

Set is a Collection Framework which extends Collection

The major Four types of Set is :

1. HashSet ---> No Duplicates – It only stores unique elements.
Unordered Collection – Elements are not stored in any specific order.
Fast Operations – add(), remove(), and contains() typically run in O(1) time.
Allows null Values (only one null in Java).
Backed by Hash Table

2. LinkedHashSet ----> Maintains Insertion Order – Unlike HashSet, it preserves the order in which elements were added.
No Duplicates – Like HashSet, it stores only unique elements.
Faster than TreeSet – It provides O(1) time complexity for add, remove, and contains operations.
Uses Hash Table + Doubly Linked List – This ensures ordering and uniqueness.
Allows null Values – Can store at most one null.

3. TreeSet ---> Maintains Sorted Order – Automatically sorts elements in ascending order (by default).
No Duplicates – Only unique elements are allowed.
Logarithmic Time Complexity – Operations like add(), remove(), and contains() take O(log n) time.
Implements NavigableSet & SortedSet – Provides extra methods for range-based operations.
Does Not Allow null Values – Unlike HashSet or LinkedHashSet, TreeSet does not permit null


4. Enum Set ---> Works Only with Enums – Cannot store non-enum elements.
Faster than HashSet – Internally uses bit vectors, making operations extremely efficient (O(1)).
Compact Memory Usage – Stores elements in a bit-wise manner.
Maintains Enum Order – Orders elements based on the natural order of Enum constants (as declared).
No Null Values Allowed – Adding null throws NullPointerException.




 */
