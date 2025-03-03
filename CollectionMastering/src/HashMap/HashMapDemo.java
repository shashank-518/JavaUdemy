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
