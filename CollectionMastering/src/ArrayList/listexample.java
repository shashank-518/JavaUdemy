package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class listexample {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(90);

//        System.out.println(list.get(2));
//        System.out.println(list.size());
//
//        for(int i =0 ; i< list.size(); i++){
//            System.out.println(i);
//        }

//        list.add(2,70);
//          list.set(2,50);
//
//        for(int x: list){
//            System.out.println(x);
//        }


        List<String> l1 = Arrays.asList("Monday","Tuesday","Wednesday");
//        l1.add("Thrusday"); this is wrong as we cannot add or delete

        l1.set(2,"Thursday");
        System.out.println(l1);

        List<String> l2 = List.of("Shashank","Shashu","Shreyas");
//        l2.set(2,"SHashu"); This is not possible
        System.out.println(l2);



    }
}

/*
Key Notes:
1. Array list default size is 10
2. it stores in array whenever the default is complete 1.5 the capacity is again added
3. If we specify the size in arraylist then we are giving the initial capacity i.e. after that limit array list will be
increases its capacity
4
*/
