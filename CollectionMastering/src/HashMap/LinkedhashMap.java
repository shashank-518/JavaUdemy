package HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedhashMap {

    public static void main(String[] args) {

        LinkedHashMap<String,Integer> link = new LinkedHashMap<>();
        HashMap<String,Integer> map = new HashMap<>();

        map.put("Apples", 10);
        map.put("Mango",20);
        map.put("Watermelon",80);

        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " :  " + entry.getValue());
        }

    }
}
