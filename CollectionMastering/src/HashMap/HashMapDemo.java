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




    }

}
