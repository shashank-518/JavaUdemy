package HashMap;

import java.util.NavigableMap;
import java.util.TreeMap;

public class Navigate {

    public static void main(String[] args) {


        NavigableMap<Integer,String> navi = new TreeMap<>();

        navi.put(1,"Ones");
        navi.put(5,"Two");
        navi.put(3,"Three");

        System.out.println(navi);
        System.out.println(navi.lowerKey(4));
        System.out.println(navi.floorKey(5));

        System.out.println(navi.ceilingKey(5));

    }

}
