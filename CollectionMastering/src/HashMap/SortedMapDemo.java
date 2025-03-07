package HashMap;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo  {

    public static void main(String[] args) {
        SortedMap<String,Integer> map = new TreeMap<>();

        map.put("Shashank",99);
        map.put("Mizba",98);
        map.put("Ramu",22);
        map.put("Vipul",25);
        System.out.println(map);

        System.out.println(map.firstKey());
        System.out.println(map.lastKey());

    }

}



/*

SortedMap will sort based on naturalOrdering based on key

The purpose of using Sorted Map is because we have many additional function



 */