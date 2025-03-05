package CopyOnWriteArray;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayDemo {

    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> CopyArray = new CopyOnWriteArrayList<>();

        CopyArray.add(24);
        CopyArray.add(45);
        CopyArray.add(67);
        CopyArray.add(23);

        for (Integer i : CopyArray){

            if(i == 67){
                CopyArray.add(56);
            }
            System.out.println(i);
        }

        System.out.println("Updated Array List is " + CopyArray);

        // Iterating using enhanced for loop
//        for (Map.Entry<String, Integer> e : ht.entrySet())
//            System.out.println(e.getKey() + " " + e.getValue());

    }

}

/*

It is similar to array List Only difference is that it when we are writing a copy of the array list is made.

It is first updated in the copy Then to that original Array List

It is not possible in normal Array List

In Normal Array List If you are trying to fetch the element and in between if you try to insert
this will throw you a concurrence error or exception


for (Integer i : CopyArray){

            if(i == 67){
                CopyArray.add(56);
            }
            System.out.println(i);
        }

 If you try this using Array List this code will throw an error


 */
