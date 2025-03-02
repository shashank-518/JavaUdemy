package ArrayList;

import java.util.*;

class CompareLength implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}

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


//        List<String> l1 = Arrays.asList("Monday","Tuesday","Wednesday");
//        l1.add("Thrusday"); this is wrong as we cannot add or delete
//
//        l1.set(2,"Thursday");
//        System.out.println(l1);
//
//        List<String> l2 = List.of("Shashank","Shashu","Shreyas");
//        l2.set(2,"SHashu"); This is not possible
//        System.out.println(l2);


//        String[] fruits = {"Apple","mango","Banana"};
//        List<String> list2 = Arrays.asList(fruits);
//        System.out.println(list2.getClass().getName());
//
//        List <String> list3 = new ArrayList<>(list2);
//        System.out.println(list3.getClass().getName());
//        list3.add("Cherry");
//        System.out.println(list3);


        List <Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(20);
        l1.add(34);
        l1.add(4);

        List<String> list2 = List.of("Apple" , "Mangoes", "Date");

        List<String> l3 = new ArrayList<>(list2);
//        l3.add("apple");
//        l3.add("mangoes");
//        l3.add("date");
//
        l3.sort(new CompareLength());

        System.out.println(l3);


//        Collections.sort(l1);

//        l1.sort(new compareDecrement());
//
//        System.out.println(l1);




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
