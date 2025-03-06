package HashMap;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class Identityhash {

    public static void main(String[] args) {

        /*
        Map<String, Integer> map1 = new HashMap<>();

        map1.put("key1", 1);
        map1.put("key1", 2);

        System.out.println(map1);

        This Code return the output of {key1=2}


        Normal HashMap uses equals function it checks the content inside the object and returns the code

        Identity hashmap uses == operator to compare and generates the hashcode if we pass two different object
        with same value inside it will return different


         */

        // If we use IdentityHashMap then we will get two objects or entries in hashmap

        Map<String, Integer> map1 = new IdentityHashMap<>();

        String key1 = new String("key1");
        String key2 = new String("key1");


        map1.put(key1, 1);
        map1.put(key2, 2);

        System.out.println(map1);

    }

}
