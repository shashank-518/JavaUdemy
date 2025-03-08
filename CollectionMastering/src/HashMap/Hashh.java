package HashMap;

import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

public class Hashh {

    public static void main(String[] args) {
        Hashtable<Integer,String> mapp = new Hashtable<>();

        mapp.put(1,"Shashank");
        mapp.put(2,"Sahana");
        mapp.put(3,"Mizba");

        System.out.println(mapp);

        /*

            This is class that implements map in background

            The only difference is it is synchronized

            means if we use thread after one process take place at time and go to another process

            other map is not synchronized


         */


        ConcurrentHashMap<Integer,String> map2 = new ConcurrentHashMap<>();

        /*

        In JAVA 7 :
            segment based locking ---> 16 segment by default ---> smallHashmaps
            Only the segment to be written is being read

        IN JAVA 8:
            No segmentation .
            We use Compare and swap
            no locking except resizing and collision
            Thread A last saw 45
            Thread A set x -> 50
            If X is still 45 then change to 50 or else don't change retry


         */


    }

}
