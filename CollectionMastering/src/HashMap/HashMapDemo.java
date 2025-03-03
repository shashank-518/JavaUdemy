package HashMap;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {


        HashMap<Integer , String> map = new HashMap<>();

        map.put(1,"Shashank");
        map.put(2,"shashu");
        map.put(3,"Shreyas");

        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("Shashank"));
        System.out.println(map);

        for(int i : map.keySet()){
            System.out.println(map.get(i));
        }

        boolean ans = map.containsKey(22);
        System.out.println(ans);

        map.remove(3);
        System.out.println(map);

        map.put(3 , "Shreyas");
        map.put(3,"Shekar");

        // The above code will replace the value @ key 3
        System.out.println(map);

        //There are two types of remove method

        map.remove(3);
        //This is normal with the key

        map.remove(4,"Shashank");
        //This is key with value . Only if both the value matches it will remove.






    }

}


/*

HashMap has Four Components that is :
1.Key
2.Value
3.Bucket -> Internal Array Which Will Store the Key Value Pair
4.Hash Function -> Convert Key Into an Index for storage

Hash Function is an algorithm that takes an input and returns a fixed size number of bytes known as hashcode / hash
Characteristics:
1.Deterministic :- Same Input will give Same Output.
2. Fixed Output Size
3. Efficient Computation : The Hash Function should compute the hash function quickly.

How Data is Stored in hash Map??

Step 1: Hashing the key:-
The key is passed through the algorithm to generate the hash code .The hash code helps to determine the key value pair
in the array

Step 2:




 */
