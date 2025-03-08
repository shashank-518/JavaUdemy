package HashMap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmuttableMapDemo {

    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();

        map.put(1,"S");
        map.put(2,"h");

        System.out.println(map);

        Map<Integer,String> map1 = Collections.unmodifiableMap(map);
        //map1.put(3,"t");  Throws an error because this map is unmodifiable

        Map<Integer,String> map4 =  Map.of(3 , "S" , 6 ,"r", 7,"y");

//        map4 is also immutable only disadvantages is that only 10 entry can enter if you want more than use
        // Map.ofEntries method in Map class.








    }

}
